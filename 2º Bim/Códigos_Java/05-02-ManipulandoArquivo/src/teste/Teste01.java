package teste;

import java.io.FileNotFoundException;
import java.io.IOException;

import arquivo.ManipulaArquivoTexto;

public class Teste01 {
	
	public static void teste01() {
		ManipulaArquivoTexto man = null;
		try {
			man = new ManipulaArquivoTexto("dados","nomes.txt");
		}catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		} 
		man.incluirLinha("Goku");
		man.incluirLinha("Picolo");
		man.incluirLinha("Gohan");
		
		try {
			man.gravarArquivo();
		} catch ( IOException e) {
			System.out.println("Erro ao gravar arquivo: "+e.getMessage());
		}
	}
	public static void teste02() {
		ManipulaArquivoTexto man = null;
		try {
			man = new ManipulaArquivoTexto("dados","nomes.txt");
			man.lerArquivo();
		}catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		} 
		for(String linha: man.getLinhas()) {
			System.out.println("Linha:"+linha);
		}
		
	}

	public static void main(String[] args) {
		teste01();
		teste02();
		
	}
}
