package exemplo06;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Formulario extends JFrame{
	JButton b; 
	public Formulario(){
		b = new JButton("Clique aqui"); 
		getContentPane().add(b); 
		setSize(250,200); 
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}