<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${ userSession != null }">
		<p>
			Vous avez les droits pour <a href="ajoutProduit">ajouter</a> un
			produit !
		</p>
	</c:if>
	<h1>Liste des produits disponibles</h1>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Nom</th>
				<th>Prix</th>
			</tr>
		</thead>

		<tbody>
			<form method="POST">
				<c:forEach var="produit" items="${ produits }">
					<tr>
						<td>${ produit.getId() }</td>
						<td>${ produit.nom }</td>
						<td>${ produit.prix }</td>
						<td><input type="submit" value="Ajouter" /></td>
					</tr>
				</c:forEach>
			</form>
		</tbody>
	</table>
	<p>${ unAttribut }</p>
</body>
</html>