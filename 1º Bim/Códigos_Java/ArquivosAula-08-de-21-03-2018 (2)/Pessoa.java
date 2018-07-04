public class Pessoa{
	public static final String SEXO_M = "MASC";
	public static final String SEXO_F = "FEMI";
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	
	public Pessoa(	String pNome, 
					int pIdade, 
					double pPeso,
					double pAltura){
		this.setNome(pNome);
		this.setIdade(pIdade);
		this.setPeso(pPeso);
		this.setAltura(pAltura);
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String pNome){
		this.nome = pNome;
	}
	public int getIdade(){
		return this.idade;
	}
	public void setIdade(int vIdade){
		if(vIdade>=0){
			this.idade = vIdade;
		}else{
			throw new RuntimeException("Idade tem que ser >= 0");
		}
	}
	public double getPeso(){
		return this.peso;
	}
	public void setPeso(double pPeso){
		this.peso = pPeso;
	}
	public double getAltura(){
		return this.altura;
	}
	public void setAltura(double pAltura){
		this.altura = pAltura;
	}
}