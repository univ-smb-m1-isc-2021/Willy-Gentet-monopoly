import java.util.ArrayList;

public class Quartier {
    private String nom;
    private int prixAchatMaison;
    private int prixAchatHotel;
    private ArrayList<Terrain> terrains;
    
    

    public Quartier(String nom, int prixAchatMaison, int prixAchatHotel) {
		this.nom = nom;
		this.prixAchatMaison = prixAchatMaison;
		this.prixAchatHotel = prixAchatHotel;
		terrains = new ArrayList<Terrain>();
	}

	public Boolean estProprioTous(Joueur j) {
		for(Terrain t: terrains) {
			if(t.getProprio() == null || !t.getProprio().getNom().equals(j.getNom())) {
				return false;
			}
		}
		return true;
    }

	public void setTerrainsConstructible() {
		for(Terrain t: terrains) {
			t.setEtatCase(new EtatConstructible(t));
		}
	}
	
	public void ajouteTerrain(Terrain t) {
		terrains.add(t);
	}

	public int getPrixAchatMaison() {
		return prixAchatMaison;
	}

	public int getPrixAchatHotel() {
		return prixAchatHotel;
	}

	public String getNom() {
		return nom;
	}
	
	

}
