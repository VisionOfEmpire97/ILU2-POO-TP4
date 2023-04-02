package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private Gaulois chasseur;
	private int poids;
	
	
	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier");
		this.unite = produit.unite.KILOGRAMME;
		this.poids = poids;
		this.chasseur = chasseur;
	}

	@Override
	public String decrireProduit() {
		return ("Sanglier de " + poids + unite.toString() + " chassé par " + chasseur);
	}

}
