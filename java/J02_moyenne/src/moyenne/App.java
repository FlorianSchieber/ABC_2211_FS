package moyenne;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		// DECLARATIONS
		
		int nombre1;
		int nombre2;
		double moyenne;
		
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
		
		System.out.println("Programme de caclul de la moyenne de deux nombres\n");
		
		System.out.print("Veuillez saisir un premier nombre entier : ");
		nombre1 = sc.nextInt();
		
		System.out.print("veuillez saisir un second nombre entier : ");
		nombre2 = sc.nextInt();
		
		System.out.println();
		
		moyenne = (double) (nombre1 + nombre2) / 2;
		
		System.out.println("La moyenne de " + nombre1 + " et " + nombre2 + " est " + moyenne);
		
		// FIN PROGRAMME
		
		sc.close();
	}

}
