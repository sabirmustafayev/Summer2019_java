package Repl_it;

import java.util.Scanner;

public class replaceFirst_contain_numberofString_Hi {
	public static void main(String[] args) {
		/*
		 Print out the number of times that the string "hi" appears anywhere in the given string.
		 */
		Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    
	    int nHi = 0;
	    while(str.contains("hi")) {
	    	nHi+=1;
	    	str = str.replaceFirst("hi","");
	    }
	    
	    System.out.println(nHi);
	}

}
