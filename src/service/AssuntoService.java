package service;

import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;

import bean.*;
import fabrica.ConnectionFactory;

public class AssuntoService {

	public static void inserir(Assunto assunto) throws SQLException {

		java.sql.Connection conexao = ConnectionFactory.getConnection();
		String sql = "insert into assunto (codigo, descricao) values(?,?)";

		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, assunto.getCodigo());
			ps.setString(2, assunto.getDescricao());
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
