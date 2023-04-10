package bankaccountapp;

public abstract class Account implements IBaseRate // This class acts as a parent class for 'Checking' and 'Savings' class and is going to implement the interface 'IBaseRate'
{
	// List common properties for checking and savings account
	
	private String name;
	private String SSN;
	private static int index=1000; // Unique 5 digit number - default
	private double balance;
	
	protected String accountNumber;
	protected double rate;
	
	
	// Constructor to set base properties and initialize the account
	
	public Account(String name, String SSN, double initDeposit) 
	{
		this.name=name;
		this.SSN=SSN;
		this.balance=initDeposit;
		
		// System.out.println("Name:"+this.name);
		// System.out.println("SSN:"+this.SSN);
		// System.out.println("Initial Deposit:"+this.initDeposit);
		
		// Set account number
		index++;
		this.accountNumber=setAccountNumber();
		
		// System.out.println(getBaseRate());
		
		setRate(); // We are calling the abstract method
	}
	
	
	public abstract void setRate(); // abstract method
	
	
	private String setAccountNumber() 
	{
		String lastTwoOfSSN=SSN.substring(SSN.length()-2,SSN.length());
		int uniqueID=index;
		int randomNumber=(int)(Math.random() * Math.pow(10, 3)); // It will generate 3 digit random number
		
		return lastTwoOfSSN+uniqueID+randomNumber;
	}
	
	
	// Implement the compound interest method
	
	public void compound() 
	{
		double accruedInterest=balance*(rate/100);
		
		balance=balance+accruedInterest
				;
		System.out.println("Accrued Interest ($): "+accruedInterest);
		
		printBalance();
	}
	
	
	// List common methods
	
	public void deposit(double amount) // deposit
	{
		balance=balance+amount;
		System.out.println("Depositing ($): "+amount);
		
		// printBalance(); // We are calling the function 'printBalance()'
	}
	
	
	public void withdraw(double amount) // withdraw
	{
		balance=balance-amount;
		System.out.println("Withdrawing ($): "+amount);
		
		// printBalance(); // We are calling the function 'printBalance()'
	}
	
	
	public void transfer(String towhere,double amount) // transfer
	{
		balance=balance-amount;
		System.out.println("Transfering $"+amount+" to "+towhere);
		
		printBalance(); // We are calling the function 'printBalance()'
	}
	
	
	public void printBalance() 
	{
	   System.out.println("Net Balance ($): "+balance);	
	}
	
	
	public void showInfo() // showInfo
	{
		System.out.println("Name: "+this.name+"\nAccount Number: "+this.accountNumber+"\nInitial Deposit: "+this.balance+"\nRate: "+rate+"%");
	}

}

// Note: We can also create a constructor inside an abstract class
