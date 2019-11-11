package Repl_it;

import java.util.Scanner;

public class startsWith_endsWithMethods_WithoutX_x {
	public static void main(String[] args) {
		
		/*
		 Given a string word, if the first or last chars are 'x' or 'X', 
		 print the string without those 'x' or 'X' chars, 
		 otherwise print the string unchanged.
		 */
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	    
	    
	   if (word.startsWith("x") || word.startsWith("X")) {
	    		
	    		if (word.endsWith("x") || word.endsWith("X")) {
	    			System.out.println(word.substring(1,word.length()-1));
	    			}
	    		
	    		else if (!word.endsWith("x") || !word.endsWith("X")) {
	    			System.out.println(word.substring(1));
	    			}
		
	    }
	   
	    else if (word.endsWith("x") || word.endsWith("X")) {
	    	System.out.println(word.substring(0,word.length()-1));
			
		}
	    else
	    	System.out.println(word);
	    
	  

	   /* if ( word.startsWith("x") || word.startsWith("X") || word.endsWith("x") || word.endsWith("X") ){
	   word=word.replace("x","");
	   word=word.replace("X","");
	   System.out.println(word);
	   }else{
	   System.out.println(word);
	   }*/


	}

}


