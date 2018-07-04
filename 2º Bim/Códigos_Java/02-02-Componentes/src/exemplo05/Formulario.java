package exemplo05;

import javax.swing.JFrame;
import javax.swing.JLabel;

import comum.CriadorImageIcon;

public class Formulario extends JFrame{
	JLabel l; 
	public Formulario(){
		l = new JLabel("teste", new CriadorImageIcon().criarImageIcon("duke.png", "duke.png"), 
					JLabel.CENTER); 
		getContentPane().add(l);
		setSize(250,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}