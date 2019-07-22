<%@page import="Model.Compagni"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista</title>
</head>
<body>
	<table style="height: 150px;">
		<thead>
			<tr>
				<th>Matricola</th>
				<th>Nome</th>
				<th>Cognome</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${c}" var="${elencoCompagni}">
				<tr data-id="${c.matricola}">
					<td>${c.matricola}</td>
					<td>${c.nome}</td>
					<td>${c.cognome}</td>
					<td><a href="deleteCompagno?matricola=${c.matricola}"
						onclick="return confirm('conferma cancellazione di ${c.matricola}?')">Delete</a></td>
				</tr>

			</c:forEach>
		</tbody>
	</table>
</body>
</html>