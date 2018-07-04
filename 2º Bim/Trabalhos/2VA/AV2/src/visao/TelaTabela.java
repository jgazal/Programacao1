package visao;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpringLayout;

import controle.ControleDinossauro;
import modelo.Dinossauro;
import visao.controle.ControlePainel;
import visao.layout.SpringUtilities;

@SuppressWarnings("serial")
public class TelaTabela extends JPanel {
	private ControlePainel controlePainel;
	private static ControleDinossauro dinossauros;
	private static JScrollPane scrollPane;
	static JTable tabelaDinossauros;
	static TelaTabelaModelo modeloTabela;
	JDialog jdialog;
	JLabel l_codigo, l_nome, l_nomeCientifico, l_periodo, l_peso, l_tamanho, l_alimentacao, l_descricao, l_confirmacao;
	JButton b_editar, b_excluir, b_excluirTodos, b_sim, b_nao;

	public TelaTabela(ControlePainel controlePainel) {
		dinossauros = new ControleDinossauro();
		this.controlePainel = controlePainel;
		inicializa();
	}

	public void inicializa() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		scrollPane = new JScrollPane(getTabelaDinossauros());
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

		tabelaDinossauros.getColumnModel().getColumn(0).setPreferredWidth(150);
		tabelaDinossauros.getColumnModel().getColumn(1).setPreferredWidth(200);
		tabelaDinossauros.getColumnModel().getColumn(2).setPreferredWidth(400);
		tabelaDinossauros.getColumnModel().getColumn(3).setPreferredWidth(220);
		tabelaDinossauros.getColumnModel().getColumn(4).setPreferredWidth(120);
		tabelaDinossauros.getColumnModel().getColumn(5).setPreferredWidth(200);
		tabelaDinossauros.getColumnModel().getColumn(6).setPreferredWidth(260);
		tabelaDinossauros.getColumnModel().getColumn(7).setPreferredWidth(200);

		add(scrollPane);

		b_editar = new JButton("Editar");
		b_excluir = new JButton("Excluir");
		b_excluirTodos = new JButton("Excluir Todos");

		JPanel painelBotoes = new JPanel(new SpringLayout());
		SpringUtilities.addComponente(painelBotoes, b_editar);
		SpringUtilities.addComponente(painelBotoes, b_excluir);
		SpringUtilities.addComponente(painelBotoes, b_excluirTodos);
		SpringUtilities.makeCompactGrid(painelBotoes, 1, 3, 8, 4, 8, 8);
		add(painelBotoes);

		// Ação do botão Editar
		b_editar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				int linhaSelecionada = tabelaDinossauros.getSelectedRow();
				
