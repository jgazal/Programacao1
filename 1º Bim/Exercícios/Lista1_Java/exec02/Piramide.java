public class Piramide{
  private double base;
  private double altura;

  public Piramide(double pBase, double pAltura){
    this.setBase(pBase);
    this.setAltura(pAltura);
  }

  public double getBase(){
    return this.base;
  }
  public void setBase(double pBase){
    this.base = pBase;
  }

  public double getAltura(){
    return this.altura;
  }
  public void setAltura(double pAltura){
    this.altura = pAltura;
  }

  public double volume(){
    return 1.0/3.0*base*altura;
  }
}
