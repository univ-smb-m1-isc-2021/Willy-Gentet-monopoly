package monopoly;

import java.util.Scanner;

public class Service extends Propriete {
    public Service(String nom) {
		super(nom, 150);
	}

	@Override
	public int sommeAPayer() {
		//Random r = new Random();
		//int de1 = r.nextInt(7-1) + 1;
		//int de2 = r.nextInt(7-1) + 1;
		int de1 = 1;
		int de2 = 1;
		System.out.println("Lancer des 2 d�s : " + de1 + " et " + de2);
		if(getProprio().nbServices() == 1) {
			System.out.println(getProprio().getNom() + " poss�de une case service, on multiplie la somme par 4");
			return (de1+de2) * 4;
		} else if(getProprio().nbServices() == 2){
			System.out.println(getProprio().getNom() + " poss�de les 2 case service, on multiplie la somme par 10");
			return (de1+de2) * 10;
		} else {
			System.err.println("erreur service");
			return -1;
		}
	}

	@Override
	public void arriveeJoueur(Joueur j) {
		gereArriveeGareService(j);
	}


}
