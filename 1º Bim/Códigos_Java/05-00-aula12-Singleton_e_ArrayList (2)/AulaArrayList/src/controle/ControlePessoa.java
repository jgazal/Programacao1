package controle;

import java.util.ArrayList;

import modelo.Pessoa;

public class ControlePessoa {
	private ArrayList<Pessoa> listPessoas;
	
	/**
	 * Construtor padrão
	 */
	public ControlePessoa(){
		listPessoas = new ArrayList<Pessoa>();		
	}
	
	/**
	 * inclui uma pessoa na lista
	 * @param p pessoa a ser incluída
	 */
	public void incluir(Pessoa p){
		listPessoas.add(p);
	}
	
	/**
	 * exemplo de utilização de exceção para retornar mensagem
	 * Metodo para obeter uma pessoa da lista pela posição
	 * @param posicao posição da pessoa que se deja da lista
	 * @return retorna a pessoa caso exista.
	 * @throws RuntimeException
	 */
	public Pessoa getPessoaDaPosicao(int posicao) throws RuntimeException{
		if(posicao <0 || posicao > listPessoas.size()-1){
			new RuntimeException("Posição da lista inválida!");
		}
		return listPessoas.get(posicao);
	}
	/*  */
	/**
	 * exemplo de utilização de exceção para retornar mensagem
	 * remove uma pessoa da lista passando-se a posição
	 * @param posicao posição da pessoa da lista a ser removida
	 * @return retorna a pessoa removida
	 * @throws RuntimeException
	 */
	public Pessoa removePessoaDaPosicao(int posicao) throws RuntimeException{
		if(posicao <0 || posicao > listPessoas.size()-1){
			new RuntimeException("Posição da lista inválida!");
		}
		return listPessoas.remove(posicao);
	}
	
	/* exemplo de sobrecarga/overload dois metodos com mesmo nome mas parâmetros diferentes */
	/**
	 * exemplo de sobrecarga/overload dois metodos com mesmo nome mas parâmetros diferentes
	 * @param p pessoa que se deseje remover
	 * @return returna true se for removido false caso contrário
	 * @throws RuntimeException
	 */
	public boolean removePessoaDaPosicao(Pessoa p) throws RuntimeException{
		if( p == null){
			new RuntimeException("Null passado");
		}
		return listPessoas.remove(p);
	}
	
	/**
	 * Obtem a lista completa para uso
	 * @return
	 */
	public ArrayList<Pessoa> getListPessoas(){
		return this.listPessoas;
	}
}
