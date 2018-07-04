public class Retangulo{
  private double comprimento;
  private double largura;

  public Retangulo(double pComprimento, double pLargura) throws Exception{
    this.setComprimento(pComprimento);
    this.setLargura(pLargura);
  }

  public double getComprimento(){
    return this.comprimento;
  }
  public void setComprimento(double pComprimento) throws Exception{
    if(pComprimento>=0){
      this.comprimento = pComprimento;
    }else{
      throw new Exception("O comprimento não pode ter valor negativo.");
    }
  }

  public double getLargura(){
    return this.largura;
  }
  public void setLargura(double pLargura) throws Exception{
    if(pLargura>=0){
      this.largura = pLargura;
    }else{
      throw new Exception("A largura não pode ter valor negativo.");
    }
  }

  public double perimetro(){
    return largura*comprimento;
  }

  public double area(){
    return largura*2 + comprimento*2;
  }
}
