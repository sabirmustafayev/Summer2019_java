package Repl_it;

import java.util.Scanner;

public class if_FindMidNumber {
	public static void main(String[] args) {
		
		/*
		 * Write a program that will return mid number out of three numbers.  No need to do any calculations.
		 * Create an object of Scanner class.
		 * Declare int 3 variables: num1, num2, num3.
		 */
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int num1 = scan.nextInt();
		
		System.out.println("Enter second number:");
		int num2 = scan.nextInt();
		
		System.out.println("Enter third number:");
		int num3 = scan.nextInt();
		
		if (num1 > num2 && num1 < num3 || num1 > num3 && num1 < num2) {
			System.out.println("Medium value is: "+num1);
		}
		else if (num3 > num1 && num2 > num3 || num3 < num1 && num3 > num2) {
			System.out.println("Medium value is: "+num3);
		}
		else
			System.out.println("Medium value is: "+num2);
		
	}

}
