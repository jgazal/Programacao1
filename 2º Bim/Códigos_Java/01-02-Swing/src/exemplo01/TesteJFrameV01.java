package exemplo01;

import javax.swing.*;

public class TesteJFrameV01 {
	public static void main(String args[]) {
		int largura = 400, altura = 250;
		JFrame janela = new JFrame();
		janela.setSize(largura, altura);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("passei 1");
		// janela.show();
		janela.setVisible(true);
		System.out.println("passei 2");
	}
}
