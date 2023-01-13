package recherche_lettre;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// DECLARATIONS
		
		String caractere;
		int occurence = 0;
		
		final String PHRASE = "Bonjour je m'appelle Natana et je dois arreter de me devaloriser.";
		
		Scanner sc = new Scanner(System.in);
				
		// DEBUT PROGRAMME
		
		if (PHRASE.equals("") || PHRASE.equals(".")) {
			
			System.out.println("La phrase est vide !");
			
		}
		else {
			
			System.out.println("PROGRAMME DE RECHERCHE D'UN CARACTERE DANS LA PHRASE " + PHRASE + "\n");
			
			System.out.print("Veuillez saisir un caractere : ");
			caractere = sc.next();
			
			System.out.println();
			
			for (int indice = 0; indice < PHRASE.length(); indice++) {
				
				if (PHRASE.substring(indice, indice+1).equals(caractere)) { // PHRASE[indice] == caractere
					
					occurence++;
					
				}
				
			}
			
			if (occurence > 0) {
				
				System.out.println("Le caractere " + caractere + " est present " + occurence + " fois dans " + PHRASE);
				
			}
			else {
				
				System.out.println("Le caractere " + caractere + " n'apparait pas dans " + PHRASE);
				
			}
			
		}
		
		// FIN PROGRAMME
		
		sc.close();
	}

}
