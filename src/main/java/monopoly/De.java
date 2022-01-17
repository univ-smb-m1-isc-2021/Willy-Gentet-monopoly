package monopoly;

import java.util.Random;

public class De {
    private int valeur;
    
    public void lance() {
		Random r = new Random();
		valeur = r.nextInt(7-1) + 1;
    }

	public int getValeur() {
		return valeur;
	}
    
    

}
