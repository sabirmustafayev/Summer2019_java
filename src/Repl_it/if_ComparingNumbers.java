package Repl_it;

import java.util.Scanner;

public class if_ComparingNumbers {
	public static void main(String[] args) {
		
		/*
		 U have 2 numbers already declared and assigned values.
         Using Multi-Branch if statements, check if num1 and num2 are equal, or not. 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if (num1>num2) {
			System.out.println(num1+" is greater than "+num2);
		}
		else if (num2>num1) {
			System.out.println(num2+" is greater than "+num1);
		}
		else
			System.out.println(num1+" and "+num2+" are equal");
	}

}
