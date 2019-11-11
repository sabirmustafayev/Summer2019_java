package day20_WarmUp;
import java.util.Scanner;

public class WarmUp2 {
	public static void main(String[] args) {
			
		/*
		  write a program that asks user to enter number 10 times:
		  		1.find the sum of those inputs
		  		2.find the maximum number and the minimum number
		 */
		Scanner scan = new Scanner(System.in);
		
		int sum=0;
		
		for (int i = 1; i <=10; i++) {
			System.out.println("Enter your "+i+". number");
			int inputNum= scan.nextInt();
			
			sum = sum+inputNum;
			
		}
		System.out.println(sum);
	}

}
