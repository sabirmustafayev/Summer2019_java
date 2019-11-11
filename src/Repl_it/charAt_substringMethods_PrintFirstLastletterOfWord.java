package Repl_it;

import java.util.Scanner;

public class charAt_substringMethods_PrintFirstLastletterOfWord {
	public static void main(String[] args) {
		
		//*******Write a program that will print out first and last letters together.

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		
		//charAt(indexNumber)
		System.out.println(""+word.charAt(0) + word.charAt(word.length()-1));
		
		//substring(begIndex,endIndex)
		System.out.println(word.substring(0,1) + word.substring(word.length()-1));
	}

}
