package modelo;

public class Pessoa {
	
	private int codigo;
	private String nome;
	private String telefone;

	
	public Pessoa(int codigo, String nome, String telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
	}
	public Pessoa(){
		
	}
	public int getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String toString(){
		return "Código: "+this.codigo+" Nome:"+this.nome+" Telefone:"+this.getTelefone();
	}
}
