package sugunam;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
						
	Scanner sc=new Scanner(System.in);
	
	Bank bank =new Bank();
	int choice;
	
	do {
		System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
		System.out.println("1. Create Account");
		System.out.println("2. Deposite");
		System.out.println("3. Withdraw");
		System.out.println("4. Balance Enquiry");
		System.out.println("5. Display All");
		System.out.println("6. Exit");
		System.out.println("Enter your choice");
		
		choice =sc.nextInt();
		
		switch(choice) {
		
		case 1: 
			bank.createAccount();
			break;
			
		case 2:
			bank.deposit();
			break;
			
		case 3:
			bank.withdraw();
			break;
			
		case 4:
			bank.balanceEnquiry();
			break;
			
		case 5:
			bank.displayAll();
			break;
			
		case 6:
            System.out.println("Thank You");
            break;
           
            default:
            System.out.println("Invalid choice");
		}	
	}
	while (choice !=6);
	 
	sc.close();
}
}
					
	