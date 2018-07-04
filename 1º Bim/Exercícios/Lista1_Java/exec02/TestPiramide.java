/* 2. Desenvolva uma classe que modele um objeto pirâmide em conformidade com o
paradigma orientado a objeto. A classe deverá ter as seguintes características:
base, altura e a responsabilidade de calcular volume.
volume = (1/3 * base * altura) */

public class TestPiramide {
  public static void main(String[] args) {
    Piramide p1 = new Piramide(10, 5);
    System.out.println("Base: " + p1.getBase());
    System.out.println("Altura: " + p1.getAltura());
    System.out.println("Volume: " + p1.volume());
  }
}
