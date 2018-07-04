package padrao01;

public class Contador {
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
