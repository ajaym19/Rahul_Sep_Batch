package Abstraction;

public class HDFCBank implements RBIInterface {

	@Override
	public void depositMoney() {
		System.out.println("HDFC Bank Deposit Money");
		
	}

	@Override
	public void withdrawMoney() {
		System.out.println("HDFC Bank Withdraw Money");
		
	}

	
	public void giveInterestRate() {
		System.out.println("HDFC Bank: Interest Rate is 5%");
		
	}
	
	public void deliverMoneyAtHome() {
		
	}

	//it is the responsibility of the child class
	//to implement the methods in the interfaces
	
	
	

}
