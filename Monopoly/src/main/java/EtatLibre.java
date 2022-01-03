import java.util.Scanner;

public class EtatLibre implements EtatCase {
	private Terrain t;
	
    public EtatLibre(Terrain terrain) {
		super();
		this.t = terrain;
	}

	public void arriveeJoueur(Joueur j) {
    	System.out.println(j.getNom() + " arrive sur le terrain : " + t.getNom());
    	if(j.getSolde() > t.getPrixAchat()) {
    		System.out.println("Acheter ce terrain pour " + t.getPrixAchat() + "M ? (Solde : " + j.getSolde() + "M)");
    		System.out.println("1 = oui; 2 = non");
    		Scanner s = new Scanner(System.in);
    		int reponse = s.nextInt();
    		if(reponse == 1) {
    			System.out.println(j.getNom() + " achete " + t.getNom() + " pour " + t.getPrixAchat() + "M !");
    			j.debiteCompte(t.getPrixAchat());
    			System.out.println("Solde : " + j.getSolde() + "M");
    			j.ajoutePropriete(t);
    			t.setEtatCase(new EtatAchete(t));
    			t.setProprio(j);
    			if(t.getQuartier().estProprioTous(j)) {
    				System.out.println(j.getNom() + " poss�de tous les terrains du quartier " + t.getNom() + ", ils sont donc constructibles");
    				t.getQuartier().setTerrainsConstructible();
    			}
    		}
    	} else {
    		System.out.println("Pas assez d'argent pour acheter ce terrain");
    	}
    }

}
