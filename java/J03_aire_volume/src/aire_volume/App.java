package aire_volume;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//CONSTANTES ET VARIABLES
		
		double pi = Math.PI;
		
		double rayon;
		double aire;
		double volume;
		
		Scanner sc = new Scanner(System.in);
		
		//DEBUT PROGRAMME
		
		System.out.println("Programme de calcul de l'aire et d'un volume d'une sphere");
		System.out.print("Veuillez saisir le rayon de la sphere : ");
		
		rayon = sc.nextInt();
		
		aire = 4 * pi * Math.pow(rayon, 2);
		volume = 4 / 3 * pi * Math.pow(rayon, 3);
		
		System.out.println("La sphere de rayon " + rayon + " a une aire de " + aire + " et un volume de " + volume);
		
		sc.close();
		
		// FIN PROGRAMME
		
	}

}
