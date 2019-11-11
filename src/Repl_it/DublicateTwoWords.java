package Repl_it;

import java.util.Scanner;

public class DublicateTwoWords {
	public static void main(String[] args) {
		
		//********Print the first word, second word, second word, first word
		
		 Scanner scan = new Scanner(System.in);
		    String word1 = scan.next();
		    String word2 = scan.next();
		    
		 System.out.println(word1 + word2 + word2 + word1); 
	}

}
