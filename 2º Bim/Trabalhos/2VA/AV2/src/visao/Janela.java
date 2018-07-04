package visao;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import controle.ControleDinossauro;
import modelo.Dinossauro;
import visao.controle.ControlePainel;
import visao.layout.SpringUtilities;

@SuppressWarnings("serial")
public class Janela extends JFrame implements ActionListener {

	static JPanel cards;
	final static String PAINEL_INICIO = "Inicio";
	final static String PAINEL_CADASTRO = "Cadastro";
	final static String PAINEL_REGISTROS = "Registros";
	private ControlePainel controlePainel;
	
	public Janela() {
		super("Jurassic Park");
		controlePainel = ControlePainel.getInstance();
		setSize(800, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		addComponentToPane(getContentPane());

		pack();
		setVisible(true);
	}

	private void addComponentToPane(Container pane) {

		JPanel painelMenu = new JPanel();
		painelMenu.setLayout(new BoxLayout(painelMenu, BoxLayout.Y_AXIS));
		painelMenu.add(menu());

		JPanel painelInicio = new JPanel();
		painelInicio.setLayout(new BoxLayout(painelInicio, BoxLayout.Y_AXIS));
		painelInicio.add(controlePainel.getTelaInicial());

		JPanel painelCadastro = new JPanel();
		painelCadastro.setLayout(new BoxLayout(painelCadastro, BoxLayout.X_AXIS));
		painelCadastro.add(controlePainel.getTelaCadastro());

		JPanel painelRegistros = new JPanel();
		painelRegistros.setLayout(new SpringLayout());
		painelRegistros.add(controlePainel.getTelaTabela());
		SpringUtilities.makeCompactGrid(painelRegistros, 1, 1, 8, 8, 8, 8);

		cards = new JPanel(new CardLayout());
		cards.add(painelInicio, PAINEL_INICIO);
		cards.add(painelCadastro, PAINEL_CADASTRO);
		cards.add(painelRegistros, PAINEL_REGISTROS);

		pane.add(painelMenu, BorderLayout.WEST);
		pane.add(cards, BorderLayout.CENTER);
	}

	private void configuraBotoesTelaCadastro() {
		TelaCadastro telaCadastro = controlePainel.getTelaCadastro();
		telaCadastro.removerBotoes();
		telaCadastro.inserirBotao("Salvar", acaoSalvarDinossauro());	
		telaCadastro.adicionarBotaocancelar();
	}

	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();

		CardLayout cl = (CardLayout) (cards.getLayout());
		cl.show(cards, comando);

		if (comando.equals("Sair")) {
			System.exit(0);
		}
	}

	public static void cardTelaCadastro() {
		CardLayout cTC = (CardLayout) (cards.getLayout());
		cTC.show(cards, "Cadastro");
	}
	
	public static void cardTelaTabela() {
		CardLayout cTT = (CardLayout) (cards.getLayout());
		cTT.show(cards, "Registros");
	}

	public JMenuBar menu() {
		JMenuBar barraMenu = new JMenuBar();
		barraMenu.setLayout(new BoxLayout(barraMenu, BoxLayout.Y_AXIS));

		Icon icone1 = new ImageIcon("./imagens/dino.png");
		Icon icone2 = new ImageIcon("./imagens/tabela.png");
		Icon icone3 = new ImageIcon("./imagens/sair.png");

		JMenuItem cadastro = new JMenuItem("Cadastro", icone1);
		JMenuItem registros = new JMenuItem("Registros", icone2);
		JMenuItem sair = new JMenuItem("Sair", icone3);

		barraMenu.add(cadastro).setBackground(Color.LIGHT_GRAY);
		barraMenu.add(registros).setBackground(Color.LIGHT_GRAY);
		barraMenu.add(sair).setBackground(Color.LIGHT_GRAY);

		cadastro.addActionListener(new AcaoMenuCadastro());
		registros.addActionListener(this);
		sair.addActionListener(this);
		
		cadastro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(cadastro.isArmed()) {
					cadastro.setBackground(new Color(238, 238, 238));	
					registros.setBackground(Color.LIGHT_GRAY);
					}
				}
			});
		registros.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(registros.isArmed()) {
					registros.setBackground(new Color(238, 238, 238));	
					cadastro.setBackground(Color.LIGHT_GRAY);
					}
				}
			});

		return barraMenu;
	}

	// Ação do botão Salvar
	public ActionListener acaoSalvarDinossauro() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ControleDinossauro controleDinossauro = new ControleDinossauro();
				Dinossauro dinossauro = controlePainel.getTelaCadastro().getDinossauro();
				if (controleDinossauro.validaDinossauro(dinossauro)) {
					controleDinossauro.salvar(dinossauro);
					JOptionPane.showMessageDialog(null, "Informações salvas.");

					TelaTabela.atualizaTabela();

					controlePainel.getTelaCadastro().exibeDadosDinossauro(new Dinossauro());
				}

				System.out.println("Dinossauros cadastrados: " + controleDinossauro.getDinossauros().size());
			}
		};
	}
	
	class AcaoMenuCadastro implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String comando = e.getActionCommand();

			CardLayout cl = (CardLayout) (cards.getLayout());
			cl.show(cards, comando);
			configuraBotoesTelaCadastro();
			controlePainel.getTelaCadastro().exibeDadosDinossauro(new Dinossauro());
		}
	}
}