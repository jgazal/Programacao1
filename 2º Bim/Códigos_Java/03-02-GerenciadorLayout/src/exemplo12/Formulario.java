package exemplo12;

import javax.swing.JFrame;

public class Formulario extends JFrame{
	public Formulario (String titulo){
		super(titulo); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize(550,100);

		getContentPane().add(new DadosAgenda()); 
		
		setVisible(true);
	}
}