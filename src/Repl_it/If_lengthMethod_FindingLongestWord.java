package Repl_it;

import java.util.Scanner;

public class If_lengthMethod_FindingLongestWord {
	public static void main(String[] args) {
		
		//******Write a program that will print out the longest word.
		
		Scanner scan = new Scanner(System.in);
		String word1 = scan.next();
		String word2 = scan.next();
		
		if (word1.length() > word2.length()) {
			System.out.println("Longest word is "+word1);
		}
		else {
			System.out.println("Longest word is "+word2);
		}
		
		
	}

}
