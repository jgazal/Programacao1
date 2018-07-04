package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import visao.controle.VisaoControlePrincipal;

public class MenuComum extends JMenuBar {
	private VisaoControlePrincipal visaoControle;
	private JMenu mnuArquivo = null;
	private JMenuItem mnuItemSair = null;
	private JMenuItem mnuItemTela01 = null;
	
	public MenuComum(VisaoControlePrincipal vctrl) {
		this.visaoControle = vctrl;
		this.add(criarMnuArquivo());
	}
	private VisaoControlePrincipal getVisaoControle() {
		return this.visaoControle;
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

	private JMenu getMnuArquivo() {
		return mnuArquivo;
	}
	private JMenuItem getMnuItemSair() {
		return mnuItemSair;
	}
}
