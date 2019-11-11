package Repl_it;

import java.util.Scanner;

public class replaceFirst_contain_numberofString_java {
	public static void main(String[] args) {
		/*
		 Return the number of times that the string "java" appears anywhere in the given string word.
		 */
		 Scanner scan= new Scanner(System.in);
		    String word = scan.next();
		    
		    int nJava = 0;
		    while(word.contains("java")) {
		    	nJava+=1;
		    	word = word.replaceFirst("java","");
		    }
		    
		    System.out.println(nJava);
		    
	}

}
