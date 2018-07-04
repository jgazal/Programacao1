package padrao01;

/*
 * Definição "Design Patteners" da wikipedia
 * 
 * Os padrões de projeto de software ou padrões de desenho de software, também muito conhecidos 
 * pelo termo original em inglês, Design Patterns, descrevem soluções para problemas recorrentes 
 * no desenvolvimento de sistemas de software orientados a objetos. 
 * 
 * Um padrão de projeto estabelece um nome e define o problema, a solução, 
 * quando aplicar esta solução e suas consequências. Os padrões de projeto visam facilitar 
 * a reutilização de soluções de desenho – isto é, soluções na fase de projeto do software, 
 * sem considerar reutilização de código.  
 * 
 * Também acarretam um vocabulário comum de desenho, facilitando comunicação, 
 * documentação e aprendizado dos sistemas de software.
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
	
	/* parte da classe utilizada para realizar as ações */
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
