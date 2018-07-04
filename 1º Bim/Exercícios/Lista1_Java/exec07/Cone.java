public class Cone{
  private double raio;
  private double altura;

  public Cone(double pRaio, double pAltura) throws Exception{
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

  public double geratriz(){
    return Math.sqrt(Math.pow(altura, 2) + Math.pow(raio, 2));
  }

  public double areaLateral(){
    return 3.1415*raio*geratriz();
  }

  public double areaTotal(){
    return 3.1415*raio*(geratriz()+raio);
  }

  public double volume(){
    return 1.0/3.0*3.1415*Math.pow(raio, 2)*altura;
  }
}
