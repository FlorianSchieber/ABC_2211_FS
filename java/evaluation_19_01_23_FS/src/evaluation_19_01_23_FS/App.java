package evaluation_19_01_23_FS;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// DECLARATIONS
		
		final String[] NOMS_MOIS = {
			"janvier",
			"fevrier",
			"mars",
			"avril",
			"mai",
			"juin",
			"juillet",
			"aout",
			"septembre",
			"octobre",
			"novembre",
			"decembre"
		};
		
		final int[] JOURS_MOIS = {
			31,
			28,
			31,
			30,
			31,
			30,
			31,
			31,
			30,
			31,
			30,
			31
		};
		
		final String[] PARITE = {
			"pair",
			"impair"
		};
		
		int moisSaisi;
		int diviseur;
		int jourDepart;
		
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
		
		System.out.println("BIENVENUE SUR NOTRE APPLICATION CONSOLE\n");
		
		do {
			
			System.out.print("Saisissez un numero de mois : ");
			moisSaisi = sc.nextInt();
			
			if (moisSaisi < 1 || moisSaisi > 12) { // Si la saisie dépasse la plage [1,12]
				
				System.out.println("Numero de mois invalide, veuillez recommencer.");
				
			}
					
		} while (moisSaisi < 1 || moisSaisi > 12);
		
		System.out.println("\nLe mois de " + NOMS_MOIS[moisSaisi - 1] + " (" + moisSaisi + ") est " + PARITE[moisSaisi % 2] + ".");
		
		if (moisSaisi % 2 == 0) { // Si la saisie est paire
			
			diviseur = 3;
			jourDepart = 1;
			
		}
		else { // Si la saisie est impaire
			
			diviseur = 10;
			jourDepart = 2;
			
		}

		
		System.out.println("Les jours " + PARITE[jourDepart % 2] + "s du mois (sauf multiples de " + diviseur + ") sont :");
		
		for (int jour = jourDepart; jour <= JOURS_MOIS[moisSaisi - 1]; jour += 2) {
			
			if (jour % diviseur != 0) { // Si le jour est multiple du nombre associé à la parité du mois
				
				if (jour != jourDepart) {
					
					System.out.print(", "); // Mise en forme de l'affichage
					
				}					
			
				System.out.print(jour); // Affichage du jour correspondant aux critères
			
			}
				
		}
		
		System.out.println("."); // Mise en forme de l'affichage
		
		System.out.println("\nMerci et a bientot !");
		
		// FIN PROGRAMME
		
		sc.close();
		
	}

}
