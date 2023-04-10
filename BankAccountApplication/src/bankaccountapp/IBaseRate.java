package bankaccountapp;

public interface IBaseRate // Interface
{
	// Write a method that returns the base rate
	
	default double getBaseRate() // 'default' keyword allows the interface to provide a default implementation of the method without 
	                                    // the need for implementing those methods in the classes that uses the interface.
	{
		return 2.5; // This is the bench mark rate
	}

}

// Imagine that the interest rate is sitting somewhere else outside of our project and we (who are the backend-developers) are not going to be able
// to decide the interest rate, we have to go and fetch that from somewhere else and so you can get that through an API or get that from a database.
// We are going to set our application to where some other developer may be connected to Federal Reserve or some other where our bank is set up and 
// they are going to set the interest rate
