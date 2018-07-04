package aula01;

public class Pessoa {
	protected String nome;
	protected String endereco;
	protected int fone;

	public Pessoa(){
		nome="";
		endereco="";
		fone=0;
	}
	public Pessoa(String nome, String endereco, int fone) {
		this.nome = nome;
		this.endereco = endereco;
		this.fone = fone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getFone() {
		return fone;
	}
	public void setFone(int fone) {
		this.fone = fone;
	}
	
	
}
