package modelo;

public class Dinossauro {
	private Integer codigo;
	protected String nome;
	protected String nome_cientifico;
	protected String periodo;
	protected double peso;
	protected double tamanho;
	protected String alimentacao;
	protected String descricao;
	
	public Dinossauro() {
		codigo = 0;
		nome = "";
		nome_cientifico = "";
		periodo = "PERÍODO";
		peso = 0;
		tamanho = 0;
		alimentacao = "ALIMENTAÇÃO";
		descricao = "";
	}
	
	public Dinossauro(int codigo, String nome, String nome_cientifico, String periodo, 
			double peso, double tamanho, String alimentacao, String descricao) {
		
		this.nome = nome;
		this.nome_cientifico = nome_cientifico;
		this.periodo = periodo;
		this.peso = peso;
		this.tamanho = tamanho;
		this.alimentacao = alimentacao;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome_cientifico() {
		return nome_cientifico;
	}

	public void setNome_cientifico(String nome_cientifico) {
		this.nome_cientifico = nome_cientifico;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
