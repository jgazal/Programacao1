public class Calculadora{
  private int numero1;
  private int numero2;

  public Calculadora(int pNumero1, int pNumero2) throws Exception{
    this.setNumero1(pNumero1);
    this.setNumero2(pNumero2);
  }

  public int getNumero1(){
    return this.numero1;
  }
  public void setNumero1(int pNumero1){
    this.numero1 = pNumero1;
  }

  public int getNumero2(){
    return this.numero2;
  }
  public void setNumero2(int pNumero2){
    this.numero2 = pNumero2;
  }

  public int adicao(){
    System.out.print("Adição: " + numero1 + " + " + numero2 + " = ");
    return numero1 + numero2;
  }

  public int subtracao(){
    System.out.print("Subtração: " + numero1 + " - " + numero2 + " = ");
    return numero1 - numero2;
  }

  public int multiplicacao(){
    System.out.print("Multiplicação: " + numero1 + " x " + numero2 + " = ");
    return numero1 * numero2;
  }

  public double divisao() throws Exception{
    System.out.print("Divisão: " + numero1 + " / " + numero2 + " = ");
    if(numero2==0){
      throw new Exception("Erro: Divisão por zero");
    }else{
      return numero1 / numero2;
    }
  }

  public double raiz(){
    System.out.print("Raíz: " + "√" + numero1 + " = ");
    return Math.sqrt(numero1);
  }

  public double potencia(){
    System.out.print("Potência: " + numero1 + "²" + " = ");
    return Math.pow(numero1, 2);
  }
}
