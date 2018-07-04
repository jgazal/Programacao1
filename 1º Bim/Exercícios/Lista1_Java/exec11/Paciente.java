public class Paciente{
  private String nome;
  private double peso;
  private double altura;

  public Paciente(String pNome, double pPeso, double pAltura){
    this.setNome(pNome);
    this.setPeso(pPeso);
    this.setAltura(pAltura);
  }

  public String getNome(){
    return this.nome;
  }
  public void setNome(String pNome){
    this.nome = pNome;
  }

  public double getPeso(){
    return this.peso;
  }
  public void setPeso(double pPeso){
    this.peso = pPeso;
  }

  public double getAltura(){
    return this.altura;
  }
  public void setAltura(double pAltura){
    this.altura = pAltura;
  }

  public double imc(){
    return peso/Math.pow(altura, 2);
  }

  public String faixaRiscoPeso(){
    if(imc()<20){
      return "Abaixo do peso ideal.";
    }
    if(imc()>=20 && imc()<=25){
      return "Peso normal.";
    }
    if(imc()>25 && imc()<=30){
      return "Excesso de peso.";
    }
    if(imc()>30 && imc()<=35){
      return "Obesidade.";
    }else{
      return "Obesidade Mórbida.";
    }
  }

  /*public double imc(){
    double imc = peso/Math.pow(altura, 2);

    if(imc<20){
      System.out.println("Abaixo do peso ideal.");
    }
    if(imc>=20 && imc<=25){
      System.out.println("Peso normal.");
    }
    if(imc>25 && imc<=30){
      System.out.println("Excesso de peso.");
    }
    if(imc>30 && imc<=35){
      System.out.println("Obesidade.");
    }
    if(imc>35){
      System.out.println("Obesidade Mórbida.");
    }
    return imc;
  }*/
}
