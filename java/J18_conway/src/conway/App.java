package conway;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// DECLARATIONS
		
		String valeur;
		int occurence;
		int termeFinal;
		String chaineActuelle = "1";
		String chaineSuivante;
		
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
		
		System.out.print("Conway : ");
		termeFinal = sc.nextInt();
		
		System.out.println("0 : " + chaineActuelle);
		
		for (int terme = 1; terme < termeFinal; terme++) { // Pour chaque terme de la suite
			
			valeur = "";
			occurence = 0;
			chaineSuivante = "";
			
			
			for (int indice = 0; indice <= chaineActuelle.length(); indice++) { // pour chaque caractere de la chaine de départ
				
				if (indice == chaineActuelle.length()) { // Si c'est le dernier caractère
					
					chaineSuivante += occurence + valeur;
					
				}
				
				else if (indice == 0) { // Si c'est le premier caractère
					
					valeur = chaineActuelle.substring(0, 1);
					occurence = 1;
					
				}
				
				
				else if (chaineActuelle.substring(indice, indice + 1).equals(valeur)) { // Si la valeur change
					
					occurence++;
					
				}
				else { // Si la valeur ne change pas
					
					chaineSuivante += occurence + valeur;
					valeur = chaineActuelle.substring(indice, indice + 1);
					occurence = 1;
					
				}
				
			}
			
			System.out.println(terme + " : " + chaineSuivante);
			
			chaineActuelle = chaineSuivante;

			
		}
		
		// FIN PROGRAMME
		
		sc.close();

	}

}
