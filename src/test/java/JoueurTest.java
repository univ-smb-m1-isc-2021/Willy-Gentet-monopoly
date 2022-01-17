import monopoly.Gare;
import monopoly.Joueur;
import monopoly.Service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JoueurTest {

    @Test
    public void testJoueur(){
        Joueur luc = new Joueur("Luc");
        assertEquals("Luc", luc.getNom());
        luc.debiteCompte(500);
        assertEquals(luc.getSolde(), 1000);
        luc.crediteCompte(200);
        assertEquals(luc.getSolde(), 1200);
        luc.ajoutePropriete(new Gare("gare 1"));
        luc.ajoutePropriete(new Gare("gare 2"));
        assertEquals(luc.nbGares(), 2);
        luc.ajoutePropriete(new Service("eaux"));
        assertEquals(luc.nbServices(), 1);
    }
}
