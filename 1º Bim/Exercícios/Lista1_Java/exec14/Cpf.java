public class Cpf{
  private String numeroCpf;

  public Cpf(String pNumeroCpf){
    this.setNumeroCpf(pNumeroCpf);
  }

  public String getNumeroCpf(){
    return this.numeroCpf;
  }
  public void setNumeroCpf(String pNumeroCpf){
    this.numeroCpf = pNumeroCpf;
  }

  public boolean validaCPF(){
    if(numeroCpf.length() != 11 || numeroCpf.equals("00000000000")
    || numeroCpf.equals("99999999999")){
      return false;
    }
    String digitos = numeroCpf.substring(0, 9);;
    String dvs = numeroCpf.substring(9, 11);

    String dv1 = validaDigitoCPF(digitos);
    String dv2 = validaDigitoCPF(digitos + dv1);

    return dvs.equals(dv1 + dv2);
  }

  public String validaDigitoCPF(String digitos){
    int peso = digitos.length() + 1;
    int i, dv=0;
    for(i=0; i<digitos.length(); i++){
      dv += Integer.parseInt(digitos.substring(i, i + 1)) * peso;
      peso--;
    }
    dv = 11 - (dv % 11);
    if(dv>9){
      return "0";
    }
    return String.valueOf(dv);
  }
}
