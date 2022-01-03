public class Main {
	public static void main(String[] args) {
		// Pour jouer avec les sc�narios des incr�ments 1 et 2
		Partie p = new Partie();
		
		// Les quartiers 
	    // Param : couleur, nombrePropriete, prixAchatMaison, prixAchatHotel, listePropri�t�
	    Quartier marron = new Quartier("Marron", 50, 50);
	    Quartier bleuClair = new Quartier("Bleu Clair", 50, 50);
	    Quartier rose = new Quartier("Rose", 100, 100);
	    Quartier orange = new Quartier("Orange", 100, 100);
	    Quartier rouge = new Quartier("Rouge", 150, 150);
	    Quartier jaune = new Quartier("Jaune", 150, 150);
	    Quartier vert = new Quartier("Vert", 200, 200);
	    Quartier bleuFonce = new Quartier("Bleu Foncé", 200, 200);
	    
	    // Liste de toutes les cases propri�t�s 
	    // Param : nom, prixAchat, loyer, loyer1maison, loyer2maison, loyer3maison, loyer4maison, loyerHotel, quartier
	    Terrain marron1 = new Terrain("Boulevard de Belleville", 60, 2, 10, 30, 90, 160, 250, marron);
	    Terrain marron2 = new Terrain("Rue Lecourbe", 60, 4, 20, 60, 180, 320, 450, marron);
	    marron.ajouteTerrain(marron1);
	    marron.ajouteTerrain(marron2);

		
	    Terrain bleuClair1 = new Terrain("Rue de Vaugirad", 100, 6, 30, 90, 270, 400, 550, bleuClair);
	    Terrain bleuClair2 = new Terrain("Rue de Courcelles", 100, 6, 30, 90, 270, 400, 550, bleuClair);
	    Terrain bleuClair3 = new Terrain("Avenue de la république", 120, 8, 40, 100, 300, 450, 600, bleuClair);
	    bleuClair.ajouteTerrain(bleuClair1);
	    bleuClair.ajouteTerrain(bleuClair2);
	    bleuClair.ajouteTerrain(bleuClair3);
	    
	    Terrain rose1 = new Terrain("Boulevard de la villette", 140, 10, 50, 150, 450, 625, 750, rose);
	    Terrain rose2 = new Terrain("Avenue de  Neuilly", 140, 10, 50, 150, 450, 625, 750, rose);
	    Terrain rose3 = new Terrain("Rue du paradis", 160, 12, 60, 180, 500, 700, 900, rose);
	    rose.ajouteTerrain(rose1);
	    rose.ajouteTerrain(rose2);
	    rose.ajouteTerrain(rose3);
	    
	    Terrain orange1 = new Terrain("Avenue Mozart", 180, 14, 70, 200, 550, 750, 950, orange);
	    Terrain orange2 = new Terrain("Boulevard Saint-Michel", 180, 14, 70, 200, 550, 750, 950, orange);
	    Terrain orange3 = new Terrain("Place Pigalle", 200, 16, 80, 220, 600, 800, 1000, orange);
	    orange.ajouteTerrain(orange1);
	    orange.ajouteTerrain(orange2);
	    orange.ajouteTerrain(orange3);
	    
	    Terrain rouge1 = new Terrain("Avenue Matignon", 220, 18, 90, 250, 700, 875, 1050, rouge);
	    Terrain rouge2 = new Terrain("Boulevard Malesherbes", 220, 18, 90, 250, 700, 875, 1050, rouge);
	    Terrain rouge3 = new Terrain("Avenue Henri-Martin", 240, 20, 100, 300, 750, 925, 1100, rouge);
	    rouge.ajouteTerrain(rouge1);
	    rouge.ajouteTerrain(rouge2);
	    rouge.ajouteTerrain(rouge3);
	    
	    Terrain jaune1 = new Terrain("Faubourg Saint-Honoré", 260, 22, 110, 330, 800, 975, 150, jaune);
	    Terrain jaune2 = new Terrain("Place de la Bourse", 260, 22, 110, 330, 800, 975, 150, jaune);
	    Terrain jaune3 = new Terrain("Rue de la fayette", 280, 24, 120, 360, 850, 1025, 1200, jaune);
	    jaune.ajouteTerrain(jaune1);
	    jaune.ajouteTerrain(jaune2);
	    jaune.ajouteTerrain(jaune3);
	    
	    Terrain vert1 = new Terrain("Avenue de Breteuil", 300, 26, 130, 390, 900, 1100, 1275, vert);
	    Terrain vert2 = new Terrain("Avenue Foch", 300, 26, 130, 390, 900, 1100, 1275, vert);
	    Terrain vert3 = new Terrain("Boulevard des capucines", 320, 28, 150, 450, 1000, 1200, 1400, vert);
	    vert.ajouteTerrain(vert1);
	    vert.ajouteTerrain(vert2);
	    vert.ajouteTerrain(vert3);
	    
	    Terrain bleuFonce1 = new Terrain("Avenue des Champs-�lys�es", 350, 35, 175, 500, 1100, 1300, 1500, bleuFonce);
	    Terrain bleuFonce2 = new Terrain("Rue de la paix", 400, 50, 200, 600, 1400, 1700, 2000, bleuFonce);
	    bleuFonce.ajouteTerrain(bleuFonce1);
	    bleuFonce.ajouteTerrain(bleuFonce2);

	    // Les cases gares
	    // Param : Nom (loyer et prixAchat sont les m�mes pour tous)
	    Gare gare1 = new Gare("Gare Montparnasse");
	    Gare gare2 = new Gare("Gare de lyon");
	    Gare gare3 = new Gare("Gare du nord");
	    Gare gare4 = new Gare("Gare Saint-Lazard");
	    
	    // Les cases energies
	    // Param : Nom, PrixAchat (pourrait ne pas y �tre))
	    Service service1 = new Service("Compagnie de distribution d'�lectricit�");
	    Service service2 = new Service("Compagnie de distribution des eaux");
	    
	    // Les autres cases
	    ParcGratuit parcgratuit = new ParcGratuit();
	    CaseDepart depart = new CaseDepart();
	    Impots impots1 = new Impots();
	    Impots impots2 = new Impots();
	    
	    // Liste de toutes les cases dans l'ordre du plateau 
	    p.ajouteCase(depart);
	    p.ajouteCase(marron1);
	    p.ajouteCase(marron2);
	    p.ajouteCase(impots1);
	    p.ajouteCase(gare1);
	    p.ajouteCase(bleuClair1);
	    p.ajouteCase(bleuClair2);
	    p.ajouteCase(bleuClair3);
	    p.ajouteCase(rose1);
	    p.ajouteCase(service1);
	    p.ajouteCase(rose2);
	    p.ajouteCase(rose3);
	    p.ajouteCase(gare2);
	    p.ajouteCase(orange1);
	    p.ajouteCase(orange2);
	    p.ajouteCase(orange3);
	    p.ajouteCase(parcgratuit);
	    p.ajouteCase(rouge1);
	    p.ajouteCase(rouge2);
	    p.ajouteCase(rouge3);
	    p.ajouteCase(gare3);
	    p.ajouteCase(jaune1);
	    p.ajouteCase(jaune2);
	    p.ajouteCase(service2);
	    p.ajouteCase(jaune3);
	    p.ajouteCase(vert1);
	    p.ajouteCase(vert2);
	    p.ajouteCase(vert3);
	    p.ajouteCase(gare4);
	    p.ajouteCase(bleuFonce1);
	    p.ajouteCase(impots2);
	    p.ajouteCase(bleuFonce2);
	    
		Joueur paul = new Joueur("Paul");
		Joueur luc = new Joueur("Luc");
		Joueur theo = new Joueur("Théo");
		p.ajouteJoueur(paul);
		p.ajouteJoueur(luc);
		p.ajouteJoueur(theo);
		
		Joueur jCourrant;
		
		//increment 1
		//Luc fait 5 et atterit sur la rue de Vaugirard
		jCourrant = p.joueurCourrant();
		System.out.println("C'est au tour de " + jCourrant.getNom());
		p.avance(jCourrant, 5);
		jCourrant.getCaseActuelle().arriveeJoueur(jCourrant);
		jCourrant.construire();
		p.finTour();
		
		//increment 2.1
		// Paul a deja l'autre propri�t� du quartier de la Rue de la Paix
		luc.ajoutePropriete(bleuFonce1);
		bleuFonce1.setProprio(luc);
		bleuFonce1.setEtatCase(new EtatAchete(bleuFonce1));
		
		jCourrant = p.joueurCourrant();
		System.out.println("C'est au tour de " + jCourrant.getNom());
		p.avance(jCourrant, 31);
		jCourrant.getCaseActuelle().arriveeJoueur(jCourrant);
		jCourrant.construire();
		p.finTour();
		
		//increment 2.2
		// Th�o atterit sur la rue de la paix et va devoir payer a luc
		jCourrant = p.joueurCourrant();
		System.out.println("C'est au tour de " + jCourrant.getNom());
		p.avance(jCourrant, 31);
		jCourrant.getCaseActuelle().arriveeJoueur(jCourrant);
		jCourrant.construire();
		p.finTour();
		
		//increment 2.3
		// Paul atterit sur le service des eaux et va devoir payer a Th�o
		theo.ajoutePropriete(service2);
		service2.setProprio(theo);
		
		jCourrant = p.joueurCourrant();
		System.out.println("C'est au tour de " + jCourrant.getNom());
		p.avance(jCourrant, 18);
		jCourrant.getCaseActuelle().arriveeJoueur(jCourrant);
		jCourrant.construire();
		p.finTour();
		
		//increment 2.4
		// Luc atterit sur la gare montparnasse et va devoir payer a Paul
		paul.ajoutePropriete(gare1);
		gare1.setProprio(paul);
		paul.ajoutePropriete(gare2);
		gare2.setProprio(paul);
		paul.ajoutePropriete(gare3);
		gare3.setProprio(paul);
		
		luc.ajoutePropriete(vert1);
		luc.ajoutePropriete(vert2);
		luc.ajoutePropriete(vert3);
		vert1.setProprio(luc);
		vert1.setEtatCase(new EtatConstructible(vert1));
		vert2.setProprio(luc);
		vert2.setEtatCase(new EtatConstructible(vert2));
		vert3.setProprio(luc);
		vert3.setEtatCase(new EtatConstructible(vert3));
		
		jCourrant = p.joueurCourrant();
		System.out.println("C'est au tour de " + jCourrant.getNom());
		p.avance(jCourrant, 5);
		jCourrant.getCaseActuelle().arriveeJoueur(jCourrant);
		jCourrant.construire();
		p.finTour();
		
		//increment 2.4
		// Theo atterit de nouveau sur la rue de la paix, avec une maison dessus
		jCourrant = p.joueurCourrant();
		System.out.println("C'est au tour de " + jCourrant.getNom());
		p.avance(jCourrant, 0);
		jCourrant.getCaseActuelle().arriveeJoueur(jCourrant);
		jCourrant.construire();
		p.finTour();
	}
	
}
