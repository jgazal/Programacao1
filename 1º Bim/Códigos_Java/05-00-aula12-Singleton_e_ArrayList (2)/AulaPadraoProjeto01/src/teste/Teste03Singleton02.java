package teste;

import padrao01.Contador;

public class Teste03Singleton02 {
	Contador cont = new Contador();
	
	/* metodo para primeiro teste */
	public void testeClasseSingleton01(){
		
		System.out.println("Primeira inoca��o, valor:"+cont.incrementar());
		System.out.println("Segunda invoca��o, Obtendo o valor: "+cont.getContador());
		System.out.println("Terceira invoca��o, incremento: "+ cont.incrementar());
		System.out.println("Quarta invocacao, obtendo o valor:" +cont.getContador() );
	}
	
	/* metodo para segundo teste  */
	public void testeClasseSingleton02(){

		System.out.println("Primeira inoca��o, valor:"+cont.incrementar());
		System.out.println("Segunda invoca��o, Obtendo o valor: "+cont.getContador());
		System.out.println("Terceira invoca��o, incremento: "+ cont.incrementar());
		System.out.println("Quarta invocacao, obtendo o valor:" +cont.getContador() );
	}
	
	/* metodo para terceiro teste com m�todo est�tico 
	 * No m�todo est�tico n�o � poss�vel acessar atributos n�o est�ticos
	 * */
	public static void testeClasseSingleton03(){
		Contador cont = new Contador();
		System.out.println("Primeira inoca��o, valor:"+cont.incrementar());
		System.out.println("Segunda invoca��o, Obtendo o valor: "+cont.getContador());
		System.out.println("Terceira invoca��o, incremento: "+ cont.incrementar());
		System.out.println("Quarta invocacao, obtendo o valor:" +cont.getContador() );
	}
	

	public static void main(String[] args) {
		Teste03Singleton01 test1 = new Teste03Singleton01();
		
		test1.testeClasseSingleton01();
		System.out.println("-----------------");
		test1.testeClasseSingleton02();
		System.out.println("-----------------");
		Teste03Singleton02.testeClasseSingleton03();
		
		System.out.println("===================");
		
		/* uso da classe dois */
		Teste03Singleton02 test2 = new Teste03Singleton02();
		test2.testeClasseSingleton01();
		System.out.println("-----------------");
		test2.testeClasseSingleton02();
		System.out.println("-----------------");
		Teste03Singleton02.testeClasseSingleton03();
	}
}
