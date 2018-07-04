package teste;

import java.util.List;

import controle.ControlePessoa;
import modelo.Pessoa;

public class TesteControlePessoa {
	public void teste(){
		ControlePessoa c = new ControlePessoa();
		
		Pessoa p = new Pessoa(1,"José da Silva","(62) 33247070");
		c.incluir(p);
		
		p = new Pessoa(2,"Terezinha tereza","62-23232323");
		c.incluir(p);
		
		p = new Pessoa(3,"Joãozinho","62-3232323");		
		c.incluir(p);
		
		/*for(Pessoa p2: c.getListPessoas()){
			System.out.println("Pessoa --> "+p2);
		}*/
		this.imprimirListaPessoa(c.getListPessoas());
		
		c.removePessoaDaPosicao(1);	
		
		System.out.println("========== depois remoção ============");
		/*for(Pessoa p2: c.getListPessoas()){
			System.out.println("Pessoa --> "+p2);
		}*/
		this.imprimirListaPessoa(c.getListPessoas());
		
		c.removePessoaDaPosicao(p);	
		
		System.out.println("========== depois remoção ============");
		/*for(Pessoa p2: c.getListPessoas()){
			System.out.println("Pessoa --> "+p2);
		}*/
		this.imprimirListaPessoa(c.getListPessoas());
		
		
	}
	public void imprimirListaPessoa(List<Pessoa> list){
		for(Pessoa p2: list){
			System.out.println("Pessoa --> "+p2);
		}
	}
	
	
	public static void main(String[] args) {
		TesteControlePessoa tcp = new TesteControlePessoa();
		
		tcp.teste();
	}
}
