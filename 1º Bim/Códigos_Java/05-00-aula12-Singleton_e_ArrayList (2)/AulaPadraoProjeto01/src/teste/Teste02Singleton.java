package teste;

import padrao01.Contador;
import padrao01.Singleton;

/**
 * Classe para ensinar Uso de Met�dos Est�ticos 
 * @author guili
 *
 */
public class Teste02Singleton {
	
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
		Teste02Singleton test = new Teste02Singleton();
		
		test.testeClasseSingleton01();
		System.out.println("-----------------");
		test.testeClasseSingleton02();
		System.out.println("-----------------");
		Teste02Singleton.testeClasseSingleton03();
	}
}
