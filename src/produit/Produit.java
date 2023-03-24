package produit;

public abstract class Produit {
	private String nom;
	protected enum unite{
		LITRE,GRAMME,KILOGRAMME,CENTILITRE,MILLILITRE,PAR_PIÈCE;
		}
	protected unite unité;
	
	protected Produit(String nom, unite unité) {
	this.nom = nom;
	this.unité = unité;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	public abstract String decrireProduit();
}
