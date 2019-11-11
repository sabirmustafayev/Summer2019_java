package Repl_it;
import java.util.Scanner;

public class String_lenght {
	public static void main(String[] args) {
		
		/*
		  	ask the user for his name, capture it on a string using scanner.
		  	then output the length of the name string.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = scan.nextLine();
		
		System.out.println(name.length());
		
	}

}
