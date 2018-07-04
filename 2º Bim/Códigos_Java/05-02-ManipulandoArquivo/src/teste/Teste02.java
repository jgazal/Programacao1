package teste;

import java.io.IOException;
import java.util.Date;

import arquivo.ManipulaArquivoSerializado;
import modelo.Pessoa;

public class Teste02 {
	@SuppressWarnings("deprecation")
	public static void teste01() {
		ManipulaArquivoSerializado mas=null;
		try {
			mas = new ManipulaArquivoSerializado("dadosObjetos", "pessoa.ser");
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		Pessoa p1 = new Pessoa(1,"Goku",new Date(1960, 1, 1),true);
		mas.incluirLinha(p1);
		Pessoa p2= new Pessoa(2,"Picolo",new Date(1920, 1, 1),true);
		mas.incluirLinha(p2);
		Pessoa p3= new Pessoa(3,"Gohan",new Date(1980, 1, 1),true);
		mas.incluirLinha(p3);
		
		try {
			mas.gravarArquivo();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void teste02() {
		ManipulaArquivoSerializado mas=null;
		try {
			mas = new ManipulaArquivoSerializado("dadosObjetos", "pessoa.ser");
			mas.lerArquivo();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
			System.exit(1);
		}

		for(Object objeto: mas.getLinhas()) {
			Pessoa p = (Pessoa)objeto;
			System.out.println(p);
		}
		
		
	}
	public static void main(String[] args) {
		teste01();
		teste02();
	}
}
