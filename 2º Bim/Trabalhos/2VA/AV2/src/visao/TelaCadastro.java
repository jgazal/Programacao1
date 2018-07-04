package visao;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpringLayout;

import modelo.Dinossauro;
import visao.layout.SpringUtilities;

@SuppressWarnings("serial")
public class TelaCadastro extends JPanel {
	private JTextField tf_nome, tf_nomeCientifico, tf_peso, tf_tamanho;
	private JTextArea ta_descricao;
	private JComboBox<String> cb_periodo, cb_alimentacao;
	private JPanel pn_botoes;

	private String[] Periodo = { "PERÍODO", "Triássico", "Jurássico", "Cretáceo" };
	private String[] Alimentacao = { "ALIMENTAÇÃO", "Carnívoro", "Herbívoro", "Onívoro" };

	public TelaCadastro() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		// Campos de texto
		tf_nome = new JTextField(40);
		tf_nomeCientifico = new JTextField(40);
		tf_peso = new JTextField(40);
		tf_tamanho = new JTextField(40);
		ta_descricao = new JTextArea(10, 20);

		// ComboBox
		cb_periodo = new JComboBox<String>(Periodo);
		cb_periodo.setBounds(10, 70, 320, 20);

		cb_alimentacao = new JComboBox<String>(Alimentacao);
		cb_alimentacao.setBounds(10, 90, 320, 20);

		// Adiciona os rótulos e campos de texto
		JPanel painel = new JPanel();
		painel.setLayout(new SpringLayout());
		SpringUtilities.addComponente(painel, tf_nome, "Nome:");
		SpringUtilities.addComponente(painel, tf_nomeCientifico, "Nome Científico:");

		// Campo de texto Peso aceita somente números
		tf_peso.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent ev) {
				String caracteres = "0987654321.";
				if (!caracteres.contains(ev.getKeyChar() + "")) {
					ev.consume();
				}
			}
		});
		SpringUtilities.addComponente(painel, tf_peso, "Peso (kg):");

		// Campo de texto Tamanho aceita somente números
		tf_tamanho.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent ev) {
				String caracteres = "0987654321.";
				if (!caracteres.contains(ev.getKeyChar() + "")) {
					ev.consume();
				}
			}
		});
		SpringUtilities.addComponente(painel, tf_tamanho, "Tamanho (m):");
		SpringUtilities.makeCompactGrid(painel, 4, 2, 8, 8, 8, 8);
		add(painel);

		// Adiciona os ComboBox
		painel = new JPanel(new SpringLayout());
		SpringUtilities.addComponente(painel, cb_periodo);
		SpringUtilities.addComponente(painel, cb_alimentacao);
		SpringUtilities.makeCompactGrid(painel, 2, 1, 8, 4, 8, 8);
		add(painel);

		// Adiciona o JTextArea
		painel = new JPanel(new BorderLayout());
		painel.add(Box.createVerticalStrut(8), BorderLayout.NORTH);
		painel.add(Box.createVerticalStrut(8), BorderLayout.SOUTH);
		painel.add(Box.createHorizontalStrut(8), BorderLayout.EAST);
		painel.add(Box.createHorizontalStrut(8), BorderLayout.WEST);
		JLabel descricao = new JLabel("Descrição:");
		descricao.setAlignmentX(Component.LEFT_ALIGNMENT);

		JPanel painel2 = new JPanel(new SpringLayout());
		painel2.setAlignmentX(Component.LEFT_ALIGNMENT);
		SpringUtilities.addComponente(painel2, descricao);
		SpringUtilities.makeCompactGrid(painel2, 1, 1, 8, 0, 4, 4);
		painel.add(painel2, BorderLayout.NORTH);

		JScrollPane scrollPane = new JScrollPane(ta_descricao);
		ta_descricao.setLineWrap(true);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		painel.add(scrollPane, BorderLayout.CENTER);
		add(painel);

		pn_botoes = new JPanel(new SpringLayout());
		add(pn_botoes);
	}

	public Dinossauro getDinossauro() {
		Dinossauro dinossauro = new Dinossauro();
		dinossauro.setNome(tf_nome.getText());
		dinossauro.setNome_cientifico(tf_nomeCientifico.getText());

		dinossauro.setPeso(Double.valueOf(tf_peso.getText()));
		dinossauro.setTamanho(Double.valueOf(tf_tamanho.getText()));

		dinossauro.setDescricao(ta_descricao.getText());
		dinossauro.setPeriodo((String) cb_periodo.getSelectedItem());
		dinossauro.setAlimentacao((String) cb_alimentacao.getSelectedItem());
		return dinossauro;
	}

	public void inserirBotao(String label, ActionListener action) {
		JButton botao = new JButton(label);
		botao.addActionListener(action);
		SpringUtilities.addComponente(pn_botoes, botao);
		SpringUtilities.makeCompactGrid(pn_botoes, 1, pn_botoes.getComponentCount(), 8, 4, 8, 8);
	}

	public void adicionarBotaocancelar() {
		JButton botao = new JButton("Cancelar");
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exibeDadosDinossauro(new Dinossauro());

				JOptionPane.showMessageDialog(null, "O conteúdo dos campos foi limpo.");
			}
		});
		SpringUtilities.addComponente(pn_botoes, botao);
		SpringUtilities.makeCompactGrid(pn_botoes, 1, pn_botoes.getComponentCount(), 8, 4, 8, 8);
	}

	public void removerBotoes() {
		pn_botoes.removeAll();
		pn_botoes.updateUI();
	}

	public void exibeDadosDinossauro(Dinossauro dinossauro) {
		try {
			tf_nome.setText(dinossauro.getNome());
			tf_nomeCientifico.setText(dinossauro.getNome_cientifico());
			tf_peso.setText(String.valueOf(dinossauro.getPeso()));
			tf_tamanho.setText(String.valueOf(dinossauro.getTamanho()));
			ta_descricao.setText(dinossauro.getDescricao());

			cb_periodo.setSelectedItem(dinossauro.getPeriodo());
			cb_alimentacao.setSelectedItem(dinossauro.getAlimentacao());
		} catch (Exception e) {
			System.out.println("Erro ao buscar código do dinossauro. Mensagem: " + e.getMessage());
		}
	}
}