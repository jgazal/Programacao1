public class Esfera{
  private double raio;

  public Esfera(double pRaio) throws Exception{
    this.setRaio(pRaio);
  }

  public double getRaio(){
    return this.raio;
  }
  public void setRaio(double pRaio) throws Exception{
    if(pRaio>=0){
      this.raio = pRaio;
    }else{
      throw new Exception("Raio não pode ser negativo.");
    }
  }

  public double area(){
    return 4*3.1415*(Math.pow(raio, 2));
  }

  public double volume(){
    return (4/3)*3.1415*(Math.pow(raio, 3));
  }
}
