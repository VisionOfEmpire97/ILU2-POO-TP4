package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private Gaulois chasseur;
	private int poids;
	private String nom = "sanglier";
	
	
	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier",unite.KILOGRAMME);
		this.poids = poids;
		this.chasseur = chasseur;
	}

	@Override
	public String decrireProduit() {
		return ("Sanglier de " + poids + unité + " chassé par " + chasseur);
	}

}
