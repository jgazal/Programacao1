public class Funcionario{
  private String nome;
  private int cpf;
  private double horasTrabalhadas;
  private double valorHora;

  public Funcionario(String pNome, int pCpf, double pHorasTrabalhadas, double pValorHora){
    this.setNome(pNome);
    this.setCpf(pCpf);
    this.setHorasTrabalhadas(pHorasTrabalhadas);
    this.setValorHora(pValorHora);
  }

  public String getNome(){
    return this.nome;
  }
  public void setNome(String pNome){
    this.nome = pNome;
  }

  public int getCpf(){
    return this.cpf;
  }
  public void setCpf(int pCpf){
    this.cpf = pCpf;
  }

  public double getHorasTrabalhadas(){
    return this.horasTrabalhadas;
  }
  public void setHorasTrabalhadas(double pHorasTrabalhadas){
    this.horasTrabalhadas = pHorasTrabalhadas;
  }

  public double getValorHora(){
    return this.valorHora;
  }
  public void setValorHora(double pValorHora){
    this.valorHora = pValorHora;
  }

  public double salario(){
    return horasTrabalhadas*valorHora;
  }
}
