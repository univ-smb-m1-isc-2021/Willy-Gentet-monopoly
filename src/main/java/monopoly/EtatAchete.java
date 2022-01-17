package monopoly;

public class EtatAchete implements EtatCase {
	private Terrain t;
	
    public EtatAchete(Terrain terrain) {
		super();
		this.t = terrain;
	}
    public void arriveeJoueur(Joueur j) {
		messageArrivee(j, t);
		gereArriveeNonLibre(j, t);
    }

}
