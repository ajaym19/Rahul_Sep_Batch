package Abstraction;

public class Application {

	public static void main(String[] args) {
		// can I create object of Interface?
		// nikhil, Diana, Deb,

		HDFCBank bank = new HDFCBank();
		bank.depositMoney();
		bank.giveInterestRate();
		
	//	RBIInterface obj = new RBIInterface();
		
		ICICIBank iciciBank  = new ICICIBank();
		iciciBank.giveInterestRate();
		
		
		/*
		 * I want to TAKE screenshot and use power button
		 * 1. Parent class: power
		 * 2. Interface: screenshot
		 * 
		 * 2 Boxes to Deb
		 * Box1 : Apple: Interface
		 * label on the box: contains Apple
		 * i applied label on each item
		 * 
		 * Box 2: Apple and Mango: Abstract Class
		 * label on the box: contains Apple and Mango
		 * 
		 * if I apply label on each item
		 * 
		 * 
		 * Percetange of abstraction achieved:
		 * Abstract class: 0 to 100
		 * Interface: 100
		 * 
		 */
	}
}
