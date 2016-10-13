package nsis.app;

import nsis.metier.Ciseaux;
import nsis.metier.Main;
import nsis.metier.Papier;
import nsis.metier.Pierre;

public class Jeu {

	public static Main genereMain(int choixMain){
		Main laMainchoisie = null;
		
		switch (choixMain) {
		case 1:	laMainchoisie = new Pierre();
				break;
		
		case 2:	laMainchoisie = new Papier();
				break;

		case 3:	laMainchoisie = new Ciseaux();
				break;
		
		default:System.out.println("Lavaleur choisie est incorrecte");
				break;
		}
		
		return laMainchoisie;
	}
	
	
	public static void testCombinaison(Main m1, Main m2){
		//Affiche les mains
		System.out.println("Si main1 = "+m1.getClass().getSimpleName());
		System.out.println("et main2 = "+m2.getClass().getSimpleName());
		System.out.println("alors m1.gagneContre(m2) = "+m1.gagneContre(m2));
	}
	
	public static void main(String[] args) {
		
		/*Teste de possibilité*/
		Main pierre = new Pierre();
		Main papier = new Papier();
		Main ciseaux= new Ciseaux();
		
		testCombinaison(pierre,pierre);
		testCombinaison(pierre,papier);
		testCombinaison(pierre,ciseaux);
		testCombinaison(papier,pierre);
		testCombinaison(papier,papier);
		testCombinaison(papier,ciseaux);
		testCombinaison(ciseaux,pierre);
		testCombinaison(ciseaux,papier);
		testCombinaison(ciseaux,ciseaux);
		
		
		/*Création de la main du joueur*/
		Main mainJoueur = genereMain(Integer.parseInt(args[0]));
		System.out.println("Choix Joueur:  "+mainJoueur.getClass().getSimpleName());
		
		/*Choix de la main de l'ordinateur*/
		int choixOrdi =  ((int)(Math.random() * 10)) % 3 + 1;
		Main mainOrdi = genereMain(choixOrdi);
		System.out.println("Choix Ordinateur:  "+mainOrdi.getClass().getSimpleName());
		
		if(mainJoueur.gagneContre(mainOrdi) == null){
			System.out.println("Egalité");
		}
		else{
			if(mainJoueur.gagneContre(mainOrdi)){
				System.out.println("Joueur à gagner");
			}
			else{
				System.out.println("Joueur à perdu !!");
			}
		}
		

	}

}
