package service;

import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;

import bean.*;
import fabrica.ConnectionFactory;

public class LivroService {

	public static void inserir(Livro livro) throws SQLException{

		java.sql.Connection conexao = ConnectionFactory.getConnection();
		String sql = "insert into livro (codigo, ano, paginas, titulo, imagem, status, preco) values(?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, livro.getCodigo());
			ps.setInt(2, livro.getAno());
			ps.setInt(3, livro.getPaginas());
			ps.setString(4, livro.getTitulo());
			ps.setString(5, livro.getImagem());
			ps.setString(6, Character.toString(livro.getStatus()));
			ps.setDouble(7, livro.getPreco());
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
