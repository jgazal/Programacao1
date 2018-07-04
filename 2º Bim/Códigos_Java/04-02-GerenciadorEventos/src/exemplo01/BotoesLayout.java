package exemplo01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BotoesLayout extends JPanel {
	JButton botao1, botao2, botao3;

	public BotoesLayout() {

		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

		botao1 = new JButton("Botao 1");
		botao2 = new JButton("Botao 2");
		botao3 = new JButton("Botao 3");

		ExibirMensagem acaoBotao1 = new ExibirMensagem("Botao 1 pressionado");
		ExibirMensagem acaoBotao2 = new ExibirMensagem("Botao 2 pressionado");
		ExibirMensagem acaoBotao3 = new ExibirMensagem("Botao 3 pressionado");

		botao1.addActionListener(acaoBotao1);
		botao2.addActionListener(acaoBotao2);
		botao3.addActionListener(acaoBotao3);

		add(botao1);
		add(botao2);
		add(botao3);
	}

	private class ExibirMensagem implements ActionListener {
		private String mensagem;

		public ExibirMensagem(String mensagem) {
			this.mensagem = mensagem;
		}

		public void actionPerformed(ActionEvent evento) {
			JOptionPane.showMessageDialog(null, mensagem);
		}
	}
}