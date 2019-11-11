package Repl_it;

import java.util.Scanner;

public class if_CheckingOddEvenNumbers {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num1 = scan.nextInt();
		
		if (num1%2==0) {
			System.out.println(num1+" is even");
		}
		else
			System.out.println(num1+" is odd");
	}

}
