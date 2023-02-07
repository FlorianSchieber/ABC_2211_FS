package ascenseur;

public class App {

	public static void main(String[] args) {
		
		Ascenseur otis = new Ascenseur(-1, 3, 0);
		System.out.println(otis.toString());
		
		System.out.println(otis.appeler(2));
		System.out.println(otis.toString());
		
		System.out.println(otis.fermer());
		System.out.println(otis.toString());
		
		System.out.println(otis.monter(3));
		System.out.println(otis.toString());
		
		System.out.println(otis.ouvrir());
		System.out.println(otis.toString());

	}

}
