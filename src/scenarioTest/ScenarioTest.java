package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
		
//		IEtal<Sanglier>[] marche = new IEtal[3];
//		IEtal<Sanglier> etalSanglier = new Etal<>();
//		IEtal<Poisson> etalPoisson = new Etal<>();
//		marche[0]= etalSanglier;
//		marche[1] = etalPoisson;
		IEtal[] etals = new IEtal[3];
		Etal<Sanglier> etalSanglier = new Etal<>();
		etals[0] = etalSanglier;
		
		etals[0].occuperEtal(new Gaulois("Ordralfabétix", 12), new Poisson("lundi"), 10);
	}
	
}
