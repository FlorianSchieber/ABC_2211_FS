package premier;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// DECLARATIONS
		
		int nombre;
		int diviseur = 2;
		boolean diviseurTrouve = false;
		
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
		
		System.out.println("PROGRAMME DE TEST DE PRIMALITE\n");
		
		System.out.print("Veuillez saisir un nombre entier : ");
		nombre = sc.nextInt();
		
		System.out.println();
		
		if (nombre < 2) {
			
			System.out.println("Par definition, " + nombre + " n'est pas premier");
			
		}
		else {
		
			while (!diviseurTrouve && diviseur < nombre) { // Recherche d'un diviseur
					
				if (nombre % diviseur == 0) {
					diviseurTrouve = true;
				}
				
				diviseur++;
			
			} 
			
			if (diviseurTrouve) {
				
				System.out.println(nombre + " est compose");
				
			}
			else {
				
				System.out.println(nombre + " est premier");
				
			}
			
		}		
			
		// FIN PROGRAMME
		
		sc.close();

	}

}
