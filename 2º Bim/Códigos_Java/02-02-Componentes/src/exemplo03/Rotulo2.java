package exemplo03;

import javax.swing.*;

import comum.CriadorImageIcon;

public class Rotulo2 {
	public static void main(String[] args) {
		JFrame f = new JFrame();

		JLabel l = new JLabel(new CriadorImageIcon().criarImageIcon("duke.png", "duke.png"));
		f.getContentPane().add(l);
		f.setSize(250, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
