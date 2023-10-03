package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	
	
	public Romain(String nom, int force) {
		this.nom = nom;
		assert force>0;
		this.force = force;
		}
	
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert force>0;
		int saveforce = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
			} else {
				parler("J'abandonne...");
			}
		assert saveforce>force;
	}
	
	public void sEquiper(Equipement newEquipement) {
		switch (nbEquipement) {
		case 2: 
			System.out.println("Le soldat " + nom +" est déjà bien protégé !");
			break;
		case 1: 
			if (equipements[0]== newEquipement) {
				System.out.println("Le soldat " + nom + " possède déjà un " + newEquipement + ".");
			} else {
				equipements[1] = newEquipement;
				nbEquipement++;
				System.out.println("Le soldat " + nom + " s'équipe d'un " + newEquipement + ".");
			}
			break;
		case 0:
			equipements[0] = newEquipement;
			nbEquipement++;
			System.out.println("Le soldat " + nom + " s'équipe d'un " + newEquipement + ".");
		}
	}
			
			
	public static void main(String[] args) {
		Romain minus = new Romain("minus", 6);
//		System.out.println(Equipement.CASQUE);
//		System.out.println(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
	}
}


