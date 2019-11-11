package Repl_it;

import java.util.Scanner;

public class charAt_and_substringMethods_FindLastCharOfWord {
	public static void main(String[] args) {
		
		//****Write a program that will print out last letter of the word (string).
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		
		System.out.println(word.length());
		
		//finding last charachet of word(string) by CharAt(indexNumber)
		System.out.println(word.charAt(word.length()-1));
		
		//finding last charachet of word(string) by substring(beginIndex)
		
		System.out.println(word.substring(word.length()-1));
		
	}

}
