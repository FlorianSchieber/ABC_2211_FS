package interets;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//VARIABLES

		int S;
		double i;
		int N;
		int interetSimple;
		int beneficeSimple;
		int interetCompose;
		int beneficeCompose;
		
		//DEBUT PROGRAMME
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PROGRAMME DE CALCUL D'INTERET");
		
		System.out.print("Veuillez saisir la somme placee sur votre compte : ");
		S = (int) (sc.nextDouble() * 100);
		
		System.out.print("Veuillez saisir l'interet offert par la banque (en pourcentage) : ");
		i = sc.nextDouble();
		
		System.out.print("Veuillez saisir le nombre d'annees de placement de la somme : ");
		N = sc.nextInt();
		
		interetSimple = (int) (S * (1 + N * i / 100));
		interetCompose = (int) (S * Math.pow((1 + i / 100), N));
		
		beneficeSimple = interetSimple - S;
		beneficeCompose = interetCompose - S;
		
		
		System.out.println("La \"valeur\" acquise par la somme " + (double) S / 100 + " placee pendant " + N + " annees est de : ");
		System.out.println((double) interetSimple / 100  + " avec un interet simple, soit un benefice de " + (double) beneficeSimple / 100);
		System.out.println((double) interetCompose / 100 + " avec un interet compose, soit un benefice de " + (double) beneficeCompose / 100);
		
		sc.close();
		
	}

}
