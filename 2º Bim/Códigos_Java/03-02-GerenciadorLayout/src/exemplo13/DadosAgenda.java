package exemplo13;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DadosAgenda extends JPanel{
	JButton botao; 
	JTextField caixaEntrada;
	public DadosAgenda(){
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		JPanel nome = new JPanel();
		nome.setLayout(new BoxLayout(nome, BoxLayout.X_AXIS)); 
		nome.add(new JLabel("Nome:"));

		caixaEntrada = new JTextField(10); 
		caixaEntrada.setMaximumSize(
			caixaEntrada.getPreferredSize()
		); 
		
		nome.add(
			Box.createHorizontalStrut(5)
		); 

		nome.add(caixaEntrada);


		JPanel grupo1 = new JPanel(); 
		grupo1.setLayout(new BorderLayout()); 
		grupo1.add("West",nome);

		JPanel endereco = new JPanel();

		endereco.setLayout(
			new BoxLayout(endereco, BoxLayout.X_AXIS)
		); 

		endereco.add(new JLabel("Endereço:"));

		caixaEntrada = new JTextField(40); 
		caixaEntrada.setMaximumSize(
			caixaEntrada.getPreferredSize()
		); 
		
		endereco.add(Box.createHorizontalStrut(5)); 
		endereco.add(caixaEntrada);

		JPanel grupo2 = new JPanel(); 
		grupo2.setLayout(new BorderLayout()); 
		grupo2.add("West",endereco);

		JPanel botoes = new JPanel();

		botoes.setLayout(
			new BoxLayout(botoes, BoxLayout.X_AXIS)
		); 

		botao = new JButton("Ok");
		botoes.add(botao);

		botoes.add(Box.createHorizontalStrut(10)); 
		botao = new JButton("Cancelar"); 
		botoes.add(botao);


		add(Box.createRigidArea(new Dimension(0,15))); 
		add(grupo1);

		add(Box.createRigidArea(new Dimension(0,5))); 
		add(grupo2);
		add(Box.createGlue());

		add(botoes);
	}
}