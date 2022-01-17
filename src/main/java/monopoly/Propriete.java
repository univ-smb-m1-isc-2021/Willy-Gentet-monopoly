package monopoly;

import java.util.Scanner;

public abstract class Propriete extends Case {
	
	private String nom;
	private int prixAchat;
    private Joueur proprio;
    

	public Propriete(String nom, int prixAchat) {
		super();
		this.nom = nom;
		this.prixAchat = prixAchat;
		this.proprio = null;
	}

	public boolean estLibre() {
		return proprio == null;
    }

    public abstract int sommeAPayer();


	public void gereArriveeGareService(Joueur j){
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
					System.out.println(j.getNom() + " a acheté " + getNom() + ", Solde : " + j.getSolde());
				}
			} else {
				System.out.println(getNom() + " reste libre");
			}
		} else {
			System.out.println(j.getNom() + " arrive sur " + getNom() + ", qui appartient à " + getProprio().getNom());
			if(j.getNom().equals(getProprio().getNom())) {
				System.out.println(j.getNom() + " est chez lui");
			} else {
				int somme = sommeAPayer();
				System.out.println(j.getNom() + " doit payer " + somme + "M à " + getProprio().getNom());
				j.debiteCompte(somme);
				getProprio().crediteCompte(somme);
				System.out.println(j.getNom() + " : " + j.getSolde() + "M");
				System.out.println(getProprio().getNom() + " : " + getProprio().getSolde() + "M");
			}
		}
	}
    

    //getter and setters

	public Joueur getProprio() {
		return proprio;
	}

	public int getPrixAchat() {
		return prixAchat;
	}
	
	public void setProprio(Joueur proprio) {
		this.proprio = proprio;
	}

	public String getNom() {
		return nom;
	}    

}
