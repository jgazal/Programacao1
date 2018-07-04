public class PrimeiroPrograma
{
  public static void main(String[] args)
  {
    if(args.length==2)
    {
      //System.out.println("Hello World!");
      //System.out.println("Hello World!" + args[0]);
      System.out.println("Hello World!" + args[0] + ":" + args[1]);
    }
    else
    {
      System.out.println("O programa precisa de dois parâmetros.\njava PrimeiroPrograma param1 param2");
    }
  }
}
