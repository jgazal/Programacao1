package exemplo02;

import javax.swing.*;

public class Rotulo1 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JLabel l = new JLabel("teste", JLabel.CENTER);
		f.getContentPane().add(l);
		f.setSize(150, 100);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
