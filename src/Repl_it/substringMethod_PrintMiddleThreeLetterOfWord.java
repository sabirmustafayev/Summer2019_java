package Repl_it;

import java.util.Scanner;

public class substringMethod_PrintMiddleThreeLetterOfWord {
	public static void main(String[] args) {
		
		/*
		 * If the word has odd number of characters
		   and has 5 or more characters, print the middle three 
		   characters of the word.
		 */
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String middleThree = "";
	    int halfofindex = word.length()/2;
	    	    
	    if (word.length()%2 !=0 && word.length() >= 5) {
			
				middleThree +=""+word.substring(halfofindex-1,halfofindex) + 
						word.substring(halfofindex,halfofindex+1) + word.substring(halfofindex+1,halfofindex+2);
			System.out.println(middleThree);
			
			//other way and easy way
			//System.out.println(word.substring(length / 2 - 1, length / 2 + 2));
		}
	    else
	    	System.out.println("invalid");
	}

}
