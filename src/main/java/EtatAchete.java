public class EtatAchete implements EtatCase {
	private Terrain t;
	
    public EtatAchete(Terrain terrain) {
		super();
		this.t = terrain;
	}
    public void arriveeJoueur(Joueur j) {
    	System.out.println(j.getNom() + " arrive sur " + t.getNom() + ", qui appartient � " + t.getProprio().getNom());
    	if(j.getNom().equals(t.getProprio().getNom())) {
    		System.out.println(j.getNom() + " est chez lui");
    	} else {
    		int somme = t.sommeAPayer();
    		System.out.println(j.getNom() + " doit payer " + somme + "M � " + t.getProprio().getNom());
    		j.debiteCompte(somme);
    		t.getProprio().crediteCompte(somme);
    		System.out.println(j.getNom() + " : " + j.getSolde() + "M");
    		System.out.println(t.getProprio().getNom() + " : " + t.getProprio().getSolde() + "M");
    	}
    }

}
