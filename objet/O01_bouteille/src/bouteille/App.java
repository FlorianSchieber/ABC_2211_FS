package bouteille;

public class App {
	
	public static void main(String[] args) {
		
		Bouteille maBouteille = new Bouteille("a moi",5);
		
		System.out.println(maBouteille.ouvrir());
		
		System.out.println(maBouteille.remplir());
		
		System.out.println(maBouteille.vider(3.5));
		
		
		Bouteille bouteilleDeBiere = new Bouteille("de biere", 0.25);
		
		System.out.println(bouteilleDeBiere.remplir()); // Le barman veut remplir la bouteille (il n'a plus de verre)
		
		System.out.println(bouteilleDeBiere.ouvrir()); // Le barman est pressé et n'a pas vu que la bouteille est fermée
		
		System.out.println(bouteilleDeBiere.remplir(0.1)); // Le barman remplit la bouteille
		
		System.out.println(bouteilleDeBiere.remplir(0.1));
		
		System.out.println(bouteilleDeBiere.remplir(0.1)); // Le barman fait déborder la bouteille
		
		System.out.println(bouteilleDeBiere.fermer()); // Le barman ferme la bouteille et la sert à Papy Jeannot
		
		System.out.println(bouteilleDeBiere.vider()); // Papy Jeannot veut faire c*l sec
		
		System.out.println(bouteilleDeBiere.ouvrir()); // Papy Jeannot est tellement bourré qu'il ne voit pas que la bouteille est fermée
		
		System.out.println(bouteilleDeBiere.vider()); // Papy Jeannot fait c*l sec
		
		System.out.println(bouteilleDeBiere.vider()); // Papy Jeannot veut faire plus que c*l sec
		
		
		
		
	}

}
