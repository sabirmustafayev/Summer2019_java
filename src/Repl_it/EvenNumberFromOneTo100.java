package Repl_it;

public class EvenNumberFromOneTo100 {
	public static void main(String[] args) {
		/*
		 Write a program that will print out even numbers from 2 to 100 through the comma.
		 */
		
		for (int i = 1; i <= 100; i++) {
			if (i%2==0) {
				
				System.out.print(i+",");
			}
		}
	}

}
