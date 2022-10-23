package personnages;

public class Romain {
	private String nom;
	private int force;
	private static Equipement[] equipements= new Equipement[2];
	private int nbEquipement;
	
	public Romain(String nom, int force, Equipement[] equipements, int nbEquipement) {
		this.nom = nom;
		this.force = force;
		this.equipements = equipements;
		this.nbEquipement = nbEquipement;
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
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} 	
		else {
			parler("J'abandonne...");
		}
	assert (force>0);
	
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2: 
			System.out.println("Le soldat " + nom +" est déjà bien protégé !");
			break;
		case 1: 
			if(equipements[0] == equipement) {
				if(equipement == Equipement.CASQUE) {
				System.out.println("Le soldat " + nom + " possède déjà un casque.");
				}
				else {
				System.out.println("Le soldat " + nom + " possède déjà un bouclier.");
				}
			}
			else{
				equipements[1]= equipement;
				nbEquipement++;
				System.out.println("le soldat " + nom + " s'équipe avec un "+ equipement.name().toLowerCase() +".");
			}
			break;
		default:
			equipements[0]= equipement;	
			nbEquipement++;
			System.out.println("le soldat " + nom + " s'équipe avec un "+ equipement.name().toLowerCase()+".");
		}
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6, equipements, 0);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);

		
		
	}
}