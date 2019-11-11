package Repl_it;

import java.util.Scanner;

public class MergingCharactersofTwoWord {
	public static void main(String[] args) {
		
		/*
		 * You have 2 words, both of them have 3 characters.
			If either of them does not have exactly 3 characters, print "cannot merge"
			Merge their characters one by one and print together like below:
		 */
		 Scanner scan = new Scanner(System.in);
		    String word1 = scan.next();
		    String word2 = scan.next();
		    String mergedResult = "";
		    
		  if (word1.length()==3 && word2.length() == 3) {
			for (int i = 0; i < word1.length(); i++) {
				mergedResult+= ""+word1.charAt(i)+word2.charAt(i);
			}
			System.out.println(mergedResult);
		}
		  else
			  System.out.println("cannot merge");
		    
	}

}
