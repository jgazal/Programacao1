/* 1. Desenvolva uma classe que modelo um objeto pessoa com os seguintes dados:
      • nome;
      • idade;
      • peso;
      • altura;
Os objetos têm a seguinte responsabilidade:
• calcular o IMC (peso/altura²) */

public class TestPessoa {
  public static void main(String[] args) {
    try{
      Pessoa p1 = new Pessoa("João", 18, 80.0, 1.83);
      System.out.println("Nome: " + p1.getNome());
      System.out.println("Idade: " + p1.getIdade());
      System.out.println("Peso: " + p1.getPeso());
      System.out.println("Altura: " + p1.getAltura());
      System.out.println("IMC: " + p1.IMC());
    }catch(Exception e){
			e.printStackTrace();
    }
  }
}
