package day15_Scanner_StringClasses;

import java.util.Scanner;

public class Warm_Up {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number beetween"+ "\"0\""+" and"+ "\"9\"" );
		
		int num = s.nextInt();
		
		// coding with IF Statement*******************************************
		if (num==0) System.out.println("You entered zero");
		
		else if(num==1) System.out.println("You entered one");
		else if(num==2) System.out.println("You entered two");
		else if(num==3) System.out.println("You entered three");
		else if(num==4) System.out.println("You entered four");
		else if(num==5) System.out.println("You entered five");
		else if(num==6) System.out.println("You entered six");
		else if(num==7) System.out.println("You entered seven");
		else if(num==8) System.out.println("You entered eight");
		else if(num==9) System.out.println("You entered nine");
		
		else System.out.println("You entered invalid number");
		
		// coding with Ternary **********************************
		String result = (num == 9) ? "nine" :(num == 8) ? "eight"
				        :(num == 7) ? "seven" :(num == 6) ? "eight"
				        		:(num == 5) ? "nine" :(num == 4) ? "eight"
				        				:(num == 3) ? "nine" :(num == 2) ? "eight"
				        						:(num == 1) ? "nine" :(num == 0) ? "eight"
				        								: "Invalid";
		System.out.println(result);
		
		
		
		
	}

}
