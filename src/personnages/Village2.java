package personnages;

public class Village2 {
	private String nom;
    private Chef chef;
    int nbVillageois = 0;
    private Gaulois[] villageois;
    
    public Village2(String nom, int nbVillageoisMaximum) {
         this.nom = nom;
         villageois = new Gaulois[nbVillageoisMaximum];
}
    
    public void setChef(Chef chef) {
    	this.chef = chef;
}
    
    public String getNom() {
         return nom;
}
    public void ajouterHabitant(Gaulois gaulois) {
    	villageois[nbVillageois++]=gaulois;
//    	nbVillageois = nbVillageois +1;
}
    public Gaulois trouverHabitant(int numeroHabitant){
    	return villageois[numeroHabitant];
    }
    
    public void afficherVillageois() {
    	System.out.println("dans le village du chef " + chef.getNom() + " vivent les légendaires gaulois : ");
    	if (nbVillageois != 0) {
    		for(int i=0; i<nbVillageois; i++) {
    			System.out.println("- "+ villageois[i].getNom());
    		}
    	}else {
    		System.out.println("Le village est vide");
    	}
    }



public static void main(String[] args) {
	Village2 village = new Village2("Village des irréductibles", 30);
	
//	Gaulois gaulois = village.trouverHabitant(30);
//	l'habitant numéro 30 est en réalité le 31eme car on compte a partir de 0
	
	Chef chef = new Chef("Abraracourcix", 6, village);
	village.setChef(chef);
	
	Gaulois asterix = new Gaulois("Astérix", 8);
	village.ajouterHabitant(asterix);
	
//	Gaulois gaulois = village.trouverHabitant(1);
//	System.out.println(gaulois);
//	l'habitant n1 existe pas, le n0 est le premier habitant du village dans le tableau
	
	Gaulois obelix = new Gaulois("Obélix", 25);
	village.ajouterHabitant(obelix);
	
	village.afficherVillageois();
	
}
}
