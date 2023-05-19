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
				<th>Ajout au panier</th>
			</tr>
		</thead>

		<tbody>
				<c:forEach var="produit" items="${ produits }">
					<tr>
						<td>${ produit.getId() }</td>
						<td>${ produit.nom }</td>
						<td>${ produit.prix }</td>
						<td>
						<form action="ajouterAuPanier" method="post">
                            <input type="hidden" name="productId" value="${ produit.getId() }">
                            <button type="submit" class="btn btn-success">Ajouter au panier</button>
                        </form>
                        </td>
					</tr>
				</c:forEach>

		</tbody>
	</table>
	<p>${ unAttribut }</p>
	 <a href="panier" class="btn btn-primary">Voir le panier</a>
</body>
</html>