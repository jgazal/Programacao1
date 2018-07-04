public class Cilindro{
  private double raio;
  private double altura;

  public Cilindro(double pRaio, double pAltura) throws Exception{
    this.setRaio(pRaio);
    this.setAltura(pAltura);
  }

  public double getRaio(){
    return this.raio;
  }
  public void setRaio(double pRaio) throws Exception{
    if(pRaio>=0){
      this.raio = pRaio;
    }else{
      throw new Exception("O valor do raio não pode ser negativo.");
    }
  }

  public double getAltura(){
    return this.altura;
  }
  public void setAltura(double pAltura) throws Exception{
    if(pAltura>=0){
      this.altura = pAltura;
    }else{
      throw new Exception("O valor da altura não pode ser negativo.");
    }
  }

  public double areaLateral(){
    return 2*3.1415*raio*altura;
  }

  public double areaTotal(){
    return 2*3.1415*raio*(altura+raio);
  }

  public double volume(){
    return 3.1415*raio*raio*altura;
  }
}
