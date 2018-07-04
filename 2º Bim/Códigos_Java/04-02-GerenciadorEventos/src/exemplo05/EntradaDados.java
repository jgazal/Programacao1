package exemplo05;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EntradaDados extends JPanel {
	JButton bok;
	JLabel lrotulo;
	JTextField tffrase;	

	public EntradaDados() {
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		lrotulo = new JLabel("Digite somente letras:");
		lrotulo.setPreferredSize(new Dimension(400,20));

		tffrase = new JTextField(10);

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


}