/* 5. Desenvolva uma classe que modele um objeto eleitor em conformidade com o
paradigma orientado a objeto. A classe deverá ter as seguintes características:
nome, data de nascimento (dia, mês, ano) e a responsabilidade de calcular o tipo
de eleitor.
        Idade                 Tipo de Eleitor
      Idade < 16                Não Eleitor
      16 <= idade < 18       Eleitor Facultativo
      18 <= idade <= 65      Eleitor Obrigatório
      Idade > 65             Eleitor Facultativo  */

public class TestEleitor{
  public static void main(String[] args){
    Eleitor e1 = new Eleitor("João", 1, 1, 1990);
    System.out.println("Nome: " + e1.getNome());
    System.out.println("Data de Nascimento: " + e1.getDia() + "/" +
    + e1.getMes() + "/" + e1.getAno());
    System.out.println("Idade: " + e1.idade());
    System.out.println("Tipo de Eleitor: " + e1.tipoEleitor());
  }
}
