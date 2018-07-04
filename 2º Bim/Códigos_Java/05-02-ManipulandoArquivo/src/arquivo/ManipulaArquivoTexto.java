package arquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Guiliano
 * Classe utilizada para minipular arquivo texto.
 */
public class ManipulaArquivoTexto {
	final String SEPARADOR=System.getProperty("file.separator");
	private List<String> listaLinhas;
	private String caminhoArquivo, nomeArquivo;
	
	
	public ManipulaArquivoTexto(String caminho, String nomeArquivo) throws FileNotFoundException, IOException {
		this.caminhoArquivo = caminho;
		this.nomeArquivo = nomeArquivo;
		
		this.limparLinhas();
		
		//criar o diretório dos dados casos ele não exista
		if (!this.preparaLocalDados()) {
			throw new RuntimeException("Erro ao preparar caminho para gravar dados!!!");
		}
		//criar o arquivo de dados caso ele não exista
		if(!this.preparaArquivoDados()) {
			throw new RuntimeException("Erro ao preparar o arquivo de dados!!!");
		}

		this.lerArquivo();
	}
	
	/** Metodo que deve retornar o nome do arquivo que será utilizado para gravar os dados
	 * deve retornar apenas o nome do arquivo sem o caminho
	 * @return
	 */
	public String getArquivoNome() {
		return this.nomeArquivo;
	}
	
	/** Metodo que deve retonar o caminho do arquivo a partir de onde o programa é executardo.
	 * Ex.: dados 
	 *
	 * @return
	 */
	public String getCaminhoArquivo() {
		return this.caminhoArquivo;
	}
	
	public void limparLinhas() {
		this.listaLinhas = new ArrayList<>();
	}
		
	/** retorna o caminho onde o programa é executando
	 * @return
	 */
	public static String getCaminhoAplicacao() {
		try {
			return new java.io.File( "." ).getCanonicalPath();
		} catch (IOException e) {//sem tratamento pois, dificilmente acontecerá um erro. 
			e.printStackTrace();
		};
		return null;
	}

	/** cria a pasta onde os dados serão guardados. 
	 * @return
	 */
	private boolean preparaLocalDados() {
		String strCaminhoDados = ManipulaArquivoTexto.getCaminhoAplicacao()+SEPARADOR+this.getCaminhoArquivo();
		File caminhoDados = new File(strCaminhoDados);
		try{
			if(!caminhoDados.exists()) {
				caminhoDados.mkdirs();
			}
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}		
		return true;
	}
	
	/** cria o arquivo onde os dados serão guardados se não existir. 
	 * @return
	 */
	private boolean preparaArquivoDados() {
		String arquivoDados = this.getNomeArquivoAbsoluto();
		File caminhoDados = new File(arquivoDados);
		try{
			if(!caminhoDados.exists()) {
				this.gravarArquivo();
			}
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}		
		return true;
	}
	
	/** retorno o nome do arquivo incluído o caminho absoluto até ele
	 * ex: c:\Portables\eclipse-workspacePRGI-20181\05-02-ManipulandoArquivo\dados\dados.txt
	 * @return
	 */
	public String getNomeArquivoAbsoluto() {
		return ManipulaArquivoTexto.getCaminhoAplicacao()+SEPARADOR+this.getCaminhoArquivo()+SEPARADOR+this.getArquivoNome();
	}
	
	/**
	 * Realizar a leitura do arquivo inteiro para a Lista listaLinhas
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void lerArquivo() throws FileNotFoundException ,IOException{
		this.limparLinhas();
		FileInputStream fstream = null;

         fstream = new FileInputStream(this.getNomeArquivoAbsoluto());
         BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
         String strLinha = "";
         //Read file line by line
         while ((strLinha = br.readLine()) != null)   {
        	 this.getLinhas().add(strLinha);
         }
         fstream.close();        
	}
	
	/** Grava a lista inteira para o arquivo
	 * @throws FileNotFoundException
	 */
	public void gravarArquivo() throws IOException {		
		PrintWriter pw = new PrintWriter(new FileOutputStream(this.getNomeArquivoAbsoluto()));
	    for (String linha : this.getLinhas()){
	        pw.println(linha);
	    }
	    pw.close();	   
	}
	
	public void incluirLinha(String linha) {
		listaLinhas.add(linha);
	}
	public List<String> getLinhas(){
		return listaLinhas;
	}
	public String getLinha(int linha) {
		return listaLinhas.get(linha);
	}
	
}
