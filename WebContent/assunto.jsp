<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Autor</title>
</head>
<body>
	<form action="Controller" method="post">
		<fieldset>
			<input type="hidden" name="acao" value="3">
			<h2>Assunto</h2>

			Código: <input type="text" name="codigoAssunto"><br>
			<br> Descrição: <input type="text" name="descricao"><br>
			<br> <input type="submit" value="Cadastrar">
		</fieldset>
	</form>
</body>
</html>