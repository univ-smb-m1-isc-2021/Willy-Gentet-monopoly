public class Impots extends Case {

	@Override
	public void arriveeJoueur(Joueur j) {
		System.out.println("Impots : " + j.getNom() + " paye 100M � la banque");
		j.debiteCompte(100);
	}
}
