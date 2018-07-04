/* 4. Desenvolva uma classe que modele um objeto retângulo em conformidade com o
paradigma orientado a objeto. A classe deverá ter as seguintes características:
comprimento, largura e a responsabilidade de: calcular o perímetro e a área do
retângulo. Obs.: os valores da largura e do comprimento não podem ser negativos.
O cálculo da área (largura * comprimento) e do perímetro (soma dos quatro lados). */

public class TestRetangulo{
  public static void main(String[] args){
    try{
      Retangulo r1 = new Retangulo(10, 5);
      System.out.println("Comprimento: " + r1.getComprimento());
      System.out.println("Largura: " + r1.getLargura());
      System.out.println("Perímetro: " + r1.perimetro());
      System.out.println("Área: " + r1.area());
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
