import monopoly.Joueur;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JoueurTest {

    @Test
    public void nom(){
        Joueur luc = new Joueur("Luc");
        assertEquals("Luc", luc.getNom());
    }
}
