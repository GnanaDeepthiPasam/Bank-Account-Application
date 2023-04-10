package bankaccountapp;

public class Checking extends Account // This is going to extend the abstract class 'Account'
{
	// List properties specific to a checking account
	
	private int debitCardNumber;
	private int debitCardPIN;
	
	// Constructor to initialize checking account properties
	
	public Checking(String name, String SSN, double initDeposit) 
	{
		super(name, SSN, initDeposit); //invoking 'Account' class constructor using 'super' keyword
		
		accountNumber="1"+accountNumber; // Setting account number for Checking account
		
		// System.out.println("Account Number:"+this.accountNumber);
		// System.out.println("New checking account");
		
		setDebitCard(); 
		
	}
	
	
	@Override
	public void setRate() // We are defining the abstract method
	{
		rate=getBaseRate()*0.15; // We are setting the rate for Checking account
	}
	
	public void setDebitCard() 
	{
		this.debitCardNumber=(int)(Math.random() *Math.pow(10, 10)); // We are generating random number
		this.debitCardPIN=(int)(Math.random() * Math.pow(10,4)); // We are generating random pin
	}
	
	
	// List any methods specific to checking account
	
	public void showInfo() 
	{
		System.out.println("Account Type: Checking");
		super.showInfo();
		
		System.out.println("Checking Account Features:"+"\n . Debit Card Number: "+this.debitCardNumber+"\n . Debit Card PIN: "+this.debitCardPIN);
		
	}

}
