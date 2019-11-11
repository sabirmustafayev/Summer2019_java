package Repl_it;

import java.util.Scanner;

public class Hours_Minutes_Seconds {
	public static void main(String[] args) {
		/*
			Write a program that outputs the number of hours, minutes, and seconds that
             corresponds to input total seconds. 

                -create a Scanner object
                - declare int variables inputSeconds, hours, minutes, seconds
                -Ask user enter seconds by printing:
                 "Enter seconds:" 
		 */
		Scanner scan = new Scanner(System.in);
	    int inputSeconds, hours, minutes, seconds;
	    
	    System.out.println("Enter seconds:");
	    
	    inputSeconds = scan.nextInt();
	    
	    hours = inputSeconds/3600;
	    minutes = (inputSeconds%3600)/60;
	    seconds = (inputSeconds%3600)%60;
	    
	    
	    System.out.println(hours+" "+"hours,"+" "+minutes+" "+"minutes,"
	                      +" "+"and"+" "+seconds+" "+"seconds");
	}

}
