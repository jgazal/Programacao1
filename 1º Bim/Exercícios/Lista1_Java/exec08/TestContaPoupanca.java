/* 8. Desenvolva uma classe que modele um objeto conta poupança em conformidade
com o paradigma orientado a objeto. A classe deverá ter as seguintes características:
nome do cliente, número da conta, agencia e as responsabilidades de permitir
determinar o saldo e de realizar: saque e deposito de dinheiro.*/

import java.util.Scanner;

public class TestContaPoupanca{
  public static void main(String[] args){
    ContaPoupanca cp1 = new ContaPoupanca("João", 123, 01, 3553.25);

    Scanner leitor = new Scanner(System.in);
    double valorSaque, valorDeposito;

    System.out.println("Nome: " + cp1.getNomeCliente());
    System.out.println("Conta e Agência: " + cp1.getNumeroConta() + "-" + cp1.getAgencia());
    System.out.println("Saldo: R$" + cp1.getSaldo());

    System.out.print("Saque: R$");
    valorSaque = leitor.nextDouble();
    cp1.saque(valorSaque);
    System.out.println("Novo Saldo: R$" + cp1.getSaldo());

    System.out.print("Depósito: R$");
    valorDeposito = leitor.nextDouble();
    cp1.deposito(valorDeposito);
    System.out.println("Novo Saldo: R$" + cp1.getSaldo());
  }
}
