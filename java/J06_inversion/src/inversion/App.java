package inversion;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// DECLARATION

		int a;
		int b;
		int temporaire;
		
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
		
		System.out.println("PROGRAMME D'INVERSION DE DEUX VALEURS\n");
		
		System.out.print("Veuillez saisir la valeur de a : ");
		a = sc.nextInt();
		
		System.out.print("Veuillez saisir la valeur de b : ");
		b = sc.nextInt();
		
		System.out.print("\n");
		
		temporaire = a;
		a = b;
		b = temporaire;
		
		System.out.println("La valeur de a est maintenant " + a + " et celle de b est " + b);
		
		// FIN PROGRAMME
		
		sc.close();

	}

}