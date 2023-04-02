package produit;

public class Poisson extends Produit{
	private String datePeche;

	public Poisson(String datePeche) {
		super("poisson");
		this.unite = produit.unite.PAR_PIÈCE;
		this.datePeche = datePeche;
	}
	public String decrireProduit() {
		return ("poisson pêchés " + datePeche);
	}
}
