package exemplo04;

import javax.swing.JFrame;

public class Formulario extends JFrame {
	public Formulario (String titulo){
		super(titulo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,200);
		
		getContentPane().add(new ControleLayouts());
		setVisible(true);
	}
}