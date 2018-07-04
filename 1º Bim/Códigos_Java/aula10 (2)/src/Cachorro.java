public class Cachorro extends Animal{
	public Cachorro(String nome,String sexo){
		super(nome,sexo,4);
	}
	public static void main(String[] args) {
		Animal a = new Animal("JOJO","Masculino",1);
		Cachorro c = new Cachorro("COCO", "M");
		Animal b = new Cachorro("TOTO", "F");
		Cachorro d = (Cachorro) new Animal("sd", "M");
		System.out.println(a);
		System.out.println(c);
	}
}