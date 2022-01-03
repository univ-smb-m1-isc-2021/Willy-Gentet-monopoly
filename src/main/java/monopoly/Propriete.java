package monopoly;

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
