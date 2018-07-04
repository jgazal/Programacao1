/* 9. Desenvolva uma classe que modele um objeto funcionário em conformidade com
o paradigma orientado a objeto. A classe deverá ter as seguintes características:
nome do funcionário, CPF, número de horas trabalhadas, valor da hora de trabalho
e a responsabilidade de calcular o salário (número de horas trabalhadas * valor da
hora de trabalho). */

public class TestFuncionario{
  public static void main(String[] args){
    Funcionario f1 = new Funcionario("Joao", 1234567891, 8, 50);
    System.out.println("Nome: " + f1.getNome());
    System.out.println("CPF: " + f1.getCpf());
    System.out.println("Horas Trabalhadas: " + f1.getHorasTrabalhadas());
    System.out.println("Valor Hora: " + f1.getValorHora());
    System.out.println("Salário: R$" + f1.salario());
  }
}
