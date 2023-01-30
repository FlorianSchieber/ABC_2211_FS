package bouteille;

public class Bouteille {

	// CONSTANTES

	private double capacite;
	private String nom;

	// ETATS

	private Boolean estOuverte;
	private double contenu;

	// CONSTRUCTEUR
	
	public Bouteille(String nouveauNom, double nouvelleCapacite) {
		
		this.capacite = nouvelleCapacite;
		this.nom = nouveauNom;
		this.estOuverte = false;
		this.contenu = 0;
		
		System.out.println("Voici une nouvelle bouteille : " + this.nom + ". Elle a une capacite de " + this.capacite + " litres.");
		
	}
	
	// METHODES

	public void ouvrir() {
		
		if (!this.estOuverte) { 

			this.estOuverte = true;
			
			System.out.println(this.nom + " a ete ouverte.");
			
		} else {
			
			System.out.println(this.nom + " est deja ouverte.");
		}

	}

	public void fermer() {

		if (this.estOuverte) { 

			this.estOuverte = false;
			
			System.out.println(this.nom + " a ete fermee.");
			
		} else {
			
			System.out.println(this.nom + " est deja fermee.");
		}
		
	}
	
	public void remplir() {
		
		if (this.estOuverte) {
			
			this.contenu = this.capacite;
			
			System.out.println(this.nom + " a ete entierement remplie.");
		
		} else {
			
			System.out.println(this.nom + " n'a pas pu etre remplie car elle est fermee.");
			
		}
		
	}

	public void remplir(double quantiteAjoutee) {
		
		if (this.estOuverte) {

			double futurContenu = this.contenu + quantiteAjoutee;
	
			if (futurContenu > this.capacite) {
	
				this.contenu = this.capacite;
				
				System.out.println(this.nom + " a deborde, elle est maintenant entierement remplie.");
	
			} else {
	
				this.contenu = futurContenu;
				
				System.out.println(this.nom + " a ete remplie de " + quantiteAjoutee + " litres et contient maintenant " + this.contenu + " litres.");
				
			}
			
			
		} else {
			
			System.out.println(this.nom + " n'a pas pu etre remplie car elle est fermee.");
			
		}

	}
	
	public void vider() {
		
		if (this.estOuverte) {
			
			if (this.contenu > 0) {
				
				this.contenu = 0;
				
				System.out.println(this.nom + " a ete entierement videe.");
			
			} else {
				
				System.out.println(this.nom + " ne peut pas etre plus vide que vide.");
			}
		
		} else {
			
			System.out.println(this.nom + " n'a pas pu etre videe car elle est fermee.");
			
		}
		
	}

	public void vider(double quantiteOtee) {
		
		if (this.estOuverte) {
			
			if (this.contenu > 0) {

				double futurContenu = this.contenu - quantiteOtee;
		
				if (futurContenu <= 0) {
		
					this.contenu = 0;
					
					System.out.println(this.nom + " a ete entierement videe.");
		
				} else {
		
					this.contenu = futurContenu;
					
					System.out.println(this.nom + " a ete videe de " + quantiteOtee + " litres et contient maintenant " + this.contenu + " litres.");
					
				}
				
			} else {
				
				System.out.println(this.nom + " ne peut pas etre plus vide que vide.");
				
			}
			
		} else {
			
			System.out.println(this.nom + " n'a pas pu etre videe car elle est fermee.");
			
		}
		
	}

}
