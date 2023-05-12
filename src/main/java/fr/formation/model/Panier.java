package fr.formation.model;

import java.util.*;

public class Panier {
	private int id;
	private List<Produit> produit;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Produit> getProduit() {
		return produit;
	}
	public void setProduit(List<Produit> produit) {
		this.produit = produit;
	}
	
}
