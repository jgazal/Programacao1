public class Triangulo{
  private double lado1;
  private double lado2;
  private double lado3;

  public Triangulo(double pLado1, double pLado2, double pLado3) throws Exception{
    this.setLado1(pLado1);
    this.setLado2(pLado2);
    this.setLado3(pLado3);
  }

  public double getLado1(){
    return this.lado1;
  }
  public void setLado1(double pLado1) throws Exception{
    if(pLado1>=0){
      this.lado1 = pLado1;
    }else{
      throw new Exception("Lado 1: O lado não pode ser negativo.");
    }
  }

  public double getLado2(){
    return this.lado2;
  }
  public void setLado2(double pLado2) throws Exception{
    if(pLado2>=0){
      this.lado2 = pLado2;
    }else{
      throw new Exception("Lado 2: O lado não pode ser negativo.");
    }
  }

  public double getLado3(){
    return this.lado3;
  }
  public void setLado3(double pLado3) throws Exception{
    if(pLado3>=0){
      this.lado3 = pLado3;
    }else{
      throw new Exception("Lado 3: O lado não pode ser negativo.");
    }
  }

  public String formaTriangulo(){
    if((lado1<lado2+lado3) || (lado2<lado1+lado3) || (lado3<lado1+lado2)){
      return "Forma triângulo";
    }else{
      return "Não forma triângulo";
    }
  }

  public String tipoTriangulo(){
    if((lado1==lado2) && (lado2==lado3)){
      return "Triângulo Equilátero";
    }
    if((lado1!=lado2) && (lado2!=lado3)){
      return "Triângulo Escaleno";
    }else{
      return "Triângulo Isósceles";
    }
  }

  public String anguloTriangulo(){
    if((Math.pow(lado1, 2) < (Math.pow(lado2, 2)) + (Math.pow(lado3, 2)))){
      return "Acutângulo";
    }
    if((Math.pow(lado1, 2) > (Math.pow(lado2, 2) + (Math.pow(lado3, 2))))){
      return "Obtusângulo";
    }else{
      return "Retângulo";
    }
  }

  public double areaTriangulo(){
    double T = (lado1+lado2+lado3)/2;
    double calcArea = (T*(T-lado1)*(T-lado2)*(T-lado3));
    double area = Math.sqrt(calcArea);
    return area;
  }
}
