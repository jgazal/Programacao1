package exemplo11;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DadosAgenda extends Box {
	JButton botao;
	JTextField caixaEntrada;

	public DadosAgenda(int eixo) {
		super(eixo);
		Box nome = Box.createHorizontalBox();
		nome.add(new JLabel("Nome:"));
		caixaEntrada = new JTextField(10);

		caixaEntrada.setMaximumSize(caixaEntrada.getPreferredSize());

		nome.add(Box.createHorizontalStrut(10));

		nome.add(caixaEntrada);

		Box endereco = Box.createHorizontalBox();
		endereco.add(new JLabel("Endereço:"));

		caixaEntrada = new JTextField(40);
		caixaEntrada.setMaximumSize(caixaEntrada.getPreferredSize());

		endereco.add(Box.createHorizontalStrut(10));
		endereco.add(caixaEntrada);

		add(nome);
		add(endereco);
	}
}