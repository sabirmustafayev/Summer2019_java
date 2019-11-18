package day27_CustomMethods;

import java.util.Scanner;

public class BreakTimeMethod {
	public static void main(String[] args) {
		System.out.println("D o you guys want to take a break? Yes or No");
		
		Scanner scan= new Scanner(System.in);
		
		String str = scan.next();
		
		if (str.equalsIgnoreCase("YES") ) {
			 BreakTime();
		}
		else if(str.equalsIgnoreCase("NO"))
			Continue();
	}
	
	//****************** Custome Methods *********************
	
	public static void BreakTime() {
		 System.out.println("Yeaaaaah, Break time )))");
		
	
	}
	
	public static void Continue() {
		
		System.out.println("I do not have a time to take a break...)))))");
		
	}

}
