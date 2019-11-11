package Repl_it;

import java.util.Scanner;

public class LengthOfString {
	public static void main(String[] args) {
		
		//*******Write a program that will output length of the text (string).*****
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the text:");
		String txt = scan.nextLine();
		
		System.out.println("Length is: "+txt.length());
	}

}
