/* 12. Desenvolva uma classe que modele um objeto triângulo em conformidade com
o paradigma orientado a objeto. A classe deverá ter as seguintes características:
três lados, cálculo da área e a responsabilidade de determinar o tipo de triângulo
que ela respresenta. Obs.: os valores dos lados não podem ser negativos e tem que
formar um triângulo, cada lado individualmente tem que ser menor que a adição
dos outros dois lados. Observações gerais de um triângulo:
I. quanto aos lados, pode ser equilátero ou isósceles ou escaleno;
II. quanto aos ângulos, pode ser acutângulo(A² < B² + C2)
ou obtusângulo(A² > B² + C²) ou retângulo (A² = B² + C²);
III. área = raizQuadrada(T*(T-A)*(T-B)*(T-C)) onde T = (A+B+C)/2 */

public class TestTriangulo{
  public static void main(String[] args){
    try{
      Triangulo t1 = new Triangulo(4, 2, 3);
      System.out.println("Lado 1: " + t1.getLado1());
      System.out.println("Lado 2: " + t1.getLado2());
      System.out.println("Lado 3: " + t1.getLado3());
      System.out.println("Forma triângulo? " + t1.formaTriangulo());
      System.out.println("Tipo de triângulo: " + t1.tipoTriangulo());
      System.out.println("Ângulo: " + t1.anguloTriangulo());
      System.out.println("Área: " + t1.areaTriangulo());
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
