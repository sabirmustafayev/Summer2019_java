package day48_MethodOverRiding;

//*********************************
public class Bank {
	
	public void InterestRate() {
		System.out.println("9 percent");
		
	}
	
	public static void main(String[] args) {
		
		BankOfAmerica BOA = new BankOfAmerica();
				BOA.InterestRate(); // 9
				
		Chase CH = new Chase();
				CH.InterestRate(); // 9
				
		CapitalOne CO = new CapitalOne();
				CO.InterestRate();
				
	
		
		/*Bank obj = new Bank();
		obj.InterestRate();*/
	}

}

//*********************************
class BankOfAmerica extends Bank{
	public void InterestRate() {
		System.out.println("5%");
		
	}
	
}

//*********************************
class Chase extends Bank{
	public void InterestRate() {
		System.out.println("6%");
		
	}
}

//*********************************
class CapitalOne extends Bank {
	public void InterestRate() {
		System.out.println("7%");
		
	}
}
