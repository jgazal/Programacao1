public class Funcionario{
  private String nome;
  private double salario;
  private int numeroFilhos;

  public Funcionario(String pNome, double pSalario, int pNumeroFilhos){
    this.setNome(pNome);
    this.setSalario(pSalario);
    this.setNumeroFilhos(pNumeroFilhos);
  }

  public String getNome(){
    return this.nome;
  }
  public void setNome(String pNome){
    this.nome = pNome;
  }

  public double getSalario(){
    return this.salario;
  }
  public void setSalario(double pSalario){
    this.salario = pSalario;
  }

  public int getNumeroFilhos(){
    return this.numeroFilhos;
  }
  public void setNumeroFilhos(int pNumeroFilhos){
    this.numeroFilhos = pNumeroFilhos;
  }

  public double aumentoSalario(double aumentaSalario){
    salario = salario + (salario*(aumentaSalario/100));
    return salario;
  }

  public double descontoIR(){
    return numeroFilhos*1250.25;
  }

  public double INSS(){
    if(salario<=2545){
      return salario*0.06;
    }else{
      return salario*0.1;
    }
  }
}
