package day38_CustomClassContinue;

public class BankAccount {
	
	/*
	 WarmUp:
    create a custom class for BankAccount
    attributes/data that can have are: 
                    1. AccountHolder, 2. AccountNumber, 3. Balance
        Actions: deposit, withdraw, showBalance
        requiremnts: 
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                    2.1 if the withdrawing account is greater than available balance, 35$ charge will be added
                    2.2 if the balance is less than 0, user should not be able to withdraw money
            3. user should be able to see their balance
	 */
	
	// instance variables 
	String AccountHolder; 
	long AccountNumber;
	double Balance;
	
	//constructor without parameter
	public BankAccount(){
	
	}
	
	
	// constructor with parameters
	public BankAccount(String AccountHolder, long AccountNamber ) {
		this.AccountHolder = AccountHolder;
		this.AccountNumber = AccountNumber;
	}
	
	// instance methods
	public void ShowBalance() {
		System.out.println("----------------------------------------");
		String acct = ""+AccountNumber;
		String xx = "************";
		//String AccountNumber = "************"+ acct.substring(12);
		System.out.println("Account Holder: "+ AccountHolder);
		System.out.println("Account Number: "+ AccountNumber);
		System.out.println("Available Balance: $"+ Balance);
		System.out.println("----------------------------------------");
	}
	
	public void Deposit(double amount) {
		System.out.println("----------------------------------------");
		String acct = ""+AccountNumber;
       // String AccountNumber = "************"+acct.substring(12);
        System.out.println("Depositing $"+amount +" to the account "+AccountNumber);
        Balance += amount; 
        System.out.println("New Balance: $ "+ Balance);
		System.out.println("----------------------------------------");
	}
	
	public void WithDraw(double amount) {
		System.out.println("----------------------------------------");
		
		if (Balance <= 0) {
			System.out.println("There is no available balance");
			return; // exit the method WithDraw()
		}
		String acct = ""+AccountNumber;
        String AccountNumber = "************"+acct.substring(12);
        System.out.println("Withdrawing $"+amount +" to the account "+AccountNumber);
        Balance -= amount; 
        System.out.println("New Balance: $ "+ Balance);
        
        if (Balance < 0) {
			Balance-=35;
		}
        System.out.println("New Balance: $" + Balance);
		System.out.println("----------------------------------------");
	}
	
	public void accountSetup(String name, long acctNum) {
		AccountHolder = name;
		AccountNumber = acctNum;
		
	}

}
