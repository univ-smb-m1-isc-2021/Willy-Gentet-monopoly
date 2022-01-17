package monopoly;

import java.util.ArrayList;
import java.util.Scanner;

public class Joueur {
    private int solde;
    private String nom;
    private ArrayList<Propriete> casesPossedees;
    private Case caseActuelle;
    private int numCaseActuelle;
    

    public Joueur(String nom) {
    	solde = 1500;
		this.nom = nom;
		casesPossedees = new ArrayList<Propriete>();
		caseActuelle = null;
		numCaseActuelle = 0;
	}

	public void debiteCompte(int v) {
		solde -= v;
    }

    public void crediteCompte(int v) {
    	solde += v;
    }

    public int nbGares() {
    	int nb = 0;
    	for(Propriete p: casesPossedees) {
    		if(p instanceof Gare) {
    			nb++;
    		}
    	}
    	return nb;
    }

    public int nbServices() {
    	int nb = 0;
    	for(Propriete p: casesPossedees) {
    		if(p instanceof Service) {
    			nb++;
    		}
    	}
    	return nb;
    }

	public Case getCaseActuelle() {
		return caseActuelle;
	}

	public void setCaseActuelle(Case caseActuelle) {
		this.caseActuelle = caseActuelle;
	}

	public int getSolde() {
		return solde;
	}

	public String getNom() {
		return nom;
	}

	public ArrayList<Propriete> getCasesPossedees() {
		return casesPossedees;
	}
	public void ajoutePropriete(Propriete p) {
		casesPossedees.add(p);
	}

	public int getNumCaseActuelle() {
		return numCaseActuelle;
	}

	public void setNumCaseActuelle(int numCaseActuelle) {
		this.numCaseActuelle = numCaseActuelle;
	}

	public void construire() {
		ArrayList<Terrain> constructionsPossibles = new ArrayList<Terrain>();
		for(Propriete p: casesPossedees) {
			if(p instanceof Terrain) {
				if(((Terrain) p).getEtatCase() instanceof EtatConstructible) {
					constructionsPossibles.add((Terrain) p);
				}
			}
		}
		if(constructionsPossibles.size() > 0) {
			System.out.println("-1 : Ne rien construire");
			for(int i = 0; i < constructionsPossibles.size(); i++) {
				System.out.println(i + " : " + constructionsPossibles.get(i).getNom() + " (" + constructionsPossibles.get(i).getQuartier().getNom() + ")");
			}
			Scanner s = new Scanner(System.in);
			int reponse1 = s.nextInt();
			if(reponse1 >= 0 && reponse1 < constructionsPossibles.size()) {
				Terrain t = constructionsPossibles.get(reponse1);
				t.afficheBatiments();
				System.out.println("Prix maison : " + t.getQuartier().getPrixAchatMaison() + "; prix hotel : " + t.getQuartier().getPrixAchatHotel());
				System.out.println("Acheter un batiment ? (1 = Oui, 2 = non)");
				int reponse2 = s.nextInt();
				if(reponse2 == 1) {
					t.ajouteBatiment(this);
					t.afficheBatiments();
				}
			} else if(reponse1 == -1) {
				System.out.println("Rien n'est construit");
			} else {
				System.out.println("nombre invalide");
			}
		} else {
			System.out.println("Pas de constructions possibles");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				Thread.interrupt();
			}
		}
	}
    
    

}
