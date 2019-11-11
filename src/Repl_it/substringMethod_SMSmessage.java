package Repl_it;

import java.util.Scanner;

public class substringMethod_SMSmessage {
	
	public static void main(String[] args) {
		
		/*
		 We have a message variable already declared and assigned value in this format
		 Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
		 
		 Variables are already declared: sender, phoneNumber, messageBody
		 
		 - by using String methods:
		 retrieve related information from SMSmessage string and assign to those 3 variables.
		 
		 -print each variable in separate line
		 */
		Scanner scan = new Scanner(System.in);
	    String message = scan.nextLine();
	    String sender;
	    String phoneNumber;
	    String messageBody;
	    
	    sender = message.substring(message.indexOf('<')+1, message.indexOf('>'));
	    System.out.println("Sender: "+sender);
	    
	    phoneNumber = message.substring(message.indexOf('[')+1, message.indexOf(']'));
	    System.out.println("Phone Number: "+phoneNumber);
	    
	    messageBody = message.substring(message.indexOf('{')+1,message.indexOf('}'));
	    System.out.println("Message body: "+messageBody);
	}

}
