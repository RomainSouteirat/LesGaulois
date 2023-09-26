package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
//		Gaulois asterix = new Gaulois("asterix", 9);
//		Romain minus = new Romain("minus", 8);
//		asterix.parler("Bonjour à tous");
//		minus.parler("UN GAU... UN GAUGAU...");
//		asterix.frapper(minus);
//		asterix.frapper(minus);
//		asterix.frapper(minus);

		Druide panoramix = new Druide("panoramix", 5, 10);
		Gaulois astérix = new Gaulois("astérix", 9);
		Gaulois obélix = new Gaulois("obélix", 9);
		Romain minus = new Romain("minus", 40);
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.booster(obélix);
		obélix.parler("Par Bélénos, ce n'est pas juste !");
		panoramix.booster(astérix);
		astérix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		astérix.frapper(minus);
		astérix.frapper(minus);
		astérix.frapper(minus);
	}

}
