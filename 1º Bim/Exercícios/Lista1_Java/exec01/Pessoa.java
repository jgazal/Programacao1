
public class Pessoa {
  public static final String SEXO_M = "MASC";
  public static final String SEXO_F = "FEMI";
  private String nome;
  private int idade;
  private double peso;
  private double altura;

  public Pessoa(String pNome, int pIdade, double pPeso, double pAltura) throws Exception{
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
  public void setIdade(int vIdade) throws Exception{
    if(vIdade>=0){
      this.idade = vIdade;
    }else{
      throw new Exception("Idade não pode ser negativa");
    }
  }

  public double getPeso(){
    return this.peso;
  }
  public void setPeso(double pPeso) throws Exception{
    if(pPeso>=0){
      this.peso = pPeso;
    }else{
      throw new Exception("Peso não pode ser negativo");
    }
  }

  public double getAltura(){
    return this.altura;
  }
  public void setAltura(double pAltura) throws Exception{
    if(pAltura>=0){
      this.altura = pAltura;
    }else{
      throw new Exception("Altura não pode ser negativa");
    }
  }

  public double IMC(){
    return peso/Math.pow(altura, 2);
  }
}
