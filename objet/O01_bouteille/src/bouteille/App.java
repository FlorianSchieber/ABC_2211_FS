package bouteille;

public class App {
	
	public static void main(String[] args) {
		
		Bouteille maBouteille = new Bouteille("Ma bouteille",5);
		
		maBouteille.ouvrir();
		
		maBouteille.remplir();
		
		maBouteille.vider(3.5);
		
		
		System.out.println();
		
		
		Bouteille bouteilleDeBiere = new Bouteille("La bouteille de biere", 0.25);
		
		bouteilleDeBiere.remplir(); // Le barman veut remplir la bouteille (il n'a plus de verre)
		
		bouteilleDeBiere.ouvrir(); // Le barman est pressé et n'a pas vu que la bouteille est fermée
		
		bouteilleDeBiere.remplir(0.1); // Le barman remplit la bouteille
		
		bouteilleDeBiere.remplir(0.1);
		
		bouteilleDeBiere.remplir(0.1); // Le barman fait déborder la bouteille
		
		bouteilleDeBiere.fermer(); // Le barman ferme la bouteille et la sert à Papy Jeannot
		
		bouteilleDeBiere.vider(); // Papy Jeannot veut faire c*l sec
		
		bouteilleDeBiere.ouvrir(); // Papy Jeannot est tellement bourré qu'il ne voit pas que la bouteille est fermée
		
		bouteilleDeBiere.vider(); // Papy Jeannot fait c*l sec
		
		bouteilleDeBiere.vider(); // Papy Jeannot veut faire plus que c*l sec
		
	}

}
