package monopoly;

import java.util.Scanner;

public class Gare extends Propriete {
	
    public Gare(String nom) {
		super(nom, 200);
	}

	public int sommeAPayer() {
		int res = 0;
		System.out.println(getProprio().getNom() + " poss�de " + getProprio().nbGares() + " gare(s)");
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
		if(getProprio() == null) {
			System.out.println(getNom() + " est libre. Acheter pour " + getPrixAchat() + "M ? (Solde : " + j.getSolde() + "M)");
			System.out.println("1 = oui; 2 = non");
    		Scanner s = new Scanner(System.in);
    		int reponse = s.nextInt();
    		if(reponse == 1) {
    			if(getPrixAchat() > j.getSolde()) {
    				System.out.println(j.getNom() + " n'as pas assez d'argent (Solde : " + j.getSolde() + "M)");
    			} else {
    				j.debiteCompte(getPrixAchat());
    				j.ajoutePropriete(this);
    				setProprio(j);
    				System.out.println(j.getNom() + " a achet� " + getNom() + ", Solde : " + j.getSolde());
    			}
    		} else {
    			System.out.println(getNom() + " reste libre");
    		}
		} else {
			System.out.println(j.getNom() + " arrive sur " + getNom() + ", qui appartient � " + getProprio().getNom());
			if(j.getNom().equals(getProprio().getNom())) {
	    		System.out.println(j.getNom() + " est chez lui");
	    	} else {
	    		int somme = sommeAPayer();
	    		System.out.println(j.getNom() + " doit payer " + somme + "M � " + getProprio().getNom());
	    		j.debiteCompte(somme);
	    		getProprio().crediteCompte(somme);
	    		System.out.println(j.getNom() + " : " + j.getSolde() + "M");
	    		System.out.println(getProprio().getNom() + " : " + getProprio().getSolde() + "M");
	    	}
		}
	}

}
