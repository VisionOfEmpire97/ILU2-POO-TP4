package produit;

public enum unite {
	LITRE("Litre"),GRAMME("Gramme"),KILOGRAMME("Kilogramme"),CENTILITRE("centilitre"),MILLILITRE("Millilitre"),PAR_PIÈCE("Par pièce");
	
	private String nom;

	private unite (String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return nom;
	}
}
