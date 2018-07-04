
public class Pessoa {
  public static final String SEXO_M = "MASC";
  public static final String SEXO_F = "FEMI";
  private String nome;
  private int idade;
  private double peso;
  private double altura;

  public Pessoa(String pNome, int pIdade, double pPeso, double pAltura){
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
  /*public void setIdade(int pIdade){
    this.idade = pIdade;
  }*/

  private void validaPositivo(int valor, String nomeVariavel) throws Exception{
    this.validaPositivo(Integer.ValueOf(valor), nomeVariavel);
  }
  private void validaPositivo(double valor, String nomeVariavel) throws Exception{
    if(valor<0.0){
      Exception e = new Exception(nomeVariavel + " tem que ser Positivo");
      throw e;
    }
  }

  public void setIdade(int vIdade) throws Exception{
    this.validaPositivo(vIdade, "Idade");
    this.idade = vIdade;
  }

  public double getPeso(){
    return this.peso;
  }
  public void setPeso(double pPeso) throws Exception{
    this.validaPositivo(pPeso, "Peso");
    this.peso = pPeso;
  }

  public double getAltura(){
    return this.altura;
  }
  public void setAltura(double pAltura) throws Exception{
    this.validaPositivo(pAltura, "Altura");
    this.altura = pAltura;
  }
}
