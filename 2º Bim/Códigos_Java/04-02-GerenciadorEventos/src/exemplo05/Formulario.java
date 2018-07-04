package exemplo05;

import javax.swing.JFrame;

public class Formulario extends JFrame {

	public Formulario(String titulo) {
		super(titulo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 100);

		getContentPane().add(new EntradaDados());
		setVisible(true);
	}
}