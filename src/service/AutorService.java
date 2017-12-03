package service;

import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;

import bean.*;
import fabrica.ConnectionFactory;

public class AutorService {

	public static void inserir(Autor autor) throws SQLException {

		java.sql.Connection conexao = ConnectionFactory.getConnection();
		String sql = "insert into autor (codigo, nome) values(?,?)";

		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, autor.getCodigo());
			ps.setString(2, autor.getNome());
			ps.execute();
			conexao.commit();

		} catch (SQLException e) {
			conexao.rollback();
			e.printStackTrace();
			throw new SQLException();

		} finally {
			conexao.close();
		}

	}
}
