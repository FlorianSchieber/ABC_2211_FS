package conversion;

import java.util.Scanner;
import java.lang.String;

public class App {

	public static void main(String[] args) {

		// DECLARATION
		
		int km;
		double miles;
		String saisie;
		boolean quitter = false;
		
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
		
		System.out.println("PROGRAMME DE CONVERSION DE KM EN MILES\n");
		
		while (!quitter) {
			
			System.out.print("Veuillez saisir une distance en kilometres (ou tapez 'q' pour quitter) : ");
			saisie = sc.nextLine();
			
			System.out.println();

			if (saisie.equals("q")) {
				
				quitter = true;
			
			}
			else {
				
				km = Integer.parseInt(saisie);
				
				if (km > 0.01 && km < 1000000) {
				
					miles = km / 1.609;
					System.out.println(km + " kilometres egalent " + miles + " miles");
					quitter = true;
				
				}
			
			}
			
		}
		
		// FIN PROGRAMME
		
		sc.close();
		
	}

}
