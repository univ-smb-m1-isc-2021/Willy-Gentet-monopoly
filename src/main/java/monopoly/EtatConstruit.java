package monopoly;

public class EtatConstruit implements EtatCase {
	private Terrain t;
	
    public EtatConstruit(Terrain terrain) {
		super();
		this.t = terrain;
	}
    public void arriveeJoueur(Joueur j) {
		messageArrivee(j, t);
		gereArriveeNonLibre(j, t);
    }

}
