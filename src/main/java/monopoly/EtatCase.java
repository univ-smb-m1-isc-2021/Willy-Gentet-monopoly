package monopoly;

public interface EtatCase {
    void arriveeJoueur(final Joueur j);
    default void messageArrivee(Joueur j, Terrain t){
        System.out.println(j.getNom() + " arrive sur " + t.getNom() + ", qui appartient à " + t.getProprio().getNom());
    }
}
