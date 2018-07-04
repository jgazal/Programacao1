/* 7. Desenvolva uma classe que modele um objeto cone em conformidade com o paradigma
orientado a objeto. A classe deverá ter as seguintes características: raio, altura
e aresponsabilidade de: cálculo da geratriz, área lateral, área total e o volume.
Obs.: os valores do raio e da altura não podem ser negativos. O cálculo da geratriz
é (Raiz Quadrada((altura²)+(raio2))), da área lateral é (3.1415*raio*geratriz),
da área total é (3.1415*raio*(geratriz+raio)) e do volume é
(1.0/3.0*3.1415*raio *altura). */

public class TestCone{
  public static void main(String[] args){
    try{
      Cone c1 = new Cone(10, 5);
      System.out.println("Raio: " + c1.getRaio());
      System.out.println("Altura: " + c1.getAltura());
      System.out.println("Geratriz: " + c1.geratriz());
      System.out.println("Área Lateral: " + c1.areaLateral());
      System.out.println("Áreal Total: " + c1.areaTotal());
      System.out.println("Volume: " + c1.volume());
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
