package exemplo09;

import javax.swing.JFrame;

public class Formulario extends JFrame
{

	public Formulario (String titulo){
		super(titulo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,200);
		
		getContentPane().add(new InformacoesMouse());
		setVisible(true);
	}
}