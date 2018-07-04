import java.util.Scanner;

public class TestPessoa {
  public static void main(String[] args) {
    Pessoa p1 = null;
    try{
      p1 = new Pessoa("João", 18, 80.0, 1.83);
      //p1.setIdade(-18);
      //p1.setPeso(-200);
      int vIdade = -1;
      do{
        try{
          System.out.println("Digite a Idade: ");
          vIdade = leitor.nextInt();
          p1.setIdade(vIdade);
        }catch(Exception e){
          System.out.println("Houve um erro na idade (" + e.getMessage() + "). Por favor atenção.");
        }
      }while(vIdade>0);

    }catch(Exception e){
      System.out.println("Erro ao criar pessoa: " + e.getMessage());
      e.printStackTrace();
    }
    System.out.println("Nome: " + p1.getNome());
    System.out.println("Idade: " + p1.getIdade());
  }
}
