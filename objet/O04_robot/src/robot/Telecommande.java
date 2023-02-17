package robot;

public class Telecommande {
	
	private Robot robot;
	
	public Telecommande(Robot _robot) {
		
		this.robot = _robot;
		
	}
	
	public boolean boutonTournerAGauche(double deltaAngleEnDegres) {
		
		return this.robot.tournerAGauche(deltaAngleEnDegres);
		
	}
	
	public boolean boutonTournerADroite(double deltaAngleEnDegres) {
		
		return this.robot.tournerADroite(deltaAngleEnDegres);
		
	}
	
	public boolean boutonAvancer(double distance) {
		
		return this.robot.avancer(distance);
		
	}

	public boolean boutonReculer(double distance) {
		
		return this.robot.reculer(distance);
		
	}
	
}
