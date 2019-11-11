package Repl_it;

import java.util.Scanner;

public class PrintLetters {
	public static void main(String[] args) {
		
		/*
		 Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.
		 */
		
		Scanner scan = new Scanner(System.in);
		 char start = scan.next().charAt(0);
		 char end = scan.next().charAt(0);
		 
		 
		 
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String result = "";
		
		
		
		
		int Ninput1 =alphabet.indexOf(start);
		int Ninput2 =alphabet.indexOf(end);
		
		String start2 = alphabet.substring(Ninput1,Ninput1+1);
		String end2 = alphabet.substring(Ninput2,Ninput2+1);
		
		//System.out.println(Ninput1+" , "+Ninput2);
		//System.out.println(alphabet);
		
		result = alphabet.substring(Ninput1,Ninput2+1);
		
		if(start2.equals(start))
		{
			
		}
		
		System.out.println(result.toUpperCase());
		
		
	}

}
