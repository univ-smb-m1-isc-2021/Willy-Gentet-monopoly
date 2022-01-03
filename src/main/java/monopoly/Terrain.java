package monopoly;

import java.util.ArrayList;
import java.util.List;

public class Terrain extends Propriete {
	
	private int loyer, loyer1maison, loyer2maison, loyer3maison, loyer4maison, loyerHotel;
	private Quartier quartier;
    private List<Batiment> batiments;
    private EtatCase etatCase;
    
    

    public Terrain(String nom, int prixAchat, int loyer, int loyer1maison, int loyer2maison,
			int loyer3maison, int loyer4maison, int loyerHotel, Quartier quartier) {
		super(nom, prixAchat);
		this.loyer = loyer;
		this.loyer1maison = loyer1maison;
		this.loyer2maison = loyer2maison;
		this.loyer3maison = loyer3maison;
		this.loyer4maison = loyer4maison;
		this.loyerHotel = loyerHotel;
		this.quartier = quartier;
		batiments = new ArrayList<Batiment> ();
		etatCase = new EtatLibre(this);
	}



    public int sommeAPayer() {
    	int res = -1;
    	switch(batiments.size()) {
    	case 0:
    		res = loyer;
    		if(getQuartier().estProprioTous(getProprio())) {
    			System.out.println(getProprio().getNom() + " poss�de tous les terrains du quartier, loyer doubl� !");
    			res*= 2;
    		}
    		break;
    	case 1:
    		if(batiments.get(0) instanceof Maison) {
    			System.out.println("Il y a 1 maison sur ce terrain");
    			res = loyer1maison;
    		} else {
    			System.out.println("Il y a 1 hotel sur ce terrain");
    			res = loyerHotel;
    		}
    		break;
    	case 2:
    		System.out.println("Il y a 2 maisons sur ce terrain");
    		res = loyer2maison;
    		break;
    	case 3:
    		System.out.println("Il y a 3 maisons sur ce terrain");
    		res = loyer3maison;
    		break;
    	case 4:
    		System.out.println("Il y a 4 maisons sur ce terrain");
    		res = loyer4maison;
    		break;
    	}
    	return res;
    }

	public EtatCase getEtatCase() {
		return etatCase;
	}

	public void setEtatCase(EtatCase etatCase) {
		this.etatCase = etatCase;
	}

	public Quartier getQuartier() {
		return quartier;
	}

	public List<Batiment> getBatiments() {
		return batiments;
	}

	@Override
	public void arriveeJoueur(Joueur j) {
		etatCase.arriveeJoueur(j);
	}

	public void ajouteBatiment(Joueur j) {
		if(batiments.size() < 4) {
			if(getQuartier().getPrixAchatMaison() > j.getSolde()) {
				System.out.println(j.getNom() + " n'as pas assez d'argent (" + j.getSolde() + "M)");
			} else {
				batiments.add(new Maison());
				System.out.println("monopoly.Maison ajout�e sur " + getNom());
			}
		} else if(batiments.size() == 4) {
			if(getQuartier().getPrixAchatHotel() > j.getSolde()) {
				System.out.println(j.getNom() + " n'as pas assez d'argent (" + j.getSolde() + "M)");
			} else {
				batiments.clear();
				batiments.add(new Hotel());
				System.out.println("monopoly.Hotel ajout�e sur " + getNom());
				setEtatCase(new EtatConstruit(this));
			}
		} else {
			System.err.println("erreur ajout batiment");
		}
	}

	public void afficheBatiments() {
		String msg = "Batiments : ";
		for(Batiment b: batiments) {
			if(b instanceof Hotel) {
				msg+= "hotel";
			} else {
				msg+= "maison ";
			}
		}
		System.out.println(msg);
	}
    
    

}
