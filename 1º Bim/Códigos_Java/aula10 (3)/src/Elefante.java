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
	public String toString(){ 
		return super.toString()+ " tromba:"+tromba; 
	}
	public static void main(String[] args) {
		Elefante e = new Elefante("LELE", "MASC",10);
		Elefante e2 = new Elefante("LELo", "MASC",20);
		Animal an = new Elefante("TETE", "FEMI",15);
		//Elefante e3 = new Animal("asd","MASC");
		Elefante e3 = (Elefante) an;
		
		Elefante rf2 = e;
		Elefante rf3 = e;
		Animal ran = e;
		((Elefante) ran).getTromba();
		
		//Animal an2 = new Animal("aniaml", "FEMI");
		System.out.println(e);
		System.out.println(e2);
		System.out.println(an);
		//System.out.println(an2);
		//System.out.println(an.getTromba());
	
	}
	public String som() {
		return "fon fon ";
	}
	@Override
	public void locomover() {
		System.out.println("CAMINHA Pesado");
	}
}