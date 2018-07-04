package exemplo03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BotoesLayout extends JPanel {
	JButton botao1, botao2, botao3;
	
	public BotoesLayout(){
		
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		botao1 = new JButton("Botao 1");
		botao2 = new JButton("Botao 2");
		botao3 = new JButton("Botao 3");


		ExibirMensagem acaoBotao = new ExibirMensagem();
		
		botao1.addActionListener(acaoBotao);		
		botao2.addActionListener(acaoBotao);		
		botao3.addActionListener(acaoBotao);		

		add(botao1);
		add(botao2);
		add(botao3);
	}


	private class ExibirMensagem implements ActionListener {

		public void actionPerformed(ActionEvent evento){
			JOptionPane.showMessageDialog(null,evento.getSource().getClass());			
		}
	}
}