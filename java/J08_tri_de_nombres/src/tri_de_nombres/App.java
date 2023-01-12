package tri_de_nombres;

import java.util.Scanner;

public class App {

	// DEFINITION DE LA FONCTION afficher

	public static void afficher(int nombre1, int nombre2) {

		System.out.println("Ces deux nombres dans l'ordre croissant sont " + nombre1 + " <= " + nombre2);

	}

	public static void main(String[] args) {

		// DECLARATIONS

		int a;
		int b;

		Scanner sc = new Scanner(System.in);

		// DEBUT PROGRAMME

		System.out.println("PROGRAMME DE TRI DE DEUX NOMBRES\n");

		System.out.print("Veuillez saisir un premier nombre entier : ");
		a = sc.nextInt();

		System.out.print("Veuillez saisir un second nombre entier : ");
		b = sc.nextInt();

		System.out.println();

		if (a < b) {
			afficher(a, b);
		} else {
			afficher(b, a);
		}

		// FIN PROGRAMME

		sc.close();
	}

}
