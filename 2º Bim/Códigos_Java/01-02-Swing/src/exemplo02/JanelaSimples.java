package exemplo02;

import javax.swing.JFrame;

public class JanelaSimples extends JFrame {
	public static final int LARGURA = 400;
	public static final int ALTURA = 250;

	public JanelaSimples() {
		setSize(LARGURA, ALTURA);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}