package Repl_it;

import java.util.Scanner;

public class substringMethod_Email {
	public static void main(String[] args) {
		
		/*
		 Write a program that will print out information about user based on email.
		 Print first and last name from the upper case.
		 */
		 Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		 String firstName = email.substring(0,email.indexOf('_') );
		 firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
		 System.out.println("First name: "+firstName);
		 
		 String lastName = email.substring(email.indexOf('_')+1, email.indexOf('@'));
		 lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
		 System.out.println("Last name: "+lastName);
		 
		 String domain = email.substring(email.indexOf('@')+1, email.indexOf('.'));
		 System.out.println("Domain: "+domain);
		 
		 String topLevelDomain = email.substring(email.indexOf('.')+1);
		 System.out.println("Top-Level Domain: "+topLevelDomain);
		 
		 
		    
	}

}
