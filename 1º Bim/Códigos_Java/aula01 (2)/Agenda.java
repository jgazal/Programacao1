package aula01;

public class Agenda {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		BlocoDeNotas blocoDeNotas = new BlocoDeNotas();

		p.setNome("carlos");
		p.setEndereco("rua 3 n. 4");
		p.setFone(1111);
		blocoDeNotas.inserirPessoa(p);

		p = new Pessoa();
		p.setNome("joaquim");
		p.setEndereco("rua t-2 n. 5");
		p.setFone(2222);
		blocoDeNotas.inserirPessoa(p);

		p = new Pessoa();
		p.setNome("pedro");
		p.setEndereco("rua 43 n. 9");
		p.setFone(3333);
		blocoDeNotas.inserirPessoa(p);

		
		System.out.println("Quantidade de pessoas cadastradas: "+ blocoDeNotas.quantidadePessoas());

		if(blocoDeNotas.consultarNome("pedro"))
		{
			System.out.println("o nome pedro existe na colecao de pessoas");
		}
		else
		{
			System.out.println("o nome pedro nao existe na colecao pessoas");
		}


		System.out.println("O endereco de pedro eh:"+blocoDeNotas.obterPessoaConsulta().getEndereco());

		System.out.println("A pessoa na primeira posicao eh: "+blocoDeNotas.obterPessoaIndice(1).getNome());
		
		System.out.println("A pessoa na segunda posicao eh: "+blocoDeNotas.obterPessoaIndice(2).getNome());
	
	}
}
