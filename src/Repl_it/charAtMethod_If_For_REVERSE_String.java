package Repl_it;

import java.util.Scanner;

public class charAtMethod_If_For_REVERSE_String {
	public static void main(String[] args) {
		
		/*
		 Write a program that will reverse a string. Your program should reverse a string only 5 characters long. 
		 If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!". 
		 Otherwise, reverse this word and print out result into the console. 
		 */
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String reversed = "";
		
		if (word.length() ==5) {
			for (int i = word.length()-1; i >=0; i--) {
				
				reversed += word.charAt(i);
			}
			System.out.println(reversed);
			
		}
		else if (word.length() < 5) {
			System.out.println("Too short!");
		}
		else
			System.out.println("Too long!");
	}

}
