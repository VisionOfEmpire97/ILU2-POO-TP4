package produit;

public abstract class Produit {
	private String nom;
	protected unite unite;
	
	protected Produit(String nom) {
	this.nom = nom;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	public abstract String decrireProduit();
}
