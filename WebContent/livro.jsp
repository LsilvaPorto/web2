<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Livro</title>
</head>
<body>
	<form action="Controller" method="post" name = "formLivro">
		<fieldset>
			<input type="hidden" name="acao" value="1">
			
			<h2>Livro</h2>

			Título: <input type="text" name="tituloLivro"><br>
			<br> Código: <input type="text" name="codigoLivro"><br>
			<br> Ano: <input type="text" name="anoLivro"><br>
			<br> Páginas: <input type="text" name="paginasLivro"><br>
			<br> Imagem: <input type="text" name="imagemLivro"><br>
			<br> Status: <input type="text" name="statusLivro"><br>
			<br> Preço: R$<input type="text" name="precoLivro"><br>
			<br> <input type="submit" value="Cadastrar">
		</fieldset>
		</form>
</body>
</html>