package sugunam;

public class Account {
	
	private int accountNumber;
	private String name;
	private String address;
	private long phone;
	private double balance;
	
public Account(int accountNumber, String name, String address, long phone, double balance){
		
		this.accountNumber=accountNumber;
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.balance=balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getName() {
		return name;
	}
	public String getAaddress() {
		return address;
	}
	public long getPhone() {
		return phone;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public void displayAccount() {
		System.out.println("AccountNumber: "+accountNumber);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Phone: "+phone);
		System.out.println("Balance: "+balance);	
	}
}
