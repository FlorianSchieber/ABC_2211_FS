package moyenne;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		//DECLARATION VARIABLES
		
		int number1;
		int number2;
		double mean;
		
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
		
		System.out.println("Two number's mean computing program");
		
		System.out.print("Please enter a first number : ");
		number1 = sc.nextInt();
		
		System.out.print("Please enter a second number : ");
		number2 = sc.nextInt();
		
		mean = (double) (number1 + number2) / 2;
		
		System.out.println("The mean of " + number1 + " and " + number2 + " is " + mean);
		
		sc.close();
		
		// FIN PROGRAMME
		
	}

}
