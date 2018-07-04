package teste;

import padrao01.Singleton;

/**
 * Classe para ensinar Uso de Met�dos Est�ticos e utiliza��o de classe 
 * que implementem o padr�o de projeto Singleton
 * @author guili
 *
 */
public class Teste04Singleton {
	/* metodo para primeiro teste de singleton */
	public void testeClasseSingleton01(){
		System.out.println("Primeira inoca��o, valor:"+Singleton.getInstance().incrementar());
		System.out.println("Segunda invoca��o, Obtendo o valor: "+Singleton.getInstance().getContador());
		System.out.println("Terceira invoca��o, incremento: "+ Singleton.getInstance().incrementar());
		System.out.println("Quarta invocacao, obtendo o valor:" +Singleton.getInstance().getContador() );
	}
	
	/* metodo para segundo teste de singleton */
	public void testeClasseSingleton02(){
		System.out.println("Primeira inoca��o, valor:"+Singleton.getInstance().incrementar());
		System.out.println("Segunda invoca��o, Obtendo o valor: "+Singleton.getInstance().getContador());
		System.out.println("Terceira invoca��o, incremento: "+ Singleton.getInstance().incrementar());
		System.out.println("Quarta invocacao, obtendo o valor:" +Singleton.getInstance().getContador() );
	}
	
	/* metodo para terceiro teste de singleton  com m�todo est�tico*/
	public static void testeClasseSingleton03(){
		System.out.println("Primeira inoca��o, valor:"+Singleton.getInstance().incrementar());
		System.out.println("Segunda invoca��o, Obtendo o valor: "+Singleton.getInstance().getContador());
		System.out.println("Terceira invoca��o, incremento: "+ Singleton.getInstance().incrementar());
		System.out.println("Quarta invocacao, obtendo o valor:" +Singleton.getInstance().getContador() );
	}
	

	public static void main(String[] args) {
		Teste04Singleton test = new Teste04Singleton();
		
		test.testeClasseSingleton01();
		System.out.println("-----------------");
		test.testeClasseSingleton02();
		System.out.println("-----------------");
		Teste04Singleton.testeClasseSingleton03();
	}
}
