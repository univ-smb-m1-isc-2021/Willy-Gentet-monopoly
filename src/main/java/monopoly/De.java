package monopoly;

import java.util.Random;

public class De {
    private int valeur;
	private Random r = new Random();
    
    public void lance() {
		valeur = r.nextInt(7-1) + 1;
    }

	public int getValeur() {
		return valeur;
	}
    
    

}
