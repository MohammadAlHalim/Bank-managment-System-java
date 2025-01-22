package project;
import java.util.Random;
public class Deposit extends Transactions {

	public Deposit( Account account, double amount, Date transactionDate) {
		super( account, amount, transactionDate);
		
	}
	public void Action () {
		account.setBalance(account.getBalance()+amount);
		System.out.println("Transaction ID:"+getTransactionId());
		System.out.println("New balance ="+account.getBalance());
		transactionDate.standardDateEquivalent();
		 
	}
	@Override
	public String getTransactionId() {
		// TODO Auto-generated method stub
		return super.getTransactionId();
	}
	
	@Override
	public void setAmount(double amount) {
		// TODO Auto-generated method stub
		super.setAmount(amount);
	}
	@Override
	public void setTransactionDate(Date transactionDate) {
		// TODO Auto-generated method stub
		super.setTransactionDate(transactionDate);
	}
	@Override
	public String toString() {
		return "Deposit [transactionId=" + getTransactionId() + ", account=" + account + ", amount=" + amount
				+ ", transactionDate=" + transactionDate + "]";
	}
	
}
