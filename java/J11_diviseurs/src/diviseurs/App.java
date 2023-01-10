package diviseurs;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// DECLARATIONS

		int nombre;

		Scanner sc = new Scanner(System.in);

		// DEBUT PROGRAMME

		System.out.println("PROGRAMME DE RECHERCHE DES DIVISEURS D'UN NOMBRE\n");

		System.out.print("Veuillez saisir un nombre entier : ");
		nombre = sc.nextInt();

		for (int diviseur = 2; diviseur < nombre; diviseur++) {

			if (nombre % diviseur == 0) {
				System.out.print(diviseur + " ");
			}

		}

		// FIN PROGRAMME

		sc.close();

	}

}
