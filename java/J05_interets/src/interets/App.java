package interets;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//VARIABLES

		double S;
		double i;
		double N;
		double interetSimple;
		double interetCompose;
		
		//DEBUT PROGRAMME
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PROGRAMME DE CALCUL D'INTÉRET");
		
		System.out.print("Veuillez saisir la somme placee sur votre compte : ");
		S = sc.nextDouble();
		
		System.out.print("Veuillez saisir l'interet offert par la banque (en pourcentage) : ");
		i = sc.nextDouble();
		
		System.out.print("Veuillez saisir le nombre d'annees de placement de la somme : ");
		N = sc.nextDouble();
		
		interetSimple = S * (1 + N * i / 100);
		interetCompose = S * Math.pow((1 + i / 100), N);
		
		System.out.println("La valeur acquise par la somme " + S + " placee pendant " + N + " annees est de : ");
		System.out.println(interetSimple + " avec un interet simple");
		System.out.println(interetCompose + " avec un interet compose");
		
	}

}
