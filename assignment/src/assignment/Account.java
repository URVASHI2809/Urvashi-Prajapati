package assignment;

enum TYPE{
	FD,SB;
}
public class Account {
	private static int accountCounter = 100000;
	
	private int accountNumber;
	private String openingDate;
	private TYPE type;
	private double balance;
	private int id;
	
	//constructor
	public Account(int id, String openingDate, double balance) {
		this.accountNumber = generateNewAccountNumber();
		this.openingDate = openingDate;
		Object TYPE;
		this.type = TYPE.SB;
		this.balance = balance;
		this.id = id;
	}
	private int generateNewAccountNumber() {
		return ++accountCounter;
	}
	public String getDetailsAsString() {
		String res = new String();
		res += "Account Number : " + accountNumber + ", ";
		res += "Customer ID : " + id + ", ";
		res += "Account Type : " + type + ", ";
		res += "Account Creation Date : " + openingDate + ", ";
		res += "Account Balance : " + balance + ".";
		
		return res;
	}
	
}