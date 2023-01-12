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
		
		System.out.println("BARNABE FAIT SES COURSES\n");
		
		System.out.print("Veuillez saisir la somme de depart de Barnabe : ");
		sommeDepart = sc.nextInt();
		
		sommeRestante = (double) sommeDepart;
		
		while (sommeRestante > 0) {
			
			if (sommeRestante < 4) {
				
				sommeRestante = 0;
				
			}
			else {
				
				sommeRestante = sommeRestante / 2 - 1;
				
			}
			
			magasins++;
		
		}
		
		System.out.println("Barnabe a achete dans " + magasins + " magasin(s)");
		
		// FIN PROGRAMME
		
		sc.close();
		
	}

}
