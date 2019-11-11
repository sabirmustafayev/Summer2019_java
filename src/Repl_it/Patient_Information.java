package Repl_it;

import java.util.Scanner;



public class Patient_Information {
	public static void main(String[] args) {
		/*
		 Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.
		 Declare 2 int variables: age, zipcode
         Declare 2 double variables: height, weight.
         Declare boolean variable: isMarried (for marriage status).
         Declare 2 long variables: workPhoneNumber and personalPhoneNumber.

         -Create a Scanner object named scan.
         
         -build contacts variable by concatenating work phone, personal phone and email
         -build fullName variable by concatenating first name and last name
         -build address variable by concatenating street, city, state, zip code
		 */
		
		String firstName, lastName, fullName, email, street, state, city, address, contacts;
		int age, zipcode;
		double height, weight;
		boolean isMarried;
		long workPhoneNumber, personalPhoneNumber;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the patient portal!");
		System.out.println("Please enter your personal information");
		
		System.out.println("Enter your first name");
		firstName = scan.next();
		
		System.out.println("Enter your last name");
		lastName = scan.next();
		
		System.out.println("Enter your email");
		email = scan.next();
		
		scan.nextLine();
		System.out.println("Enter your street");
		street = scan.nextLine();
		
		System.out.println("Enter your city");
		city = scan.next();
		
		System.out.println("Enter your state");
		state = scan.next();
		
		System.out.println("Enter your zip code");
		zipcode = scan.nextInt();
		
		System.out.println("Enter your work phone number");
		workPhoneNumber = scan.nextLong();
		
		System.out.println("Enter your personal phone number");
		personalPhoneNumber = scan.nextLong();
		
		System.out.println("Enter your age");
		age = scan.nextInt();
		
		System.out.println("Enter your height");
		height = scan.nextDouble();
		
		System.out.println("Enter your weight");
		weight = scan.nextDouble();
		
		System.out.println("Are you married?");
		isMarried =scan.nextBoolean();
		
		
		//**********************************************Concatenating*************************************************
		contacts = contacts = ("Contacts: work phone number - "+workPhoneNumber +", personal phone number - "+ personalPhoneNumber+", email: "+ email);
		fullName = lastName+", "+firstName;
		address = street+", "+city+", "+state+" "+zipcode;
		//************************************************************************************************************
		
		
		
		
		System.out.println("Patient personal information");
		System.out.println("Full name: "+fullName);
		System.out.println("Address: "+address);
		System.out.println(contacts);
		System.out.println("Age: "+age);
		System.out.println("Height: "+height);
		System.out.println("Weight: "+weight+" pounds");
		System.out.println("Married?: "+isMarried);
		
  }
}