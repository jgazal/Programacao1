package exemplo11;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class Formulario extends JFrame{
	public Formulario (String titulo){
		super(titulo); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize(300,250);

		getContentPane().add(new DadosAgenda(BoxLayout.Y_AXIS)); 
		setVisible(true);
	}
}