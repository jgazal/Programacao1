package exemplo04;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class Formulario extends JFrame {
	JButton botao;

	public Formulario(String titulo) {
		super(titulo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 250);

		getContentPane().setLayout(new GridLayout());

		botao = new JButton("Botão 1");
		getContentPane().add(botao);
		setVisible(true);
	}
}