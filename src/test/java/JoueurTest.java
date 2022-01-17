import monopoly.Joueur;
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
    }
}
