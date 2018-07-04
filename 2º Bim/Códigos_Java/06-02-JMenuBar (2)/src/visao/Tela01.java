package visao;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controle.ControleExemplo;
import visao.controle.VisaoControlePrincipal;

public class Tela01 extends JFrame {
	private VisaoControlePrincipal visaoControle;
	private ControleExemplo controleNegocio;
	
	private JTextField txtTeste ;
	

	public Tela01(VisaoControlePrincipal vctrl) {
		this.visaoControle = vctrl;
		inicializarTela();
		controleNegocio = new ControleExemplo();
	}
	private void inicializarTela() {
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		this.setJMenuBar(new MenuComum(getVisaoControle()));
		//só teste
		JLabel label = new JLabel("Digite alguma coisa:");
		txtTeste = new JTextField(20);
		
		JButton voltar = new JButton("Voltar");
		voltar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				getVisaoControle().exibirTelaPrincipal();
			}
		});
		
		JButton btnAcaoControle = new JButton("TesteControle");
		btnAcaoControle.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				fazAlgumaCoisa();
			}
		});
		
		this.add(label);
		this.add(txtTeste);
		this.add(btnAcaoControle);
		this.add(voltar);
		this.addWindowListener(new JanelaListener());
		
		this.pack();
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public void fazAlgumaCoisa() {
		String textoTela = txtTeste.getText();
		String textoRetorno = getControleNegocio().fazAlgumaCoisa(textoTela);
		txtTeste.setText(textoRetorno);
	}
	
	public VisaoControlePrincipal getVisaoControle() {
		return visaoControle;
	}
	public ControleExemplo getControleNegocio() {
		return controleNegocio;
	}
	private class JanelaListener implements WindowListener{

		@Override
		public void windowActivated(WindowEvent e) {		}

		@Override
		public void windowClosed(WindowEvent e) {
			getVisaoControle().exibirTelaPrincipal();
		}

		@Override
		public void windowClosing(WindowEvent e) {		}

		@Override
		public void windowDeactivated(WindowEvent e) {		}


		@Override
		public void windowDeiconified(WindowEvent e){		}

		@Override
		public void windowIconified(WindowEvent e){		}

		@Override
		public void windowOpened(WindowEvent e) {		}	
	}
}
