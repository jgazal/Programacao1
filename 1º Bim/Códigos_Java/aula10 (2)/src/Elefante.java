public class Elefante extends Animal{
	public int tromba;
	public void setTromba(int tam){this.tromba = tam;	}
	public int getTromba(){ return this.tromba; };
	
	public Elefante(String nome,String sexo){
		super(nome,sexo);
	}
	public Elefante(String nome,String sexo, int tromba){
		super(nome,sexo);
		setTromba(tromba);
	}
	public String toString(){ return super.toString()+ " tromba:"+tromba; }
}