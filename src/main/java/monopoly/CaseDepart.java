package monopoly;

public class CaseDepart extends Case {

	@Override
	public void arriveeJoueur(Joueur j) {
		System.out.println(j.getNom() + " arrive sur la case d�part : + 200M");
		j.crediteCompte(200);
	}
}
