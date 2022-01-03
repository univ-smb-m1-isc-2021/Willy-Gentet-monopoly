import java.util.ArrayList;
import java.util.List;

public class Partie {
    private List<De> des;
    private List<Joueur> joueurs;
    private List<Case> cases;
    
    

    public Partie() {
    	des = new ArrayList<De> ();
    	des.add(new De());
    	des.add(new De());
    	joueurs = new ArrayList<Joueur> ();
    	cases = new ArrayList<Case> ();
	}

	public void ajouteJoueur(Joueur j) {
		joueurs.add(j);
    }
	public void ajouteCase(Case c) {
		cases.add(c);
	}

    public Joueur joueurCourrant() {
    	return joueurs.get(0);
    }

    public void nouvellePartie() {
    }

    public int lanceDes() {
    	des.get(0).lance();
    	des.get(1).lance();
    	return des.get(0).getValeur() + des.get(1).getValeur();
    }
    
    public void finTour() {
    	if(joueurs.get(0).getSolde() < 0) {
    		System.out.println(joueurs.get(0).getNom() + " a perdu");
    		joueurs.remove(0);
    	} else {
    		joueurs.add(joueurs.remove(0));
    	}
    	System.out.println("-------------------------- FIN TOUR --------------------------\n");
    }
    public int nbCases() {
    	return cases.size();
    }

	public void avance(Joueur j, int sommeDes) {
		System.out.println(des.get(0).getValeur() + " et " + des.get(1).getValeur() + ". " + j.getNom() + " avance de " + sommeDes + " cases");
		if((j.getNumCaseActuelle() + sommeDes) > nbCases()) {
			System.out.println(j.getNom() + " est pass� par la case d�part : + 200M");
			j.crediteCompte(200);
		}
		j.setNumCaseActuelle((j.getNumCaseActuelle() + sommeDes) % nbCases());
		j.setCaseActuelle(cases.get(j.getNumCaseActuelle()));
	}

	public boolean estFinie() {
		return joueurs.size() == 1;
	}

}
