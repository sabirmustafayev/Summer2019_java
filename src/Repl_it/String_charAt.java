package Repl_it;

import java.util.Scanner;

public class String_charAt {
	
	public static void main(String[] args) {
		
		/*
		 	using charAt method output the 5th letter of txt string then the 6th letter.
		 	use print not println.		 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String txt = scan.nextLine();
		
		System.out.println(txt.charAt(5)+" "+txt.charAt(6));
		
	}

}
