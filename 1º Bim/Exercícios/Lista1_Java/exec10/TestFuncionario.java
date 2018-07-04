/* 10. Desenvolva uma classe que modele um objeto funcionário em conformidade
com o paradigma orientado a objeto. A classe deverá ter as seguintes características:
nome, salário, número de filhos e as responsabilidades de: calcular aumento de
salário (a porcentagem é fornecida por parâmetro); calcular desconto no imposto
de renda (R$1250,25 por filho) e calcular INSS (6% para salário <= R$2545,00 e
10% para o restante). */

import java.util.Scanner;

public class TestFuncionario{
  public static void main(String[] args){
    Funcionario f1 = new Funcionario("João", 4500, 3);

    Scanner leitor = new Scanner(System.in);
    double aumentaSalario;

    System.out.println("Nome: " + f1.getNome());
    System.out.println("Salário: R$" + f1.getSalario());
    System.out.println("Filhos: " + f1.getNumeroFilhos());

    System.out.print("Aumento do Salário (%): ");
    aumentaSalario = leitor.nextDouble();
    f1.aumentoSalario(aumentaSalario);
    System.out.println("Novo Salário: R$" + f1.getSalario());

    System.out.println("Desconto IR: " + f1.descontoIR());
    System.out.println("INSS: " + f1.INSS());
  }
}
