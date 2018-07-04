package exemplo14;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelCalculadora extends JPanel{
	JButton botao; 
	JTextField resultado; 
	JPanel teclado;

	public PanelCalculadora(){
		setLayout(new BorderLayout());

		resultado = new JTextField("12.0"); 
		resultado.setEditable(false); 
		add("North", resultado);
		
		teclado = new JPanel(); 
		teclado.setLayout(new GridLayout(4,4));

		teclado.add(new JButton("7")); 
		teclado.add(new JButton("8")); 
		teclado.add(new JButton("9")); 
		teclado.add(new JButton("/"));

		teclado.add(new JButton("4")); 
		teclado.add(new JButton("5")); 
		teclado.add(new JButton("6")); 
		teclado.add(new JButton("*"));

		teclado.add(new JButton("1")); 
		teclado.add(new JButton("2")); 
		teclado.add(new JButton("3")); 
		teclado.add(new JButton("-"));

		teclado.add(new JButton("0")); 
		teclado.add(new JButton(".")); 
		teclado.add(new JButton("=")); 
		teclado.add(new JButton("+"));

		add("Center",teclado);
	}
}