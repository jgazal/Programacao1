/* 16. Desenvolva uma classe que modele um objeto calculadora em conformidade
com o paradigma orientado a objeto. Obs. O objeto calculadora tem as seguintes
responsabilidades de calcular: adição, subtração, multiplicação, divisão,
raiz e potência. */

public class TestCalculadora{
  public static void main(String[] args){
    try{
      Calculadora c1 = new Calculadora(10, 5);
      System.out.println("Número 1: " + c1.getNumero1());
      System.out.println("Número 2: " + c1.getNumero2());
      System.out.println(c1.adicao());
      System.out.println(c1.subtracao());
      System.out.println(c1.multiplicacao());
      System.out.println(c1.divisao());
      System.out.println(c1.raiz());
      System.out.println(c1.potencia());
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
