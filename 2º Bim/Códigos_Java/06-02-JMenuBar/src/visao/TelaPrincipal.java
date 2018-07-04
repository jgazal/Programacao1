package visao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.WindowConstants;

import visao.controle.VisaoControlePrincipal;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame{
	private VisaoControlePrincipal visaoControle;
	private JMenuBar barraDeMenu = null;
	private JMenu mnuArquivo = null;
	private JMenuItem mnuItemSair = null;
	private JMenuItem mnuItemTela01 = null;
	public TelaPrincipal(VisaoControlePrincipal vctrl) {
		super();
		this.visaoControle = vctrl;
		inicializarTela();
	}
	private void inicializarTela(){
		this.setTitle("Aplicação com menu");
		this.setJMenuBar(this.criarBarraDeMenuPrincipal());
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(800,600);
		//this.setVisible(true);
	}
	private JMenuBar criarBarraDeMenuPrincipal() {
		barraDeMenu = new JMenuBar();
		barraDeMenu.add(criarMnuArquivo());
		return barraDeMenu;
	}
	private JMenu criarMnuArquivo() {
		mnuArquivo = new JMenu();
		mnuArquivo.setText("Arquivo");
		mnuArquivo.add(criarMnuItemTela01());
		mnuArquivo.add(new JSeparator());
		mnuArquivo.add(criarMnuItemSair());
		return mnuArquivo;
	}
	private JMenuItem criarMnuItemSair() {
		mnuItemSair = new JMenuItem();
		mnuItemSair.setText("Sair");
		
		mnuItemSair.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				//Fecha a aplicação
			    System.exit(0);
			}
		});
		return mnuItemSair;
	}
	private JMenuItem criarMnuItemTela01() {
		mnuItemTela01 = new JMenuItem();
		mnuItemTela01.setText("Tela01");
		
		//TODO explicar: Criação e um Action Listener sem criar uma classe
		mnuItemTela01.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				getVisaoControle().exibirTela01();
			}
		});
		return mnuItemTela01;
	}
	private JMenuBar getBarraMenu() {
		return barraDeMenu;
	}
	private JMenu getMnuArquivo() {
		return mnuArquivo;
	}
	private JMenuItem getMnuItemSair() {
		return mnuItemSair;
	}
	public VisaoControlePrincipal getVisaoControle() {
		return visaoControle;
	}
}