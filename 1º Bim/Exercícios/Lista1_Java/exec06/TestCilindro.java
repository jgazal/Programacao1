/* 6. Desenvolva uma classe que modele um objeto cilindro em conformidade com o
paradigma orientado a objeto. A classe deverá ter as seguintes características:
raio, altura e a responsabilidade de: cálculo da área lateral, área total e volume.
Obs.: os valores do raio e da altura não podem ser negativos. O cálculo da área
lateral é (2*3.1415*raio*altura), área total (2*3.1415*raio*(altura+raio)) e
volume (3.1415*raio*raio*altura). */

public class TestCilindro{
  public static void main(String[] args){
    try{
      Cilindro c1 = new Cilindro(10, 5);
      System.out.println("Raio: " + c1.getRaio());
      System.out.println("Altura: " + c1.getAltura());
      System.out.println("Área Lateral: " + c1.areaLateral());
      System.out.println("Área Total: " + c1.areaTotal());
      System.out.println("Volume: " + c1.volume());
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
