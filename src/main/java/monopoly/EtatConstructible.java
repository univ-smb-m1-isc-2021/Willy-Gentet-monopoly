package monopoly;

public class EtatConstructible implements EtatCase {
	private Terrain t;

    public EtatConstructible(Terrain terrain) {
		super();
		this.t = terrain;
	}
    public void arriveeJoueur(Joueur j) {
		messageArrivee(j, t);
		gereArriveeNonLibre(j, t);
    }

}
