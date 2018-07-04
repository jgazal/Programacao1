/* 13. Desenvolva uma classe que modele um objeto equação do segundo grau
ax² + bx + c em conformidade com o paradigma orientado a objeto*/

public class TestEquacaoSegundoGrau{
  public static void main(String[] args){
    EquacaoSegundoGrau esg1 = new EquacaoSegundoGrau(1, 10, 3);
    System.out.println("a = " + esg1.getA());
    System.out.println("b = " + esg1.getB());
    System.out.println("c = " + esg1.getC());
    System.out.println("Equação: " + esg1.equacao());
    System.out.println("Delta = " + esg1.delta());
    System.out.println("x1 = " + esg1.X1());
    System.out.println("x2 = " + esg1.X2());
  }
}
