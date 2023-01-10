package annee_bissextile;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// DECLARATIONS

		int annee;

		Scanner sc = new Scanner(System.in);

		// DEBUT PROGRAMME

		System.out.println("PROGRAMME DE CALCUL D'ANNEE BISSEXTILE\n");

		System.out.print("Veuillez saisir une annee : ");
		annee = sc.nextInt();

		System.out.print("\n");
		
		if (annee % 4 == 0 && (annee % 100 != 0 || annee % 400 == 0)) {
			System.out.print(annee + " est bissextile");
		}
		else {
			System.out.print(annee + " n'est pas bissextile");
		}
		
		// FIN PROGRAMME
		
		sc.close();
	}

}
