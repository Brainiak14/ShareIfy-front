package fr.formation.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import fr.formation.model.*;
import java.util.*;

// test
@WebServlet("/listeProduit")
public class ListeProduitServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//getParameter pour récupérer un paramètre de requête
		
		List<Produit> produits = new ArrayList<>();

		produits.add(new Produit(1, "Volant", 100));
		produits.add(new Produit(2, "Combinaison", 1000));
		produits.add(new Produit(3, "Siège", 200));
		produits.add(new Produit(3, "Roue", 800));
		
		req.setAttribute("produits", produits);
		
		//req.setAttribute("message", "Shopping en kit");
		
		this.getServletContext()	
		.getRequestDispatcher("/WEB-INF/views/listeProduit.jsp")
		.forward(req, resp);
	}
}
