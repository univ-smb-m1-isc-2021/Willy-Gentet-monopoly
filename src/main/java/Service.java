import java.util.Random;
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
