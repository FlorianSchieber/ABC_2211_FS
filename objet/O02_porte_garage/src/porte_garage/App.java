package porte_garage;

public class App {

	public static void main(String[] args) throws VerrouillageException {
		
		PorteGarageAutomatique PorteLeroyMerlin = new PorteGarageAutomatique(90.0, 0, true);
		System.out.println(PorteLeroyMerlin.toString());
		
		PorteLeroyMerlin.ouvrir(10);
		System.out.println(PorteLeroyMerlin.toString());
		
		PorteLeroyMerlin.ouvrir();
		System.out.println(PorteLeroyMerlin.toString());
		
		PorteLeroyMerlin.verrouiller();
		System.out.println(PorteLeroyMerlin.toString());
		
		PorteLeroyMerlin.fermer(-20);
		System.out.println(PorteLeroyMerlin.toString());
		
		PorteLeroyMerlin.fermer();
		System.out.println(PorteLeroyMerlin.toString());
		
		PorteLeroyMerlin.verrouiller();
		System.out.println(PorteLeroyMerlin.toString());
		
		PorteLeroyMerlin.ouvrir(10);
		System.out.println(PorteLeroyMerlin.toString());
		
		PorteLeroyMerlin.ouvrir();
		System.out.println(PorteLeroyMerlin.toString());
		
	}

}
