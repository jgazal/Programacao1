package exemplo10;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DadosAgenda extends JPanel {
	JButton botao;
	JTextField caixaEntrada;

	public DadosAgenda() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		JPanel nome = new JPanel();

		nome.setLayout(new BoxLayout(nome, BoxLayout.X_AXIS));

		nome.add(new JLabel("Nome:"));

		caixaEntrada = new JTextField(10);
		caixaEntrada.setMaximumSize(caixaEntrada.getPreferredSize());
		nome.add(Box.createHorizontalStrut(5));

		nome.add(caixaEntrada);

		JPanel endereco = new JPanel();

		endereco.setLayout(new BoxLayout(endereco, BoxLayout.X_AXIS));
		endereco.add(new JLabel("Endereço:"));

		caixaEntrada = new JTextField(40);
		caixaEntrada.setMaximumSize(caixaEntrada.getPreferredSize());

		endereco.add(Box.createHorizontalStrut(5));

		endereco.add(caixaEntrada);
		add(nome);

		add(Box.createRigidArea(new Dimension(0, 5)));
		add(endereco);
	}
}