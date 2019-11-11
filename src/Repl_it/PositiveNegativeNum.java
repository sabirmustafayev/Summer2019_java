package Repl_it;

import java.util.Scanner;

import day10_Review.Else_If;

public class PositiveNegativeNum {
	public static void main(String[] args) {
		
		/*
		 U have an Integer number already declared and assigned value.
         Using Multi-Branch if statements, check if number is positive, negative or zero.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scan.nextInt();
		
		if (number > 0) {
			System.out.println(number+" is positive");
		}
		else if(number < 0) {
			System.out.println(number+" is negative");
		}
		else
			System.out.println("it is zero");
		
	}

}
