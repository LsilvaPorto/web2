package fabrica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;

public class ConnectionFactory {


	private static final String URL = "jdbc:mysql://127.0.0.1:3306/questaoum";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	
	public static Connection getConnection() {
		
		Connection conexao = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			conexao = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			conexao.setAutoCommit(false);
			return conexao;

		} catch (ClassNotFoundException e) {
			System.out.println("O driver expecificado nao foi encontrado.");
			return null;

		}

		catch (SQLException e) {
			System.out.println("Nao foi possivel conectar ao banco de dados.");
			return null;

		}

	}

}