package fourchette;

import java.util.Random;
import java.util.Scanner;

public class App {
	
	public static int randomCRM(int min, int max) {
		
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min;
		
	}

	public static void main(String[] args) {
		
		// DECLARATIONS
		
		int question;
		int bas = 0;
		int haut = 100;
		int reponse = randomCRM(bas, haut);
		int essais = 0;
		
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
		
		do {
			
			System.out.print("Veuillez saisir un nombre entre " + bas + " et " + haut + " : ");
			question = sc.nextInt();
			
			System.out.println();
			
			if (bas <= question && question <= haut) { // Si la question est dans la fourchette
				
				essais++;
				
				if (question < reponse) {
					
					bas = question + 1;
					System.out.println(question + " est trop petit !\n");
					
				}
				else if (reponse < question) {
					
					haut = question - 1;
					System.out.println(question + " est trop grand !\n");
					
				}
					
			}
			
		} while (question != reponse);
		
		System.out.println("BRAVO ! Vous avez trouve en " + essais + " essai(s)");
		
		// FIN PROGRAMME
		
		sc.close();
		
	}

}
