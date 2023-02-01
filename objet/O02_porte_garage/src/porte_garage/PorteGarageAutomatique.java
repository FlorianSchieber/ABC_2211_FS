package porte_garage;

public class PorteGarageAutomatique {

	// ATTRIBUTS

	private final double ouvertureMaximaleEnDegres;

	private double ouvertDeEnDegres;
	private Boolean estVerrouillee;

	// METHODES

	public PorteGarageAutomatique(double _ouvertureMaximaleEnDegres) {
		
		if (_ouvertureMaximaleEnDegres > 0) {
	
			this.ouvertureMaximaleEnDegres = _ouvertureMaximaleEnDegres;
			this.ouvertDeEnDegres = 0;
			this.estVerrouillee = false;
		
		} else {
			
			throw new ArithmeticException("zero or negative argument");
			
		}

	}
	
	
	public PorteGarageAutomatique(double _ouvertureMaximaleEnDegres, double _ouvertDeEnDegres, Boolean _estVerrouillee) throws VerrouillageException {
		
		if (_ouvertureMaximaleEnDegres > 0) {
			
			if (_ouvertDeEnDegres >= 0) {
				
				if (_ouvertDeEnDegres == 0 || !_estVerrouillee) { // Si n'est pas à la fois ouvert et verrouillé
					
					this.ouvertureMaximaleEnDegres = _ouvertureMaximaleEnDegres;
					this.ouvertDeEnDegres = 0;
					this.estVerrouillee = false;
				
				} else {
					
					throw new VerrouillageException("can't be open while locked");
					
				}
				
			} else {
				
				throw new ArithmeticException("negative argument");
			}
		
		} else {
			
			throw new ArithmeticException("zero or negative argument");
			
		}
				
	}
	
	
	public String toString() {
		
		return "ouvertureMaximaleEnDegres = " + this.ouvertureMaximaleEnDegres
				+ " ouvertDeEnDegres = " + this.ouvertDeEnDegres
				+ " estVerrouillee = " + this.estVerrouillee;
		
	}

	
	public Boolean ouvrir() {

		if (
				!this.estVerrouillee
				&& this.ouvertDeEnDegres < this.ouvertureMaximaleEnDegres
				) {

			this.ouvertDeEnDegres = this.ouvertureMaximaleEnDegres;

			return true;

		} else {

			return false;

		}

	}

	
	public Boolean ouvrir(double ouvertureEnDegres) {
		
		if(ouvertureEnDegres > 0) {
			
			if (
					!this.estVerrouillee
					&& ouvertureEnDegres <= this.ouvertureMaximaleEnDegres - this.ouvertDeEnDegres
					) {
	
				this.ouvertDeEnDegres += ouvertureEnDegres;
				return true;

			} else {

				return false;
				
			}
			
		} else {

			throw new ArithmeticException("zero or negative argument");
			
		}

	}


	public Boolean fermer() {

		if (
				!this.estVerrouillee
				&& this.ouvertDeEnDegres > 0
				) {

			this.ouvertDeEnDegres = 0;
			return true;

		} else {

			return false;

		}

	}
	
	
	public Boolean fermer(double fermetureEnDegres) {

		if (fermetureEnDegres > 0) {
			
			if (
					!this.estVerrouillee
					&& fermetureEnDegres <= this.ouvertDeEnDegres
					){
	
				this.ouvertDeEnDegres -= fermetureEnDegres;
				return true;
	
			} else {
	
				return false;
	
			}
		
		} else {
			
			throw new ArithmeticException("zero or negative argument");
			
		}
		
	}

	
	public Boolean verrouiller() {
		
		if (
				!this.estVerrouillee
				&& this.ouvertDeEnDegres == 0
				) {
			
			this.estVerrouillee = true;
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	
	public Boolean deverrouiller() {
		
		if (this.estVerrouillee) {
			
			this.estVerrouillee = false;
			return true;
			
		} else {
			
			return false;
			
		}
		
	}

}
