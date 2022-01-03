import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JoueurTest {

    @Test
    void nom(){
        Joueur luc = new Joueur("Luc");
        assertEquals("Luc", luc.getNom());
    }
}
