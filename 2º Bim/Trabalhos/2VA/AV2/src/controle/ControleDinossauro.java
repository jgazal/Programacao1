package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import conexao.ConectaBD;
import modelo.Dinossauro;

/* 
 * Classe de controle, possui os métodos de editar, excluir, salvar, buscar e validar.
 */

public class ControleDinossauro{
	
	public ControleDinossauro() {
		this.listar();
	}
	
	/* 
	 * Método obter a lista de dinossauros.
	 * @return listar() retorna a lista de dinossauros.
	 */

	public List<Dinossauro> getDinossauros(){
		return listar();
	}
	
	/* 
	 * Método para setar as variáveis do dinossauro.
	 * @param dinossauro dinossauro a ser setado.
	 * @param sql parâmetro sql.
	 */
	
	public void setaVariaveis(Dinossauro dinossauro, String sql) {
		Connection conexao = ConectaBD.ConexaoBD();
		PreparedStatement setaVariavel = null;
		
		try {
			setaVariavel = conexao.prepareStatement(sql);
			setaVariavel.setString(1, dinossauro.getNome());
			setaVariavel.setString(2, dinossauro.getNome_cientifico());
			setaVariavel.setString(3, dinossauro.getPeriodo());
			setaVariavel.setDouble(4, dinossauro.getPeso());
			setaVariavel.setDouble(5, dinossauro.getTamanho());
			setaVariavel.setString(6, dinossauro.getAlimentacao());
			setaVariavel.setString(7, dinossauro.getDescricao());
			setaVariavel.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			try {
				setaVariavel.close();
				conexao.close();
			} catch (Throwable e) {
				System.out.println("Erro: " + e.getMessage());
			}
		}
	}
	
	/* 
	 * Método para salvar as informações de um dinossauro.
	 * @param dinossauro dinossauro a ser salvo.
	 */
	
	public void salvar(Dinossauro dinossauro) {
		String sql = "insert into dinossauro (nome, nome_cientifico, periodo, "
				+ "peso, tamanho, alimentacao, descricao) "
				+ "values (?, ?, ?, ?, ?, ?, ?)";
		
		setaVariaveis(dinossauro, sql);
	}

	/* 
	 * Método para atualizar as informações de um dinossauro.
	 * @param dinossauro dinossauro a ser atualizado
	 * @param codigo codigo do dinossauro a saer atualizado.
	 */
	
	public void atualizar(Dinossauro dinossauro, int codigo) {
		String sql = "update dinossauro set nome=?, nome_cientifico=?, periodo=?, peso=?, "
					+ "tamanho=?, alimentacao=?, descricao=? where codigo=" + codigo;
		
		setaVariaveis(dinossauro, sql);
	}
	
	/* 
	 * Método com as exceções de exclusão do BD.
	 * @param sql recebe o parâmetro sql.
	 */
	
	public void excecaoExcluir(String sql) {
		Connection conexao = ConectaBD.ConexaoBD();
		PreparedStatement exclui = null;

		try {
			exclui = conexao.prepareStatement(sql);
			exclui.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			try {
				exclui.close();
				conexao.close();
			} catch (Throwable e) {
				System.out.println("Erro: " + e.getMessage());
			}
		}
	}
	
	/* 
	 * Método de exclusão de um dinossauro selecionado.
	 * @param codigo recebe o código do dinossauro a ser excluído.
	 */

	public void excluir(int codigo) {
		String sql = "delete from dinossauro where codigo = " + codigo;
		
		excecaoExcluir(sql);
	}
	
	/* 
	 * Método de exclusão de todos os dinossauros do BD.
	 */

	public void excluirTodos() {
		String sql = "truncate table dinossauro";
		
		excecaoExcluir(sql);
	}

	/* 
	 * Método que lista os dinossauros cadastros, que foram salvos no BD.
	 */
	
