package visao;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TelaInicial  extends JPanel {
	
	public void paintComponent(Graphics g) {
		Image img = new ImageIcon("./imagens/jp_logo.png").getImage();
		g.drawImage(img, 40, 50, this);
	}
}
