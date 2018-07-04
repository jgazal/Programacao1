package exemplo02;

import javax.swing.JFrame;

public class Formulario extends JFrame {

	public Formulario(String titulo) {
		super(titulo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 100);

		getContentPane().add(new BotoesLayout());
		setVisible(true);
	}
}