
public class BlocoDeNotas {
	public static int TAMANHO_BD = 5;
	private Pessoa[] baseDados ;
	private int indiceutilizacao;
	private int indice;
	private int consultarealizada;

	public BlocoDeNotas() {
		indiceutilizacao = 0;
		indice = -1;// a persistencia inicialmente
					// nao faz referencia a nenhuma
					// pessoa
		consultarealizada = 0;// consulta nao realizada
		baseDados = new Pessoa[TAMANHO_BD];
	}

	public boolean inserirPessoa(Pessoa pessoa){
		if(consultarNome(pessoa.getNome()))
		{
			return false;//nome existente na base de dados
		}

		if(indiceutilizacao > TAMANHO_BD)
		{
			return false;//colecao cheia
		}
		else
		{
			baseDados[indiceutilizacao] = pessoa;
			indiceutilizacao++;
			return true;//inclusao com sucesso
		}
	}
	public boolean excluir(Pessoa pessoa)
	{

		if(indiceutilizacao<=0)
			{
				return false;//persistencia vazia
			}
		else
			{
				if(consultarealizada>0) //consultarealizada == 1
				{
					pessoa = baseDados[indice];
					for(;indice < indiceutilizacao ; indice++)
					{
						baseDados[indice] = baseDados[indice-1];
					}
					consultarealizada = 0;
					indiceutilizacao--;
					return true;//exclusao realizada
				}
				else
				{
					return false;//nenhuma consulta foi realizada
				}
			}

	}

	public boolean consultarNome(String nome)
	{
		int contador;

		for(contador=0; contador < indiceutilizacao ; contador++)
		{
			if(baseDados[contador].getNome().equals(nome))
			{
				indice = contador;
				consultarealizada = 1;
				return true;//pessoa encontrada
			}
		}
		return false;//pessoa nao encontrada
	}

	public Pessoa obterPessoaConsulta()
	{
		if(consultarealizada>0)
		{
			consultarealizada= 0;
			return baseDados[indice];

		}
		else
		{
			return null;
		}
	}

	public Pessoa obterPessoaIndice(int i)
	{

		if( (i>=1) && (i<= indiceutilizacao) )
		{
			return baseDados[i-1];
		}
		else
		{
			return null;
		}
	}

	public int quantidadePessoas()
	{
		return indiceutilizacao;
	}
}
