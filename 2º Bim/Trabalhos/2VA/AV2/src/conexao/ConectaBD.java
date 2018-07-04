package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/* 
 * Classe resposável por fazer a conexão com o banco de dados MySql
 */

public class ConectaBD {
	
	public static Connection ConexaoBD() {
		Connection conexao = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/tabela?useTimezone=true&serverTimezone=UTC&useSSL=false";
			String usuario = "root";
			String senha = "123456";
			conexao = DriverManager.getConnection(url, usuario, senha);
		} catch (ClassNotFoundException e) {
			System.out.println("Classe não encontrada. Erro: " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro de SQL. Erro: " + e.getMessage());
		}
		return conexao;
	}
}
