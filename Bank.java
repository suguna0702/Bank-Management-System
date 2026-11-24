package sugunam;

import java.util.Scanner;

public class Bank {
	
	private Account account;
	
    Scanner sc= new Scanner(System.in);
	
	public void createAccount() {
		
		System.out.println("Enter Account Number: ");
		int accountNumber= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name: ");
		String name =sc.nextLine();
		
		System.out.println("Enter Address: ");
		String address=sc.nextLine();
		
		System.out.println("Enter Phone");
		long phone=sc.nextLong();
		
		System.out.println("Enter Initial Balance");
		double balance=sc.nextDouble();
		
		if (balance <0) {
			System.out.println("Invalid Balance");
			return;
		}
		
		account= new Account(accountNumber, name, address, phone, balance) ;
				
		System.out.println("Account created Successfully");
	}
	
	public void deposit() {
		
		if (account == null) {
			System.out.println("Create Account First");
			return;
		}
		
		System.out.println("Enter Deposit Amount: ");
		double amount=sc.nextDouble();
		
		if(amount >0) {
		
			account.setBalance(account.getBalance()+amount);
			
			System.out.println("Amount Deposited Successfully");
		}
		else {
			System.out.println("Invalid Amount");
		}
	}
	
	public void withdraw() {
		
		if (account == null) {
			
		System.out.println("Create Account First");
		return;
		}
		
		System.out.println("Enter withdraw Amount: ");
		double amount=sc.nextDouble();
		
		if (amount >0 && amount <= account.getBalance()) {
			account.setBalance(account.getBalance()-amount);
			
			System.out.println("Amount Withdraw Successfully");
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	
	public void balanceEnquiry() {
		
		if (account == null) {
			System.out.println("Create Account first");
			return;
		}
		
		System.out.println("Available Balance: "+ account.getBalance());
	}
	
	public void displayAll() {
		
		if (account == null) {
			System.out.println("No Account Found");
			return;
		}
		
		account.displayAccount();
	}
}



