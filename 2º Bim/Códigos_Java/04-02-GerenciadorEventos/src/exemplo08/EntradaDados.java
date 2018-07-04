package exemplo08;

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
		
		lrotulo = new JLabel("Digite somente letras:");
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

		public void actionPerformed(ActionEvent evento)	{
			JOptionPane.showMessageDialog(null,"Frase digitada: "+tffrase.getText());
		}
	}

	private class VerificarTipoLetra implements KeyListener {

		boolean backspace;

		public VerificarTipoLetra(){
			backspace = false;
		}

		public void keyTyped(KeyEvent evento) {
			char letra;
			boolean intervalo;

			letra = evento.getKeyChar();

			if (!backspace) {
				intervalo = ( (letra >= 'A') && (letra <= 'Z') ) ||
					    ( (letra >= 'a') && (letra <= 'z') ) ||
					    ( letra == ' ');	

				if (!intervalo) {
					evento.consume();
					JOptionPane.showMessageDialog(null,"Somente letras !!");
				}
			}else{
				//backspace = false;
			}
		}
		
		public void keyPressed(KeyEvent evento) {
			if (evento.getKeyCode() == KeyEvent.VK_BACK_SPACE){
				backspace = true;
			}
		}

		public void keyReleased(KeyEvent evento) {backspace = false;}
	}

}