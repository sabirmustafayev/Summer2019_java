package Repl_it;

import java.util.Scanner;

public class substringMethod_PrintHalfTwiceTheWord {
	public static void main(String[] args) {
		
		//Write a program that will print out first half of the word twice. 
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Type a word:");
		    String word = scan.next();
		  
		    
		    int halfOfWord = word.length()/2;
		    
		    String twiceword = "";
		    
		    for (int i = 0; i < halfOfWord; i++) {
				 twiceword+=word.substring(i,i+1);
			}
		    System.out.println(twiceword + twiceword);
		    
		    // second way to solve
		    /*
		     * System.out.println(word.substring(0, word.length() / 2) +
					word.substring(0, word.length() / 2) );
		     */
	}

}
