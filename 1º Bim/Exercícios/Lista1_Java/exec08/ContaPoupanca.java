public class ContaPoupanca{
  private String nomeCliente;
  private int numeroConta;
  private int agencia;
  private double saldo;

  public ContaPoupanca(String pNomeCliente, int pNumeroConta, int pAgencia, double pSaldo){
    this.setNomeCliente(pNomeCliente);
    this.setNumeroConta(pNumeroConta);
    this.setAgencia(pAgencia);
    this.setSaldo(pSaldo);
  }

  public String getNomeCliente(){
    return this.nomeCliente;
  }
  public void setNomeCliente(String pNomeCliente){
    this.nomeCliente = pNomeCliente;
  }

  public int getNumeroConta(){
    return this.numeroConta;
  }
  public void setNumeroConta(int pNumeroConta){
    this.numeroConta = pNumeroConta;
  }

  public int getAgencia(){
    return this.agencia;
  }
  public void setAgencia(int pAgencia){
    this.agencia = pAgencia;
  }

  public double getSaldo(){
    return this.saldo;
  }
  public void setSaldo(double pSaldo){
    this.saldo = pSaldo;
  }

  public double saque(double valorSaque){
    System.out.println("Valor do saque: R$" + valorSaque);
    if(saldo>=0 && valorSaque<=saldo){
      saldo = saldo - valorSaque;
    }else{
      System.out.println("Saldo insuficiente.");
    }
    return saldo;
  }

  public double deposito(double valorDeposito){
    System.out.println("Valor do depósito: R$" + valorDeposito);
    saldo = saldo + valorDeposito;
    return saldo;
  }
}
