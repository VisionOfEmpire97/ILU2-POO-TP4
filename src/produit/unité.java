package produit;

public enum unité {
	LITRE("Litre"),GRAMME("Gramme"),KILOGRAMME("Kilogramme"),CENTILITRE("centilitre"),MILLILITRE("Millilitre"),PAR_PIÈCE("Par pièce");
	
	private String nom;

	private unité (String nom) {
		this.nom = nom;
	}
	
//	public String toString() {
//		return nom;
//	}
}

//LITRE,gramme,kilogramme,centilitre,millilitre, par pièce