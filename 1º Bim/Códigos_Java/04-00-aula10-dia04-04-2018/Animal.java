public class Animal{
	protected String nome;
	protected String sexo;
	protected int quantidadePatas;
	private void initClasse(String nome, String sexo,int qtd){
		setNome(nome);
		setSexo(sexo);
		this.quantidadePatas  = qtd;
	}
	public Animal(String nome, String sexo){
		initClasse(nome,sexo,4);
	}
	public Animal(String nome, String sexo,int qtd){
		initClasse(nome,sexo,qtd);
	}
	
	public String getNome(){ return this.nome.toUpperCase(); };
	public void setNome(String nome){ this.nome = nome ;};
	public String getSexo(){ return this.sexo; };
	public void setSexo(String sexo){ this.sexo = sexo; };
	public String toString(){ 
		return "Nome:" + getNome()+" sexo:"+getSexo()+" Patas:"+this.quantidadePatas;
	}
}	