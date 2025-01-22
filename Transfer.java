package project;

import java.util.Random;

public class Transfer extends Transactions {
	private Account account2;
	public Transfer( Account account,Account account2, double amount, Date transactionDate) {
		super( account, amount, transactionDate);
		this.account2= account2;
	}


	@Override
	public void Action() {
		double transfer= account.getBalance();
		account2.setBalance(account2.getBalance()+transfer);
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
		return "Transfer [account2=" + account2 + ", transactionId=" + getTransactionId() + ", account=" + account
				+ ", amount=" + amount + ", transactionDate=" + transactionDate + ", getTransactionId()="
				+ getTransactionId() + "]";
	}
	
}
