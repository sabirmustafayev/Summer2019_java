package Repl_it;

import java.util.Scanner;

public class charAt_and_substringMethods_FindFirstCharOfWord {
	public static void main(String[] args) {
		
		//*******Write a program that will print out first character of the word. 
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		
		// 2 ways to print out the first character of the word
		System.out.println(word.charAt(0)); // way 1
		System.out.println(word.substring(0,1)); // way 2
		
	}

}
