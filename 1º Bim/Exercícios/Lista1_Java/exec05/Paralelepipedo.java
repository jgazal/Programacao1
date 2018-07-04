public class Paralelepipedo{
  private double altura;
  private double largura;
  private double comprimento;

  public Paralelepipedo(double pAltura, double pLargura, double pComprimento){
    this.setAltura(pAltura);
    this.setLargura(pLargura);
    this.setComprimento(pComprimento);
  }

  public double getAltura(){
    return this.altura;
  }
  public void setAltura(double pAltura){
    this.altura = pAltura;
  }

  public double getLargura(){
    return this.largura;
  }
  public void setLargura(double pLargura){
    this.largura = pLargura;
  }

  public double getComprimento(){
    return this.comprimento;
  }
  public void setComprimento(double pComprimento){
    this.comprimento = pComprimento;
  }

  public double volume(){
    return altura*comprimento*largura;
  }

  public double area(){
    return 2*(altura*largura + altura*comprimento + largura*comprimento);
  }
}
