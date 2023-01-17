package test;

public class App {

	public static void main(String[] args) {
		
		// System.in  = flux d'entrée
		// System.out = flux de sortie
		// System.err = flux d'erreur

		
		// HELLO WORLD
		
		System.out.println("Hello World !");
		
		// DECLARATIONS
		
		String[] tableau = {
				"bleu",
				"vert",
				"rouge",
				"noir",
				"blanc"
				};
		
		String name;
		String firstName;
		
		// DEBUT PROGRAMME
		
		name = "Robson";
		firstName = "Natana";
		
		System.out.println("Hello " + firstName + " " + name);
		
		System.out.println(tableau[4]);
		
		double pi = (int) Math.round(Math.PI * 100) / 100d; 
		
		System.out.println(pi);
		
		// FIN PROGRAMME
		
	}

}