package exemplo08;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Formulario extends JFrame{
	JButton botao;
	JLabel texto;
	JTextField caixaTexto;

	public Formulario (String titulo){

		super(titulo); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize(300,250);

		getContentPane().setLayout(new GridLayout(3,2));

		texto = new JLabel("Nome"); 
		getContentPane().add(texto); 

		caixaTexto = new JTextField(10); 
		getContentPane().add(caixaTexto); 

		botao = new JButton("Botão");
		getContentPane().add(botao); 

		setVisible(true);
	}
}