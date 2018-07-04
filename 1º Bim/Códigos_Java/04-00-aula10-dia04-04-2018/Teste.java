public class Teste{
	public static void main(String[] args){
		Animal[] vetAnimal = new Animal[2];
		
		Cachorro c = new Cachorro("Bill","Masculino");
		Elefante e = new Elefante("Dumbo","Masculino",5);
		
		vetAnimal[0] = c;
		vetAnimal[1] = e;
		
		for(int i=0 ; i<vetAnimal.length ; i++){
			vetAnimal[i].setTromba(i+10);
			System.out.println(
			vetAnimal[i].getClass().getSimpleName()+":"+vetAnimal[i].toString()
			);
		}
	}
}