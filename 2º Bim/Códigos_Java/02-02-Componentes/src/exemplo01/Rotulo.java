package exemplo01;
import javax.swing.*;

public class Rotulo{
	public static void main(String[] args){
		JFrame f = new JFrame(); 
		JLabel l = new JLabel("teste"); 
		f.getContentPane().add(l); 
		f.setSize(150, 100); 
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
