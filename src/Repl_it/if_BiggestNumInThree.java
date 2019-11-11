package Repl_it;

import java.util.Scanner;

public class if_BiggestNumInThree {
	public static void main(String[] args) {
		
		//in this problem you need to write a program that checks for the bigger of 3 numbers.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if (num1 > num2 && num1 >num3) {
			System.out.println(num1+" is bigger");
		}
		else if (num2>num1 && num2>num3) {
			System.out.println(num2+" is bigger");
		}
		else
			System.out.println(num3+" is bigger");
	}

}
