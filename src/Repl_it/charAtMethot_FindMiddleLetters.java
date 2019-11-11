package Repl_it;

import java.util.Scanner;

public class charAtMethot_FindMiddleLetters {
	public static void main(String[] args) {
		
		/* Write a program that finds the middle leeter of the word
		 
		 * 1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
            - Single character, print that character 3 times
            
           2. When word has even number of characters and:
           - 4 or more characters, print middle 2
           - 2 characters, print those 2 characters twice
		 */
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		
		if ( word.length()%2 == 0 && word.length()!=2) {
			System.out.println(""+word.charAt(word.length()/2-1) + word.charAt(word.length()/2));
		}
		else if(word.length()%2 != 0 && word.length() !=1)
			System.out.println(word.charAt(word.length()/2));
		else if (word.length()==2)
			System.out.println(word + word);
		else 
			System.out.println(word + word + word);
		
		
	}

}
