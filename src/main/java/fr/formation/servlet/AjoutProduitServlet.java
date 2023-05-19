package fr.formation.servlet;

import java.io.IOException;
import java.util.ArrayList;

import cn.techtutorial.model.Cart;
import fr.formation.model.Panier;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ajoutProduit")
public class AjoutProduitServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Affichage du formulaire
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/views/ajoutProduit.jsp")
		.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Récupérer les paramètres
		int id = Integer.parseInt(req.getParameter("id"));
		Panier panier = new Panier();
		panier.setId(id);

		
		ArrayList<Panier> listePanier = new ArrayList<>();
		
		HttpSession session = req.getSession();
		
		ArrayList<Panier> listePanierSession = (ArrayList<Panier>) session.getAttribute("liste-panier");
		

//		

	}

}
