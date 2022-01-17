package monopoly;

import java.util.RandomSecure;

public class De {
    private int valeur;
	private RandomSecure r = new RandomSecure();
    
    public void lance() {
		valeur = r.nextInt(7-1) + 1;
    }

	public int getValeur() {
		return valeur;
	}
    
    

}
