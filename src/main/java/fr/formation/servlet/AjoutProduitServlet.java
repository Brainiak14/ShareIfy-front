package fr.formation.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
		String id = req.getParameter("id");
		String nom = req.getParameter("nom");
		String prix = req.getParameter("prix");

//		

	}

}
