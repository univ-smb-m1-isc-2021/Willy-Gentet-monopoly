package monopoly;

import java.security.SecureRandom;

public class De {
    private int valeur;
    
    public void lance() {
		SecureRandom r = new SecureRandom();
		valeur = r.nextInt(7-1) + 1;
    }

	public int getValeur() {
		return valeur;
	}
    
    

}
