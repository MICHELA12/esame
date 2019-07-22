<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<a href="elencoCompagni">Aggiungi Film</a>

<form action="addCompagno" method="GET" id=add>
<input name="id" id="id">
<input name="nomeC" id="nomeC">
<input name="cognomeC" id="cognomeC" >
<button onclick="manda()" id="salva">Add</button>
</form>

<script type="text/javascript">
function manda() {
	document.forms['add'].submit();
	}	
</script>
</body>
</html>