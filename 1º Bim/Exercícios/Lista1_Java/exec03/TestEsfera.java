/* 3. Desenvolva uma classe que modele um objeto esfera em conformidade com o
paradigma orientado a objeto. A classe deverá conter as seguintes características:
raio e as seguintes responsabilidades: cálculo da área e do volume da esfera.
Obs.: o valor do raio não pode ser negativo.
A área total = (4*3.1415*raio²) e volume = ((4/3)*3.1415*raio³). */

public class TestEsfera {
  public static void main(String[] args) {
    try{
      Esfera e1 = new Esfera(10);
      System.out.println("Raio: " + e1.getRaio());
      System.out.println("Área: " + e1.area());
      System.out.println("Volume: " + e1.volume());
    }catch(Exception e){
			e.printStackTrace();
    }
  }
}
