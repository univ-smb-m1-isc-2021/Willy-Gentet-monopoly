package monopoly;

import java.util.Scanner;

public class Gare extends Propriete {
	
    public Gare(String nom) {
		super(nom, 200);
	}

	public int sommeAPayer() {
		int res = 0;
		System.out.println(getProprio().getNom() + " possède " + getProprio().nbGares() + " gare(s)");
		switch(getProprio().nbGares()) {
		case 1:
			res = 25;
			break;
		case 2:
			res = 50;
			break;
		case 3:
			res = 100;
			break;
		case 4:
			res = 200;
			break;
		}
		return res;
	}

	@Override
	public void arriveeJoueur(Joueur j) {
		gereArriveeGareService(j);
	}

}
