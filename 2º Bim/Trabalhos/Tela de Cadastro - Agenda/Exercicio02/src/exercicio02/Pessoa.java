package exercicio02;

public class Pessoa {
	protected String nome;
	protected String endereco;
	protected String complemento;
	protected String cidade;
	protected String estado;
	protected String telefone;
	
	public Pessoa(){
		nome = "";
		endereco = "";
		complemento = "";
		cidade = "";
		estado = "";
		telefone = "";
	}
	
	public Pessoa(String nome, String endereco, 
			String complemento, String cidade, String estado, String telefone) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
		this.telefone = telefone;
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
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
