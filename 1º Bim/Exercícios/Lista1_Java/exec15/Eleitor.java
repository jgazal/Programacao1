public class Eleitor{
  private String nome;
  private int dia;
  private int mes;
  private int ano;

  public Eleitor(String pNome, int pDia, int pMes, int pAno){
    this.setNome(pNome);
    this.setDia(pDia);
    this.setMes(pMes);
    this.setAno(pAno);
  }

  public String getNome(){
    return this.nome;
  }
  public void setNome(String pNome){
    this.nome = pNome;
  }

  public int getDia(){
    return this.dia;
  }
  public void setDia(int pDia){
    this.dia = pDia;
  }

  public int getMes(){
    return this.dia;
  }
  public void setMes(int pMes){
    this.mes = pMes;
  }

  public int getAno(){
    return this.ano;
  }
  public void setAno(int pAno){
    this.ano = pAno;
  }

  public int idade(){
    int idade1 = 2018-ano;
    return idade1;
  }

  public String tipoEleitor(){
    if(idade()<16){
      return "Não eleitor";
    }
    if(idade()>=16 && idade()<18){
      return "Eleitor facultativo";
    }
    if(idade()>=18 && idade()<=65){
      return "Eleitor Obrigatório";
    }else{
      return "Eleitor Facultativo";
    }
  }
}
