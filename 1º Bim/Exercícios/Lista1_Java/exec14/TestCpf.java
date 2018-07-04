/* 14. Desenvolva uma classe que modele um objeto cpf em conformidade com o
paradigma orientado a objeto. O objeto deve ter a responsabilidade de determinar
se os dígitos verificadores do CPF estão corretos. */

public class TestCpf{
  public static void main(String[] args){
    String cpf = "12345678910"; //"54647142949" - True | "12312312309" - False
    Cpf c1 = new Cpf(cpf);
    boolean cpfValido = c1.validaCPF();
    System.out.println("CPF: " + c1.getNumeroCpf());
    System.out.println("Dígito verificador correto? " + cpfValido);
  }
}
