package teste;

import padrao01.Contador;
import padrao01.Singleton;

/**
 * Classe para ensinar Uso de Met�dos Est�ticos  e uso de uma classe normal
 * @author guili
 *
 */
public class Teste01Singleton {
	/* metodo para primeiro teste*/
	public void testeClasseSingleton01(){
		Contador cont = new Contador();
		System.out.println("Primeira inoca��o, valor:"+cont.incrementar());
		System.out.println("Segunda invoca��o, Obtendo o valor: "+cont.getContador());
		System.out.println("Terceira invoca��o, incremento: "+ cont.incrementar());
		System.out.println("Quarta invocacao, obtendo o valor:" +cont.getContador() );
	}
	
	/* metodo para segundo teste */
	public void testeClasseSingleton02(){
		Contador cont = new Contador();
		System.out.println("Primeira inoca��o, valor:"+cont.incrementar());
		System.out.println("Segunda invoca��o, Obtendo o valor: "+cont.getContador());
		System.out.println("Terceira invoca��o, incremento: "+ cont.incrementar());
		System.out.println("Quarta invocacao, obtendo o valor:" +cont.getContador() );
	}
	
	/* metodo para terceiro teste com m�todo est�tico*/
	public static void testeClasseSingleton03(){
		Contador cont = new Contador();
		System.out.println("Primeira inoca��o, valor:"+cont.incrementar());
		System.out.println("Segunda invoca��o, Obtendo o valor: "+cont.getContador());
		System.out.println("Terceira invoca��o, incremento: "+ cont.incrementar());
		System.out.println("Quarta invocacao, obtendo o valor:" +cont.getContador() );
	}
	

	public static void main(String[] args) {
		Teste01Singleton test = new Teste01Singleton();
		
		test.testeClasseSingleton01();
		System.out.println("-----------------");
		test.testeClasseSingleton02();
		System.out.println("-----------------");
		Teste01Singleton.testeClasseSingleton03();
	}
}
