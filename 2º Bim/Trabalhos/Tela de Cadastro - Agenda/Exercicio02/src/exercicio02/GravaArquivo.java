package exercicio02;

import java.io.FileWriter;
import java.io.IOException;

public class GravaArquivo {
	public static void GravarArquivo(Pessoa p) {
		try(FileWriter arquivo = new FileWriter("Arquivo.txt", true)) {
			arquivo.write("Nome: " + p.getNome() + "\n");
			arquivo.write("Endereço: " + p.getEndereco() + "\n");
			arquivo.write("Complemento: " + p.getComplemento() + "\n");
			arquivo.write("Cidade: " + p.getCidade() + "\n");
			arquivo.write("Estado: " + p.getEstado() + "\n");
			arquivo.write("Telefone: " + p.getTelefone() + "\n");
			arquivo.write("\n\n");
			
			arquivo.close();
			
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
