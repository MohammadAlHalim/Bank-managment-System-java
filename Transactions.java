package project;
import java.util.Random;
public abstract class Transactions  {
	protected Random transactionId;
	protected Account account; 
    protected double amount;
    protected Date transactionDate;
    protected Random random = new Random();
    
    public Transactions( Account account, double amount, Date transactionDate) {
        this.transactionId = random;
        this.account = account;
        if(amount<0) {
        	this.amount = amount*-1;
        }
        else {
        	this.amount = amount;
        }
        
        this.transactionDate = transactionDate;
    }
    


	public String getTransactionId() {
		return transactionId.toString();
	}


	public Account getAccount() {
		return account;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
    public abstract void Action();
    
}
