package fr.formation.model;

import java.util.*;

public class Panier {
	private int id;
	private List<Produit> produits;
	
	//GS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	
	
}
