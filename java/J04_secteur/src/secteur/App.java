package secteur;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// DECLARTIONS
		
		final double PI = Math.PI;
		
		double rayon;
		double angleDegres;
		double aire;
		
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
		
		System.out.println("PROGRAMME DE CALCUL DE L'AIRE D'UN SECTEUR ANGULAIRE\n");
		
		System.out.print("Veuillez saisir rayon du cercle : ");
		rayon = sc.nextDouble();
		
		System.out.print("Veuillez saisir l'angle du secteur (en degres) : ");
		angleDegres = sc.nextDouble();
		
		System.out.print("\n");
		
		aire = PI * Math.pow(rayon, 2) * angleDegres / 360;
		
		System.out.println("L'aire du secteur angulaire de rayon " + rayon + " et d'angle de " + angleDegres + " degres est de " + aire);
		
		// FIN PROGRAMME
		
		sc.close();
		
	}

}
