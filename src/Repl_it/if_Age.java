package Repl_it;

import java.util.Scanner;

public class if_Age {
	
	public static void main(String[] args) {
		
		/*
		 Given an int variable age, write an if statement that prints out, on a line by itself,
		  the appropriate label from the above list based on age.

		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = scan.nextInt();
		
		if (age < 2) {
			System.out.println("ineligible");
		}
		else if (age == 2) {
			System.out.println("toddler");
		}
		else if (3<=age && age <=5) {
			System.out.println("early childhood");
		}
		else if (6<=age && age <=7) {
			System.out.println("young reader");
		}
		else if (8<=age && age <=10) {
			System.out.println("elementary");
		}
		else if (11<=age && age <=12) {
			System.out.println("middle");
		}
		else if (age == 13) {
			System.out.println("impossible");
		}
		else if (14 <= age && age <=16) {
			System.out.println("high school");
		}
		else if (17<=age && age <=18) {
			System.out.println("scholar");
		}
		else if (age > 18) {
			System.out.println("ineligible");
		}
		
	}
}
