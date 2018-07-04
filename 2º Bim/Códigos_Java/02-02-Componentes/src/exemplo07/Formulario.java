package exemplo07;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Formulario extends JFrame {
	JTextField tf;

	public Formulario() {
		tf = new JTextField();
		getContentPane().add(tf);
		setSize(250, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}