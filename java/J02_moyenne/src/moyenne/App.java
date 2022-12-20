package moyenne;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		//DECLARATION VARIABLES
		
		int nombre1;
		int nombre2;
		double moyenne;
		
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
		
		System.out.println("Programme de caclul de la moyenne de deux nombres");
		
		System.out.print("Veuillez saisir un premier nombre : ");
		nombre1 = sc.nextInt();
		
		System.out.print("veuillez saisir un second nombre : ");
		nombre2 = sc.nextInt();
		
		moyenne = (double) (nombre1 + nombre2) / 2;
		
		System.out.println("La moyenne de " + nombre1 + " et " + nombre2 + " est " + moyenne);
		
		sc.close();
		
		// FIN PROGRAMME
		
	}

}
