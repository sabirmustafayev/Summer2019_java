package Repl_it;

import java.util.Scanner;

public class if_VehicleRecall {
	public static void main(String[] args) {
		
		/*
		 In this assignment you will write a program that will find vehicle for recall. 
		 -Display prompt: "Enter vehicle's year:"
		 if the value of modelYear does fall within the four recall ranges, display output:
         "Your vehicle needs to be recalled!"
         
         Otherwise, display message:
         "Your vehicle is fine, enjoy!"

		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter vehicle's year:");
		int vehicleYear = scan.nextInt();
		
		if (1995<=vehicleYear && vehicleYear<=1998 || 2001 <=vehicleYear && vehicleYear <=2002
				|| 2004 <=vehicleYear && vehicleYear <=2006 || 2015 <=vehicleYear && vehicleYear <=2017) {
			System.out.println("Your vehicle needs to be recalled!");
		}
		else
			System.out.println("Your vehicle is fine, enjoy!");
	}

}
