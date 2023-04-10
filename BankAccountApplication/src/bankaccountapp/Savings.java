package bankaccountapp;

public class Savings extends Account // This is going to extend the abstract class 'Account'
{	
	// List properties specific to a savings account
	
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	// Constructor to initialize savings account properties
	
	public Savings(String name, String SSN, double initDeposit) 
	{
		super(name,SSN,initDeposit); //invoking 'Account' class constructor using 'super' keyword
		
		accountNumber="2"+accountNumber; // Setting account number for Savings account
		
		// System.out.println("Account Number:"+this.accountNumber);
		// System.out.println("New savings account");
		
		setSafetyDepositBox();
		
		
	}
	
	
	@Override
	public void setRate() // We are defining the abstract method
	{
		rate=getBaseRate()-0.25;
	}
	
	private void setSafetyDepositBox() 
	{
		this.safetyDepositBoxID=(int)(Math.random() * Math.pow(10, 3)); // We are generating random ID	
		this.safetyDepositBoxKey=(int)(Math.random() * Math.pow(10, 4)); // We are generating random Key
	}
	
	
	// List any methods specific to savings account
	
	public void showInfo() 
	{
		System.out.println("Account Type: Savings");
		super.showInfo();
		
		System.out.println("Savings Account Features:"+"\n . Safety Deposit Box ID: "+this.safetyDepositBoxID+"\n . Safety Deposit Box Key: "+this.safetyDepositBoxKey);
		
	}

}
