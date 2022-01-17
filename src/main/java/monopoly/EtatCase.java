package monopoly;

public interface EtatCase {
    void arriveeJoueur(final Joueur j);
    default void messageArrivee(Joueur j, Terrain t){
        System.out.println(j.getNom() + " arrive sur " + t.getNom() + ", qui appartient à " + t.getProprio().getNom());
    }
    default void gereArriveeNonLibre(Joueur j, Terrain t){
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
