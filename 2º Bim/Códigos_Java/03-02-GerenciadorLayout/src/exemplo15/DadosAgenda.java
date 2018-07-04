package exemplo15;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DadosAgenda extends JPanel {
	JButton bok, bcancelar;
	JTextField tfnome, tfendereco;
	JLabel lnome, lendereco;

	public DadosAgenda() {
		setLayout(null);

		lnome = new JLabel("Nome:");
		lnome.setBounds(0, 7, 40, 10);

		lendereco = new JLabel("Endereço:");
		lendereco.setBounds(0, 30, 72, 15);

		tfnome = new JTextField(10);
		tfnome.setBounds(65, 5, 80, 20);

		tfendereco = new JTextField(40);
		tfendereco.setBounds(65, 28, 320, 20);

		bok = new JButton("OK");
		bok.setBounds(130, 70, 90, 30);

		bcancelar = new JButton("Cancelar");
		bcancelar.setBounds(228, 70, 90, 30);

		add(lnome);
		add(lendereco);

		add(tfnome);
		add(tfendereco);

		add(bok);

		add(bcancelar);
	}
}