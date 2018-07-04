package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.WindowConstants;

import visao.controle.VisaoControlePrincipal;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {
	private VisaoControlePrincipal visaoControle;
	private JMenuBar barraDeMenu = null;

	public TelaPrincipal(VisaoControlePrincipal vctrl) {
		super();
		this.visaoControle = vctrl;
		inicializarTela();
	}

	private void inicializarTela() {
		this.setTitle("Aplicação com menu");
		this.setJMenuBar(this.criarBarraDeMenuPrincipal());
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(800, 600);
		// this.setVisible(true);
	}

	private JMenuBar criarBarraDeMenuPrincipal() {
		MenuComum mc = new MenuComum(getVisaoControle());
		mc.add(criarMenuAjuda());

		return mc;
	}

	private JMenu criarMenuAjuda() {
		JMenu ajuda = new JMenu();
		ajuda.setText("Ajuda");
		ajuda.add(criarMnuSobre());
		return ajuda;
	}

	private JMenuItem criarMnuSobre() {
		JMenuItem sobre = new JMenuItem();
		sobre.setText("Sobre");
		sobre.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Sobre o programa");
			}
		});
		return sobre;
	}

	public VisaoControlePrincipal getVisaoControle() {
		return visaoControle;
	}
}