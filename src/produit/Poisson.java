package produit;

public class Poisson extends Produit{
	String datePeche;
	String nom = "poisson";

	public Poisson(String datePeche) {
		super("poisson",unite.PAR_PIÈCE);
		this.datePeche = datePeche;
	}
	public String decrireProduit() {
		return ("poisson pêchés" + datePeche);
	}
}
