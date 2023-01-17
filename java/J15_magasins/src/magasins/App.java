package magasins;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// DECLARATIONS
		
		int sommeDepart;
		int magasins = 0;
		double sommeRestante;
		
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
		
		System.out.println("BARNABE (sous tutelle) FAIT SES COURSES\n");
		
		System.out.print("Veuillez saisir la somme de depart de Barnabe : ");
		sommeDepart = sc.nextInt();
		
		sommeRestante = (double) sommeDepart;
		
		while (sommeRestante > 0) { // Tant que Barnabé a encore de l'argent
			
			if (sommeRestante < 4) { // "Est-ce que j'aurai assez de thune au prochain magasin ?"
				
				sommeRestante = 0; // Barnabé claque tout
				
			}
			else {
				
				sommeRestante = sommeRestante / 2 - 1; // Barnabé claque oklm comme d'hab
				
			}
			
			magasins++; // Barnabé sort du magasin
		
		}
		
		System.out.println("Barnabe a achete dans " + magasins + " magasin(s)");
		
		// FIN PROGRAMME
		
		sc.close();
		
	}

}