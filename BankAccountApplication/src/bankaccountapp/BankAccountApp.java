package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp // It's like a 'Test' class
{

	public static void main(String[]args) 
	{ 
		System.out.println("Bank Account Application:\n");
		
		List<Account> accounts=new LinkedList<Account>(); // We are not creating any instance for the abstract class 'Account'
		
		String file="C:\\Users\\f8\\Desktop\\Campus Interviews\\Java Programming\\Java Projects\\Build a New Bank Account Application\\NewBankAccounts.csv";
		
		
		/*
		 
		Checking chkacc1=new Checking("Tom Wilson","123456789",1500); // 1500 indicates initial deposit
		
		chkacc1.showInfo();
		
		
		Savings savacc1=new Savings("Rich Lowe","987654321",2500);
		
		savacc1.showInfo();
		
		//	savacc1.deposit(5000);
		//	savacc1.withdraw(200);
		//	savacc1.transfer("Brokerage",3000);

		 */
		
		
		// Read a CSV file and create new accounts based on that data
		
		List<String[]> newAccountHolders=utilities.CSV.read(file);
		
		//	System.out.println(newAccountHolders);
		
		for(String[] accountHolder:newAccountHolders) // for-each loop
		{ 
			// System.out.println("New Account:");
			
			String name=accountHolder[0];
			String SSN=accountHolder[1];
			String accountType=accountHolder[2];
			double initDeposit=Double.parseDouble(accountHolder[3]); // By default it is acting as a 'string', so we are converting it to 'double'
			
			// System.out.println(name+" "+SSN+" "+accountType+" $"+initDeposit);
			
			if(accountType.equals("Checking"))
			{
				// System.out.println("Open a Checking account");
				
				accounts.add(new Checking(name,SSN,initDeposit)); // We are adding the Checking account details to the list 'accounts'
			}
			
			else if(accountType.equals("Savings"))
			{
				// System.out.println("Open a Savings account");
				
				accounts.add(new Savings(name,SSN,initDeposit)); // We are adding the Savings account details to the list 'accounts'
			}
			
			else
			{
				System.out.println("Error reading account");
			}
			
		}
		
		// accounts.get(0).showInfo(); // It will get the account information of the first customer who is present in the list 'accounts'
		
		for(Account acc:accounts)
		{
			acc.showInfo(); // It will display the account information of the all the customers
			
			System.out.println("");
			
		}
		
	}

}

// Note: If you want to make something available to child class but hidden still then we have to make them protected. So in our 'Checking' class
// and 'Savings' class, all that we used was 'accountNumber' and 'rate', everything else is defined and saves itself. So we want to make the
// 'accountNumber' and 'rate' as protected inside the class 'Account'. All the properties which we defined inside the following classes 'Checking'
// and 'Savings' will be made as 'private'. Similarly, all the remaining properties which we defined inside the class 'Account' are marked as 'private'