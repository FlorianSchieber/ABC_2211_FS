package noms_abcdev;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// DECLARATIONS
		
		String[] TABLEAU_NOMS = {
				"Kevin",
				"Natana",
				"Florian",
				"Raphael",
				"Frederic",
				"Samba",
				"Terence",
				"Stefan",
				"Guillaume",
				"Mickael",
				"Olivier",
				"Mustafah",
				"Devoldere",
				"Adeline"
		};
		
		int entree;
		
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
		
		System.out.print("Quel est votre choix : ");
		entree = sc.nextInt();
		
		if (entree > 0 && entree <= TABLEAU_NOMS.length ) {
			
			System.out.println("Bonjour " + TABLEAU_NOMS[entree - 1]);
			
		}
		else {
			
			System.out.println("Error 404 not found");
			
		}
		
		sc.close();

	}

}
