package exercicio02;

import javax.swing.JFrame;

public class Janela extends JFrame {
	public Janela(String titulo) {
		super(titulo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(460, 260);
		getContentPane().add(new Cadastro());
		setVisible(true);
	}
}
