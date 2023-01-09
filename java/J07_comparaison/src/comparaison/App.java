package comparaison;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// DECLARATIONS
		
		int age;
		
		Scanner sc = new Scanner(System.in);

		// DEBUT PROGRAMME
		
		System.out.println("PROGRAMME QUI VOUS DIT SI VOUS ETES MAJEUR\n");
		
		System.out.print("Veuillez saisir votre age : ");
		age = sc.nextInt();
		
		System.out.print("\n");
		
		if (age < 0) {
			System.out.print("Vous n'etes pas encore ne !");
		}
		else if (age < 18) {
			System.out.print("Vous etes mineur !");
		}
		else {
			System.out.print("Vous etes majeur !");
		}
		
		// FIN PROGRAMME
		
		sc.close();
		
	}

}
