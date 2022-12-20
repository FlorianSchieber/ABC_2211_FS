package secteur;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		//VARIABLES
		
		double pi = Math.PI;
		
		double rayon;
		double angleDegres;
		double aire;
		
		// DEBUT PROGRAMME
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programme de calcul de l'aire d'un secteur circulaire");
		
		System.out.print("Veuillez saisir rayon du cercle : ");
		rayon = sc.nextDouble();
		
		System.out.print("Veuillez saisir l'angle du secteur (en degres) : ");
		angleDegres = sc.nextDouble();
		
		aire = pi * Math.pow(rayon, 2) * angleDegres / 360;
		
		System.out.println("L'aire du secteur angulaire de rayon " + rayon + " et d'angle de " + angleDegres + " degres est de : " + aire);
		
		
		sc.close();
		
		
	}

}
