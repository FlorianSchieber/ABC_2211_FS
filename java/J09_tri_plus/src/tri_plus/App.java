package tri_plus;

import java.util.Scanner;

public class App {

	// DEFINITION DE LA FONCTION afficher
	
	public static void afficher(double nombre1, double nombre2, double nombre3) {
		
		System.out.println("Ces trois nombres dans l'ordre croissant sont " + nombre1 + " <= " + nombre2
				+ " <= " + nombre3);
		
	}
	
	public static void main(String[] args) {
	
		// DECLARATIONS
		
		double a;
		double b;
		double c;
		
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
		
		System.out.println("PROGRAMME DE TRI DE TROIS NOMBRES\n");
		
		System.out.print("Veuillez saisir un premier nombre : ");
		a = sc.nextDouble();
		
		System.out.print("Veuillez saisir un deuxieme nombre : ");
		b = sc.nextDouble();
		
		System.out.print("Veuillez saisir un troisieme nombre : ");
		c = sc.nextDouble();
		
		System.out.println();
		
		if (a < b) {
			if (b < c) {
				afficher(a, b, c);
			}
			else if (a < c) {
				afficher(a, c, b);
			}
			else {
				afficher(c, a, b);
			}
		}
		else {
			if (a < c) {
				afficher(b, a, c);
			}
			else if (b < c) {
				afficher(b, c, a);
			}
			else {
				afficher(c, b, a);
			}
		}
		
		// FIN PROGRAMME
		
		sc.close();
	}

}
