package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.*;
import service.*;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameter("acao").equals("1")) {

			try {

				int codigo = Integer.parseInt(request.getParameter("codigoLivro"));
				int ano = Integer.parseInt(request.getParameter("anoLivro"));
				int paginas = Integer.parseInt(request.getParameter("paginasLivro"));
				String titulo = request.getParameter("tituloLivro");
				String imagem = request.getParameter("imagemLivro");
				char status = request.getParameter("statusLivro").charAt(0);
				double preco = Double.parseDouble(request.getParameter("precoLivro"));
				Livro livro = new Livro(codigo, ano, paginas, titulo, imagem, status, preco);
				LivroService.inserir(livro);
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		
		if (request.getParameter("acao").equals("2")) {

			try {

				int codigo = Integer.parseInt(request.getParameter("codigoAutor"));
				String nome = request.getParameter("nomeAutor");
				Autor autor = new Autor(codigo, nome);
				AutorService.inserir(autor);
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		if (request.getParameter("acao").equals("3")) {

			try {

				int codigo = Integer.parseInt(request.getParameter("codigoAssunto"));
				String descricao = request.getParameter("descricao");
				Assunto assunto = new Assunto(codigo, descricao);
				AssuntoService.inserir(assunto);
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		

	}
}
