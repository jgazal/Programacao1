package exemplo01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Formulario extends JFrame {
	JButton botao;

	public Formulario(String titulo) {
		super(titulo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 250);

		getContentPane().setLayout(new FlowLayout());

		botao = new JButton("Botão 1");
		getContentPane().add(botao);
		setVisible(true);
	}
}