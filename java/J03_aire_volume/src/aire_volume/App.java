package aire_volume;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// DECLARATIONS
		
		final double PI = Math.PI;
		
		double rayon;
		double aire;
		double volume;
		
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
		
		System.out.println("PROGRAMME DE CALCUL DE L'AIRE ET DU VOLUME D'UNE SPHERE\n");
		
		System.out.print("Veuillez saisir le rayon de la sphere : ");
		rayon = sc.nextInt();
		
		System.out.print("\n");
		
		aire = (double) (4 * PI * Math.pow(rayon, 2));
		volume = (double) (4 / 3 * PI * Math.pow(rayon, 3));
		
		System.out.println("La sphere de rayon " + rayon + " a une aire de " + aire + " et un volume de " + volume);
		
		// FIN PROGRAMME
		
		sc.close();
	}

}
