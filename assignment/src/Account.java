package assignment;

public class Account {
	private String openingDate;
	private TYPE type;
	private double balance;
	private Object accountNumber;
	private Customer customer;
	


	public int getAccountNumber() {
		return accountNumber;
	}
	
	public Account(String openingDate, TYPE type, double balance, Customer customer) {
		super();
		this.openingDate = openingDate;
		this.type = type;
		this.balance = balance;
		this.customer = customer;
		this.accountNumber = getAccountNumber();	
	}
	
	@Override
	public String toString() {
		String accountInfo = String.format(null, null); 
		return accountInfo;
	}
}
