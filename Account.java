package project;

public class Account 
{
	private int id;
	private double balance;
	private CustomerID customerID;
	
	public Account(int id, double balance, CustomerID customerID) 
	{
		this.id = id;
		this.balance = balance;
		this.customerID = customerID;
	}
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public double getBalance() 
	{
		return balance;
	}
	
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}

	public CustomerID getCustomerID() 
	{
		return customerID;
	}

	public void setCustomerID(CustomerID customerID) 
	{
		this.customerID = customerID;
	}
	
	

}
