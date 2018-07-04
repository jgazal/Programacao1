package exemplo06;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Formulario extends JFrame{
	JButton botao;
	public Formulario (String titulo){
		super(titulo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize(500,100);

		getContentPane().setLayout(new GridLayout(3,2));

		botao = new JButton("Botão 1"); 
		getContentPane().add(botao);

		botao = new JButton("Botão 2");
		getContentPane().add(botao);

		botao = new JButton("Botão 3");
		getContentPane().add(botao);

		botao = new JButton("Botão 4");
		getContentPane().add(botao);

		botao = new JButton("Botão 5");
		getContentPane().add(botao);

		botao = new JButton("Botão 6");
		getContentPane().add(botao);

		setVisible(true);
	}
}