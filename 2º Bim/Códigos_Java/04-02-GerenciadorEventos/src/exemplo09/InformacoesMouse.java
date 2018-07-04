package exemplo09;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InformacoesMouse extends JPanel {
	JLabel lrotulo;

	public InformacoesMouse(){
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		lrotulo = new JLabel("EVENTOS DO MOUSE");
		lrotulo.setPreferredSize(new Dimension(400,20));
		add(lrotulo);
		
				
		lrotulo = new JLabel();
		lrotulo.setPreferredSize(new Dimension(400,20));
		add(lrotulo);

		lrotulo.addMouseListener(new obterInformacoesMouse());

		addMouseListener(new obterInformacoesMouse());
	}


	private class obterInformacoesMouse implements MouseListener {

		public void mousePressed(MouseEvent evento) {
			if(evento.getButton() == MouseEvent.BUTTON1) {
				lrotulo.setText("Botao 1 pressionado.");
			}

			if(evento.getModifiers() == MouseEvent.BUTTON2_MASK) {
				lrotulo.setText("Botao 2 pressionado.");
			}

						
		}
		
		public void mouseReleased(MouseEvent evento) 
		{
			
		}
		public void mouseClicked(MouseEvent evento) {}
			
		public void mouseEntered(MouseEvent evento) {}
		public void mouseExited(MouseEvent evento) {}
	}


}