package Repl_it;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a whole number:");
		int n = scan.nextInt();
	    
	    long factorial = 1;
	    
	    for (int i = n; i > 0 ; i--) {
			 factorial = factorial * i;
		}
	    System.out.println(factorial);
	}

}