	private List<Dinossauro> listar() {
		Connection conexao = ConectaBD.ConexaoBD();
		List<Dinossauro> dinossauros = new ArrayList<Dinossauro>();
		Statement consulta = null;
		ResultSet resultado = null;
		Dinossauro dinossauro = null;
		String sql = "select * from dinossauro";
		try {
			consulta = conexao.createStatement();
			resultado = consulta.executeQuery(sql);
			while (resultado.next()) {
				dinossauro = new Dinossauro();
				dinossauro.setCodigo(resultado.getInt("codigo"));
				dinossauro.setNome(resultado.getString("nome"));
				dinossauro.setNome_cientifico(resultado.getString("nome_cientifico"));
				dinossauro.setPeriodo(resultado.getString("periodo"));
				dinossauro.setPeso(resultado.getDouble("peso"));
				dinossauro.setTamanho(resultado.getDouble("tamanho"));
				dinossauro.setAlimentacao(resultado.getString("alimentacao"));
				dinossauro.setDescricao(resultado.getString("descricao"));
				dinossauros.add(dinossauro);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao buscar código do dinossauro. Mensagem: " + e.getMessage());
		} finally {
			try {
				consulta.close();
				resultado.close();
				conexao.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operações de consulta. Mensagem: " + e.getMessage());
			}
		}
		return dinossauros;
	}
	
	/* 
	 * Método que busca de um dinossauro.
	 * @param codigo recebe o código do dinossauro a ser buscado.
	 */
	
	public static Dinossauro buscaDinossauro(int codigo) {
		Connection conexao = ConectaBD.ConexaoBD();
		PreparedStatement consulta = null;
		ResultSet resultado = null;
		Dinossauro dinossauro = null;

		String sql = "select * from dinossauro where codigo = " + codigo;

		try {
			consulta = conexao.prepareStatement(sql);
			resultado = consulta.executeQuery();

			if (resultado.next()) {
				dinossauro = new Dinossauro();
				dinossauro.setCodigo(resultado.getInt("codigo"));
				dinossauro.setNome(resultado.getString("nome"));
				dinossauro.setNome_cientifico(resultado.getString("nome_cientifico"));
				dinossauro.setPeso(resultado.getDouble("peso"));
				dinossauro.setTamanho(resultado.getDouble("tamanho"));
				dinossauro.setDescricao(resultado.getString("descricao"));
				dinossauro.setPeriodo(resultado.getString("periodo"));
				dinossauro.setAlimentacao(resultado.getString("alimentacao"));
			}
		} catch (SQLException e) {
			System.out.println("Erro ao buscar código do dinossauro. Mensagem: " + e.getMessage());
		} finally {
			try {
				consulta.close();
				resultado.close();
				conexao.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operações de consulta. Mensagem: " + e.getMessage());
			}
		}
		return dinossauro;
	}
	
	/* 
	 * Método de validação dos campos da TelaCadastro.
	 * @param dinossauro recebe um dinossauro.
	 */

	public boolean validaDinossauro(Dinossauro dinossauro) {
		if(dinossauro.getNome().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o nome.");
			return false;	
		}
		else if(dinossauro.getNome_cientifico().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o nome científico.");
			return false;	
		}
		else if(dinossauro.getPeso() == 0 || dinossauro.getPeso() < 0) {
			JOptionPane.showMessageDialog(null, "Preencha o peso");
			return false;
		}
		else if(dinossauro.getTamanho() == 0 || dinossauro.getTamanho() < 0) {
			JOptionPane.showMessageDialog(null, "Preencha o tamanho");
			return false;
		}
		else if(dinossauro.getPeriodo() == "PERÍODO") {
			JOptionPane.showMessageDialog(null, "Selecione o período.");
			return false;
		}
		else if(dinossauro.getAlimentacao() == "ALIMENTAÇÃO") {
			JOptionPane.showMessageDialog(null, "Selecione a alimentação.");
			return false;
		}
		else {
			return true;	
		}
	}
}