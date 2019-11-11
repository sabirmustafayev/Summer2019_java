package Repl_it;

import java.util.Scanner;

public class containMethod {
	public static void main(String[] args) {
		
		/*
		 Write a program that will verify if word contains in the sentence. 
		 Print out the result as boolean value. 
		 */
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		String sentence = scan.nextLine();
		
		
		if (sentence.contains(word)) {
			//print out as boolean value
			System.out.println(true);
		}
		else
			//print out as boolean value
			System.out.println(false);
		
	}

}
