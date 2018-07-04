package exemplo09;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Formulario extends JFrame {
	JButton botao;

	public Formulario(String titulo) {
		super(titulo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 250);

		getContentPane().setLayout(new BorderLayout());

		botao = new JButton("Botão 1");
		getContentPane().add("Center", botao);

		botao = new JButton("Botão 2");
		getContentPane().add("North", botao);

		botao = new JButton("Botão 3");
		getContentPane().add("South", botao);

		botao = new JButton("Botão 4");
		getContentPane().add("West", botao);

		botao = new JButton("Botão 5");
		getContentPane().add("East", botao);

		setVisible(true);
	}
}