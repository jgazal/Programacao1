public class Teste{
	public static void main(String[] args){
		Animal[] vetAnimal = new Animal[3];
		
		Cachorro c = new Cachorro("Bill","Masculino");
		Elefante e = new Elefante("Dumbo","Masculino",5);
		Animal a = new Cachorro("Animal","SEXO");
		
		vetAnimal[0] = c;
		vetAnimal[1] = e;
		vetAnimal[2] = a;
		
		for(int i=0 ; i<vetAnimal.length ; i++){	
			System.out.println("----------");
			System.out.println("Tipo:"+vetAnimal[i].getClass().getSimpleName());
			System.out.println(vetAnimal[i]);
			System.out.print("Tipo Locomocao:");
			vetAnimal[i].locomover();
			
			if(vetAnimal[i] instanceof Elefante) {
				System.out.println(
						"Tamanho da Tromba:"+
				((Elefante)vetAnimal[i]).getTromba()
						);
			}
			System.out.println(
			vetAnimal[i].getClass().getSimpleName()+":"
			+vetAnimal[i].toString()+" SOM:"+vetAnimal[i].som()
			);
		}
	}
}