				if(linhaSelecionada == -1) {
					JOptionPane.showMessageDialog(null, "Selecione uma linha.");
				}
				else {
					Janela.cardTelaCadastro();
					
					Dinossauro dinossauro = ControleDinossauro.buscaDinossauro((int) tabelaDinossauros.getValueAt(linhaSelecionada, 0));
					TelaCadastro telaCadastro = controlePainel.getTelaCadastro();
					telaCadastro.exibeDadosDinossauro(dinossauro);
					telaCadastro.removerBotoes();
					telaCadastro.inserirBotao("Salvar", acaoAtualizaDinossauro(dinossauro));	
					telaCadastro.adicionarBotaocancelar();
				}
			}
		});

		// Ação do botão Excluir
		b_excluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int linhaSelecionada = tabelaDinossauros.getSelectedRow();
				
				if(linhaSelecionada == -1) {
					JOptionPane.showMessageDialog(null, "Selecione uma linha.");
				}
				else {
					int codigo = (int) tabelaDinossauros.getValueAt(linhaSelecionada, 0);

					mensagemBotaoExcluir(linhaSelecionada);

					// Ação do botão Sim
					b_sim.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							ControleDinossauro controle = new ControleDinossauro();
							controle.excluir(codigo);

							TelaTabelaModelo tabelaModelo = (TelaTabelaModelo) tabelaDinossauros.getModel();
							tabelaModelo.removeDinossauro(linhaSelecionada);

							jdialog.dispose();

							if (e.getSource() == b_sim) {
								JOptionPane.showMessageDialog(null, "Dinossauro excluido");
							}
						}
					});

					// Ação do botão Não
					b_nao.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							jdialog.dispose();
						}
					});
				}
			}
		});

		// Ação do botão ExcluirTodos
		b_excluirTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int resposta = JOptionPane.showConfirmDialog(scrollPane, "Excluir todos os dinossauros?",
						"Excluir todos", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

				switch (resposta) {
				case JOptionPane.YES_OPTION:
					ControleDinossauro controleDinossauro = new ControleDinossauro();
					controleDinossauro.excluirTodos();

					TelaTabelaModelo tabelaModelo = (TelaTabelaModelo) tabelaDinossauros.getModel();
					tabelaModelo.limpar();

					if (e.getSource() == b_excluirTodos) {
						JOptionPane.showMessageDialog(null, "Tabela de Dinossauros excluída");
					}

					break;

				case JOptionPane.NO_OPTION:
					break;

				case JOptionPane.CLOSED_OPTION:
					break;
				}
			}
		});
	}

	public void mensagemBotaoExcluir(int linhaSelecionada) {
		jdialog = new JDialog(jdialog, "Excluir dinossauro");
		jdialog.setSize(350, 250);

		b_sim = new JButton("Sim");
		b_nao = new JButton("Não");

		l_nome = new JLabel((String) tabelaDinossauros.getValueAt(linhaSelecionada, 1));
		l_nomeCientifico = new JLabel((String) tabelaDinossauros.getValueAt(linhaSelecionada, 2));
		l_periodo = new JLabel((String) tabelaDinossauros.getValueAt(linhaSelecionada, 3));
		
		l_peso = new JLabel(String.valueOf(tabelaDinossauros.getValueAt(linhaSelecionada, 4)));
		l_tamanho = new JLabel(String.valueOf(tabelaDinossauros.getValueAt(linhaSelecionada, 5)));
		
		l_alimentacao = new JLabel((String) tabelaDinossauros.getValueAt(linhaSelecionada, 6));
		l_descricao = new JLabel((String) tabelaDinossauros.getValueAt(linhaSelecionada, 7));

		jdialog.setLayout(new SpringLayout());
		JPanel painel = new JPanel();
		painel.setLayout(new SpringLayout());
		addComponente(painel, l_nome, "Nome:");
		addComponente(painel, l_nomeCientifico, "Nome Científico:");
		addComponente(painel, l_periodo, "Período:");
		addComponente(painel, l_peso, "Peso:");
		addComponente(painel, l_tamanho, "Tamanho:");
		addComponente(painel, l_alimentacao, "Alimentacao:");
		addComponente(painel, l_descricao, "Descrição:");
		SpringUtilities.makeCompactGrid(painel, 7, 2, 50, 8, 8, 3);
		jdialog.add(painel);

		painel = new JPanel(new SpringLayout());
		addComponente(painel, b_sim);
		addComponente(painel, b_nao);
		jdialog.add(painel);
		SpringUtilities.makeCompactGrid(painel, 1, 2, 100, 180, 8, 8);

		jdialog.setLocationRelativeTo(scrollPane);
		jdialog.setVisible(true);
	}

	private void addComponente(JComponent parent, Component componente, String rotulo) {
		JLabel label = new JLabel(rotulo, JLabel.TRAILING);
		parent.add(label);
		label.setLabelFor(componente);
		addComponente(parent, componente);
	}

	private void addComponente(JComponent parent, Component componente) {
		componente.setMaximumSize(new Dimension(6000, 20));
		parent.add(componente);
	}

	static JTable getTabelaDinossauros() {
		tabelaDinossauros = new JTable();
		tabelaDinossauros.setModel(getModeloTabela());
		tabelaDinossauros.setFillsViewportHeight(true);
		return tabelaDinossauros;
	}

	static TelaTabelaModelo getModeloTabela() {
		modeloTabela = new TelaTabelaModelo(dinossauros.getDinossauros());
		return modeloTabela;
	}

	public static void atualizaTabela() {
		tabelaDinossauros.setModel(getModeloTabela());
		tabelaDinossauros.setFillsViewportHeight(true);
		scrollPane.setViewportView(tabelaDinossauros);
	}

	// Ação do botão salvar para atualizar dinossauro
	private ActionListener acaoAtualizaDinossauro(Dinossauro dinossauro) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dinossauro novoDinossauro = controlePainel.getTelaCadastro().getDinossauro();
				ControleDinossauro controleDinossauro = new ControleDinossauro();
				if (controleDinossauro.validaDinossauro(novoDinossauro)) {
					controleDinossauro.atualizar(novoDinossauro, dinossauro.getCodigo());
					JOptionPane.showMessageDialog(null, "Informações atualizadas.");

					TelaTabela.atualizaTabela();

					controlePainel.getTelaCadastro().exibeDadosDinossauro(new Dinossauro());

					Janela.cardTelaTabela();
				}
			}
		};
	}
}