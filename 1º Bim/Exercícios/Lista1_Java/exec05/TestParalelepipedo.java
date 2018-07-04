/* 5. Desenvolva uma classe que modele um objeto paralelepípedo em conformidade
com o paradigma orientado a objeto. A classe deverá ter as seguintes características:
altura, largura, comprimento e a responsabilidade de: calcular volume e calcular
área. O cálculo do volume (altura * comprimento * largura) e o cálculo da área
(2 * (altura * largura + altura * comprimento + largura * comprimento)). */

public class TestParalelepipedo{
  public static void main(String[] args){
    Paralelepipedo p1 = new Paralelepipedo(3, 5, 7);
    System.out.println("Largura: " + p1.getLargura());
    System.out.println("Altura: " + p1.getAltura());
    System.out.println("Comprimento: " + p1.getComprimento());
    System.out.println("Volume: " + p1.volume());
    System.out.println("Área: " + p1.area());
  }
}
