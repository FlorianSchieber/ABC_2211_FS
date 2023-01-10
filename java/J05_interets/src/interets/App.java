package interets;

import java.util.Scanner;

public class App {
	
	// DEFINTION DE LA FONCTION enDevise, convertissant la valeur en centimes en devise entière
	
	public static double enDevise(int centimes) {
		return (double) centimes / 100;
	}

	public static void main(String[] args) {

		// DECLARATIONS

		int somme;				// En centimes
		double interet;
		int annees;
		int interetSimple;		// En centimes
		int beneficeSimple;		// En centimes
		int interetCompose;		// En centimes
		int beneficeCompose;	// En centimes
		
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME

		System.out.println("PROGRAMME DE CALCUL D'INTERET\n");

		System.out.print("Veuillez saisir la somme placee sur votre compte : ");
		somme = (int) (sc.nextDouble() * 100);

		System.out.print("Veuillez saisir l'interet offert par la banque (en pourcentage) : ");
		interet = sc.nextDouble();

		System.out.print("Veuillez saisir le nombre d'annees de placement de la somme : ");
		annees = sc.nextInt();
		
		System.out.print("\n");

		interetSimple = (int) (somme * (1 + annees * interet / 100));
		interetCompose = (int) (somme * Math.pow((1 + interet / 100), annees));

		beneficeSimple = interetSimple - somme;
		beneficeCompose = interetCompose - somme;

		System.out.println("La \"valeur\" acquise par la somme " + enDevise(somme) + " placee pendant " + annees
				+ " annees est de : ");
		System.out.println(enDevise(interetSimple) + " avec un interet simple, soit un benefice de "
				+ enDevise(beneficeSimple));
		System.out.println(enDevise(interetCompose) + " avec un interet compose, soit un benefice de "
				+ enDevise(beneficeCompose));

		// FIN PROGRAMME
		
		sc.close();
		
	}

}
