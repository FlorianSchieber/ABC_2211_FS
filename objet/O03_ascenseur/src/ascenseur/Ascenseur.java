package ascenseur;

public class Ascenseur {
	
	private final int etageMinimum;
	private final int etageMaximum;
	private int etage;
	private boolean porteOuverte;
	
	public Ascenseur(int _etageMinimum, int _etageMaximum, int _etage) {
		
		this.etageMinimum = _etageMinimum;
		this.etageMaximum = _etageMaximum;
		this.etage = _etage;
		this.porteOuverte = false;
		
	}
	
	@Override
	public String toString() {
		
		return "etageMinimum = " + this.etageMinimum +
				"\netageMaximum = " + this.etageMaximum +
				"\netage = " + this.etage +
				"\nporteOuverte = " + this.porteOuverte +
				"\n";
		
	}
	
	public boolean ouvrir() {
		
		if (!this.porteOuverte) {
			
			this.porteOuverte = true;
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	public boolean fermer() {
		
		if (this.porteOuverte) {
			
			this.porteOuverte = false;
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	public boolean monter(int etageCible) {
		
		if (
				etageCible >= this.etageMinimum			// Si l'étage d'appel est valide
				&& etageCible <= this.etageMaximum
				&& etageCible > this.etage			// Si l'ascenseur est en dessous de l'étage d'appel
				&& !this.porteOuverte				// Si la porte est fermée
				) {
				
			this.etage = etageCible;
			return true;
				
		} else {
			
			return false;
			
		}

	}
	
	
	public boolean descendre(int etageCible) {
		
		if (
				etageCible >= this.etageMinimum			// Si l'étage d'appel est valide
				&& etageCible <= this.etageMaximum
				&& etageCible < this.etage			// Si l'ascenseur est au dessus de l'étage d'appel
				&& !this.porteOuverte				// Si la porte est fermée
				) {
				
			this.etage = etageCible;
			return true;
				
		} else {
			
			return false;
			
		}

	}	
	
	
	public boolean appeler(int etageAppel) {
		
		if (etageAppel > etage) {
			
			if (!this.monter(etageAppel)) {
				
				return false;
				
			}
			
		} else if (etageAppel < etage) {
			
			if (!this.descendre(etageAppel)) {
				
				return false;
				
			}
			
		}
		
		if (!this.ouvrir()) {
			
			return false;
			
		}
		
		return true;
		
	}
	
}
