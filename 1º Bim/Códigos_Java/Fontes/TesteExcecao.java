import java.util.Scanner;

public class TesteExcecao{
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int numero1 = 0;
    try{
      numero1 = leitor.nextInt();
      System.out.println("Digitado: " + numero1);
      int zeroDividido = 10/numero1;
      double outroErro = Math.pow(numero1, 0.5);
      System.out.println("Teste: " + outroErro);
      double outroErro2 = Math.sqrt(numero1);
      System.out.println("Teste2: " + outroErro2);
    }catch(ArithmeticException e){
      System.out.println("Erro aritmético: " + e.getMessage());
    }catch(Exception e){
      System.out.println("Dado inválido");
      e.printStackTrace();
    }
    System.out.println("Fim");
    //System.out.println("Digitado: " + numero1);
  }
}
