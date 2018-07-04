package exemplo04;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ControleLayouts extends JPanel {
	JButton blayout1, blayout2, blayout3;
	JPanel layouts;

	public ControleLayouts(){
		
		setLayout(new BorderLayout());
		

		JPanel blayouts = new JPanel();
		blayouts.setLayout(new FlowLayout(FlowLayout.CENTER));

		blayout1 = new JButton("Layout 1");
		blayout2 = new JButton("Layout 2");
		blayout3 = new JButton("Layout 3");
		
		blayouts.add(blayout1);
		blayouts.add(blayout2);
		blayouts.add(blayout3);


		TrocarLayout acaoBotao = new TrocarLayout();
		
		blayout1.addActionListener(acaoBotao);		
		blayout2.addActionListener(acaoBotao);		
		blayout3.addActionListener(acaoBotao);		

		layouts = new JPanel();
		layouts.setLayout(new CardLayout());
		
		layouts.add(new Layout1(), "layout1");
		layouts.add(new Layout2(), "layout2");
		layouts.add(new Layout3(), "layout3");

		add(blayouts, BorderLayout.NORTH);
		add(layouts, BorderLayout.SOUTH);
		

		
	}

	private class TrocarLayout implements ActionListener {


		public void actionPerformed(ActionEvent evento) {
			if(evento.getSource() == blayout1){
				((CardLayout) layouts.getLayout()).show(layouts,"layout1");
			}						
			
			if(evento.getSource() == blayout2){
				((CardLayout) layouts.getLayout()).show(layouts,"layout2");
			}						
		
			
			if(evento.getSource() == blayout3){
				((CardLayout) layouts.getLayout()).show(layouts,"layout3");
			}
		}
	}

	private class Layout1 extends JPanel{
		JButton b1, b2;

		public Layout1(){
			setLayout(new FlowLayout());
			b1 = new JButton("Botao 1");
			b2 = new JButton("Botao 2");

			b1.addActionListener(new AcaoBotao("1","Botao 1"));
			b2.addActionListener(new AcaoBotao("1","Botao 2"));
		
			add(b1);
			add(b2);
		}

	}

	private class Layout2 extends JPanel {
		JButton b1, b2;

		public Layout2(){
			setLayout(new FlowLayout());
			b1 = new JButton("Ok");
			b2 = new JButton("Cancelar");

			b1.addActionListener(new AcaoBotao("2","Ok"));
			b2.addActionListener(new AcaoBotao("2","Cancelar"));
		
			add(b1);
			add(b2);
		}

	}

	private class Layout3 extends JPanel {
		JButton b1, b2;

		public Layout3(){
			setLayout(new FlowLayout());
			b1 = new JButton("Sim");
			b2 = new JButton("Nao");

			b1.addActionListener(new AcaoBotao("3","Sim"));
			b2.addActionListener(new AcaoBotao("3","Nao"));
		
			add(b1);
			add(b2);
		}

	}

	private class AcaoBotao implements ActionListener {
		String layout, mensagem;

		AcaoBotao(String layout, String mensagem) {
			this.layout = layout;
			this.mensagem = mensagem;
		}	

		public void actionPerformed(ActionEvent evento) {
			JOptionPane.showMessageDialog(null,"Layout: "+layout+" escolhido:"+mensagem); 		
		}
	}

}