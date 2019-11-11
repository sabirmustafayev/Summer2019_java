package Repl_it;

import java.util.Scanner;

import day21_WhileLoop.WhileLoop;

public class equals_contain_replaceFirst_NumberOfJavaToPython {
	public static void main(String[] args) {
		/*
		 Given a string, print out true if the number of appearances of "java"
		 anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your sentence: ");
	    String sentence = scan.nextLine();
	    
	    int nJava = 0;
	    int nPython = 0;
	    
	    while(sentence.contains("java")) {
	    	nJava+=1;
		   	sentence = sentence.replaceFirst("java","");
			
	    }
	    	
	    while (sentence.contains("python")) {
	    	nPython+=1;
	    	sentence = sentence.replaceFirst("python","");
		}
	    	
	    
	    
	    System.out.println("python = "+nPython);
	    System.out.println("java = "+nJava);
	    
	    if (nPython == nJava) {
			System.out.println("true");
		}
	    else {
			System.out.println("false");
		}
	    
	    
	}

}
