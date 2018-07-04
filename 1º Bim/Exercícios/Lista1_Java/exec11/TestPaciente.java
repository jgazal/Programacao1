/* 11. Desenvolva uma classe que modele um objeto paciente em conformidade com o
paradigma orientado a objeto. A classe deverá ter as seguintes características:
nome, peso, altura, e a responsabilidade de calcular IMC e calcular a faixa de
risco conforme o peso. O cálculo do IMC = peso/(altura 2).
          IMC                     Faixa de Risco
      abaixo de 20             abaixo do peso ideal
      a partir de 20 até 25         peso normal
      acima de 25 até 30          excesso de peso
      acima de 30 até 35             obesidade
      acima de 35               obesidade mórbida  */

public class TestPaciente{
  public static void main(String[] args){
    Paciente p1 = new Paciente("João", 150, 1.84);
    System.out.println("Nome: " + p1.getNome());
    System.out.println("Peso: " + p1.getPeso());
    System.out.println("Altura: " + p1.getAltura());
    System.out.println("IMC: " + p1.imc());
    System.out.println("Faixa de risco conforme peso: " + p1.faixaRiscoPeso());
  }
}
