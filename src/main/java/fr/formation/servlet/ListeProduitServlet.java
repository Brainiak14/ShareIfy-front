package fr.formation.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fr.formation.model.Produit;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

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
		produits.add(new Produit(4, "Roue", 800));
		
		req.setAttribute("produits", produits);
		
		//req.setAttribute("message", "Shopping en kit");
		
		this.getServletContext()	
		.getRequestDispatcher("/WEB-INF/views/listeProduit.jsp")
		.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Récupérer les paramètres
		//Produit p1 = req.getParameter("produit");
		// Vérifier si le login est OK
		// On récupère la session de l'utilisateur
		//HttpSession session = req.getSession();
		// On injecte dans la session le nom d'utilisateur
		//session.setAttribute("userSession", username);
		// Rediriger vers la page panier
		//resp.sendRedirect("panier");
		
		
		
		//Ajouter le produit au panier de l'utilisateur
        HttpSession session = req.getSession();
        List<Produit> panier = (List<Produit>) session.getAttribute("panier");
        if (panier == null) {
            panier = new ArrayList<>();
            session.setAttribute("panier", panier);
        }
        //panier.add(selectedProduit);

        resp.sendRedirect("panier");
    }
	}
		
		

		
	

