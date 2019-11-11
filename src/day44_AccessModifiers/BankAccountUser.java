package day44_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class BankAccountUser {
	public static void main(String[] args) {
		
		BankAccount Sabir = new BankAccount();
			Sabir.setAccountHolder("Sabir Mustafayev");
			Sabir.setAccountNumber(123456789654321L);
			Sabir.Deposit(50000.00);
		/*	
		System.out.println("Name: "+Sabir.getAccountHolder());
		System.out.println("Account Number: "+Sabir.getAccountNumber());
		System.out.println("Available Balance: "+Sabir.getAvailableBalance());
		*/
		 Sabir.getAccountInfo();
		 
		 Sabir.Deposit(20000);
		 Sabir.ShowBalance();
		 
		 Sabir.WithDraw(100000);
		 Sabir.ShowBalance();
		 
		 System.out.println("************************************************************");
		 
		 BankAccount Serkan = new BankAccount();
		 	Serkan.setAccountHolder("Serkan");
		 	Serkan.setAccountNumber(999999999999999L);
		 	
		 	Serkan.getAccountInfo();
		 	
		 	Serkan.Deposit(10000);
		 	Serkan.ShowBalance();// 10000
		 	Serkan.WithDraw(3000);
		 	
		 	Serkan.getAccountInfo();
		 	
		 System.out.println("************************************************************");
		 
		 BankAccount[] accounts = {Sabir, Serkan};
		 
		 ArrayList<BankAccount> Accounts = new ArrayList<>();
		 	//Accounts.add(Sabir);
		 	//Accounts.add(Serkan);
		 	
		 Accounts.addAll(Arrays.asList(Sabir, Serkan));
		 
		 
	}

}
