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
		
	}
	
	// METHODES
	
	public String nomComplet() {
		
		return "La bouteille " + this.nom;
		
	}

	public String ouvrir() {
		
		if (!this.estOuverte) { 

			this.estOuverte = true;
			
			return this.nomComplet() + " a ete ouverte.";
			
		} else {
			
			return this.nomComplet() + " est deja ouverte.";
		}

	}

	public String fermer() {

		if (this.estOuverte) { 

			this.estOuverte = false;
			
			return this.nomComplet() + " a ete fermee.";
			
		} else {
			
			return this.nomComplet() + " est deja fermee.";
		}
		
	}
	
	public String remplir() {
		
		if (this.estOuverte) {
			
			this.contenu = this.capacite;
			
			return this.nomComplet() + " a ete entierement remplie.";
		
		} else {
			
			return this.nomComplet() + " n'a pas pu etre remplie car elle est fermee.";
			
		}
		
	}

	public String remplir(double quantiteAjoutee) {
		
		if (this.estOuverte) {

			double futurContenu = this.contenu + quantiteAjoutee;
	
			if (futurContenu > this.capacite) {
	
				this.contenu = this.capacite;
				
				return this.nomComplet() + " a deborde, elle est maintenant entierement remplie.";
	
			} else {
	
				this.contenu = futurContenu;
				
				return this.nomComplet() + " a ete remplie de " + quantiteAjoutee + " et contient maintenant " + this.contenu + ".";
				
			}
			
			
		} else {
			
			return this.nomComplet() + " n'a pas pu etre remplie car elle est fermee.";
			
		}

	}
	
	public String vider() {
		
		if (this.estOuverte) {
			
			if (this.contenu > 0) {
				
				this.contenu = 0;
				
				return this.nomComplet() + " a ete entierement videe.";
			
			} else {
				
				return this.nomComplet() + " ne peut pas etre plus vide que vide.";
			}
		
		} else {
			
			return this.nomComplet() + " n'a pas pu etre videe car elle est fermee.";
			
		}
		
	}

	public String vider(double quantiteOtee) {
		
		if (this.estOuverte) {
			
			if (this.contenu > 0) {

				double futurContenu = this.contenu - quantiteOtee;
		
				if (futurContenu <= 0) {
		
					this.contenu = 0;
					
					return this.nomComplet() + " a ete entierement videe.";
		
				} else {
		
					this.contenu = futurContenu;
					
					return this.nomComplet() + " a ete videe de " + quantiteOtee + " et contient maintenant " + this.contenu + ".";
					
				}
				
			} else {
				
				return this.nomComplet() + " ne peut pas etre plus vide que vide.";
				
			}
			
		} else {
			
			return this.nomComplet() + " n'a pas pu etre videe car elle est fermee.";
			
		}
		
	}

}
