package exemplo04;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Formulario extends JFrame {
	JLabel l;

	public Formulario() {
		l = new JLabel("teste");
		getContentPane().add(l);
		setSize(150, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}