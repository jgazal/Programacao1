public class EquacaoSegundoGrau{
  private int a;
  private int b;
  private int c;

  public EquacaoSegundoGrau(int pA, int pB, int pC){
    this.setA(pA);
    this.setB(pB);
    this.setC(pC);
  }

  public int getA(){
    return this.a;
  }
  public void setA(int pA){
    this.a = pA;
  }

  public int getB(){
    return this.b;
  }
  public void setB(int pB){
    this.b = pB;
  }

  public int getC(){
    return this.c;
  }
  public void setC(int pC){
    this.c = pC;
  }

  public String equacao(){
    return a + "x² + " + b + "x + " + c;
  }

  public double delta(){
    double delta1 = Math.pow(b, 2) - 4*a*c;
    return delta1;
  }

  public double X1(){
    double x1 = -b + Math.sqrt(delta())/2*a;
    return x1;
  }
  public double X2(){
    double x2 = -b - Math.sqrt(delta())/2*a;
    return x2;
  }
}
