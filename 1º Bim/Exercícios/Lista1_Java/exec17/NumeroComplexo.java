public class NumeroComplexo{
  private double parteReal;
  private double parteImaginaria;
  private double i = Math.sqrt(-1);

  public NumeroComplexo(double pParteReal, double pParteImaginaria){
    this.setParteReal(pParteReal);
    this.setParteImaginaria(pParteImaginaria);
  }

  public double getParteReal(){
    return this.parteReal;
  }
  public void setParteReal(double pParteReal){
    this.parteReal = pParteReal;
  }

  public double getParteImaginaria(){
    return this.parteImaginaria;
  }
  public void setParteImaginaria(double pParteImaginaria){
    this.parteImaginaria = pParteImaginaria;
  }

  public String numComplexo(){
    return "Forma do Número Complexo: Z1 = " + parteReal + " + " + parteImaginaria + "*i(" +
    + parteReal + " + " + parteImaginaria + "i)";
  }

  public String obterNumero(){
    return parteReal + " + " + parteImaginaria + "i";
  }

  public boolean verificaIgualdade(double nc1a, double nc1b, double nc2c, double nc2d){
    if(nc1a == nc2c && nc1b == nc2d){
      return true;
    }
    else{
      return false;
    }
  }

  public String adicaoNumeroComplexo(double nc1a, double nc1b, double nc2c, double nc2d){
    double somaReal = nc1a + nc2c;
    double somaImaginario = nc1b + nc2d;
    return somaReal + " + " + somaImaginario + "i";
  }

  public String subtracaoNumeroComplexo(double nc1a, double nc1b, double nc2c, double nc2d){
    double subtraiReal = nc1a - nc2c;
    double subtraiImaginario = nc1b - nc2d;
    return subtraiReal + " + " + subtraiImaginario + "i";
  }

  public String multiplicacaoNumeroComplexo(double nc1a, double nc1b, double nc2c, double nc2d){
    double multiplicaReal = nc1a * nc2c;
    double multiplicaImaginario = nc1b * nc2d;
    double mult1 = multiplicaReal - multiplicaImaginario;

    double multiplicaRealImag1 = nc1a * nc2d;
    double multiplicaRealImag2 = nc1b * nc2c;
    double mult2 = multiplicaRealImag1 + multiplicaRealImag2;

    return mult1 + " + " + mult2 + "i";
  }

  public String divisaoNumeroComplexo(double nc1a, double nc1b, double nc2c, double nc2d){
    double multiplicaReal = nc1a * nc2c;
    double multiplicaImaginario = nc1b * nc2d;
    double mult1 = multiplicaReal + multiplicaImaginario;
    double div1 = mult1/(Math.pow(nc2c, 2) + Math.pow(nc2c, 2));

    double multiplicaRealImag1 = nc1b * nc2c;
    double multiplicaRealImag2 = nc1a * nc2d;
    double mult2 = multiplicaRealImag1 - multiplicaRealImag2;
    double div2 = mult2/(Math.pow(nc2c, 2) + Math.pow(nc2c, 2));

    return div1 + " + " + div2 + "i";
  }
}
