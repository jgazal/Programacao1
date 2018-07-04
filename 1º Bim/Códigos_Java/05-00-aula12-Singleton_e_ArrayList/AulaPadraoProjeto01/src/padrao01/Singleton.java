package padrao01;

/*
 * Defini��o "Design Patteners" da wikipedia
 * 
 * Os padr�es de projeto de software ou padr�es de desenho de software, tamb�m muito conhecidos 
 * pelo termo original em ingl�s, Design Patterns, descrevem solu��es para problemas recorrentes 
 * no desenvolvimento de sistemas de software orientados a objetos. 
 * 
 * Um padr�o de projeto estabelece um nome e define o problema, a solu��o, 
 * quando aplicar esta solu��o e suas consequ�ncias. Os padr�es de projeto visam facilitar 
 * a reutiliza��o de solu��es de desenho � isto �, solu��es na fase de projeto do software, 
 * sem considerar reutiliza��o de c�digo.  
 * 
 * Tamb�m acarretam um vocabul�rio comum de desenho, facilitando comunica��o, 
 * documenta��o e aprendizado dos sistemas de software.
 */

public class Singleton {
	/* parte referente ao design pattern Single tone */
	private static Singleton instancia;	
	private Singleton(){
		this.contador = 0;
	}
	
	public static Singleton getInstance(){
		if(instancia==null){
			instancia = new Singleton();
		}
		return instancia;
	}
	
	/* parte da classe utilizada para realizar as a��es */
	private int contador;
	
	/**
	 * Incrementa o contador e retorna seu valor
	 * @return valor antes do incremento(ou seja o valor atual antes de incrementar)
	 */
	public int incrementar(){
		return this.contador++;
	}
	
	/** retorna o valor atual do contador
	 * @return
	 */
	public int getContador(){
		return this.contador;
	}
	
}
