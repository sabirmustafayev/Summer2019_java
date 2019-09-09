package day15_Scanner_StringClasses;

import java.util.Scanner;

public class StringInput {
	
	/*
	 * next()==>can read the input only till the space. 
	           It can't read two words separated by a space.
	            Also, next() places the cursor in the same line after reading the input.
	            
	   nextLine()==> reads input including space between the words 
	   			(that is, it reads till the end of line \n 
	 * 
	 next() vs nextLine();  ==> returns String value
	 			nextLine: takes the entire inputs
	 			next: takes the first word,
	 */
	public static void main(String[] args) {
		
		Scanner  scan = new Scanner(System.in);
		System.out.println("Enter your first name");
			String firstname = scan.next();
			
		System.out.println("Enter your last name");
		String lastname = scan.next();
		
		System.out.println("first name is: "+firstname);
		System.out.println("last name is: "+lastname);
			
		System.out.println("Enter char value");
			char ch = scan.next().charAt(0);
			
			System.out.println(ch);
			System.out.println(lastname.charAt(6));
		
		
	}

}