package exemplo07;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EntradaDados extends JPanel {
	JButton bok;
	JLabel lrotulo;
	JTextField tffrase;	

	public EntradaDados(){
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		lrotulo = new JLabel("Digite somente digitos:");
		lrotulo.setPreferredSize(new Dimension(400,20));

		tffrase = new JTextField(10);
		tffrase.addKeyListener(new VerificarTipoLetra());

		bok = new JButton("Ok");
		bok.addActionListener(new ObterTexto());
		
		add(lrotulo);
		add(tffrase);
		add(bok);
	}


	private class ObterTexto implements ActionListener {

		public void actionPerformed(ActionEvent evento){
			JOptionPane.showMessageDialog(null,"Frase digitada: "+tffrase.getText());
		}
	}

	private class VerificarTipoLetra implements KeyListener {

		boolean backspace;

		public VerificarTipoLetra(){
			backspace = false;
		}

		public void keyTyped(KeyEvent evento){
			char letra;
			letra = evento.getKeyChar();

			if (!backspace) {
				if ( (letra < '0') || (letra > '9') ) {
					evento.consume();
					JOptionPane.showMessageDialog(null,"Somente digitos !!");
				}
			}else{
				backspace = false;
			}
		}
		
		public void keyPressed(KeyEvent evento) {
			if (evento.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
				backspace = true;
			}
		}

		public void keyReleased(KeyEvent evento) {}
	}

}