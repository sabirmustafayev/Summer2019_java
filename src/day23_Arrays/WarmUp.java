package day23_Arrays;

import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {
		/*
		 1. write a program  that can devide two numbers without using division operator(a/b)
		 
		*/
		
		int x = 20;
		int y = 6;
		
		int count = 0;
		
		while(x>=y) {
			x-=y;
			count++;
		}
		System.out.println(count); //result after diving the two numbers
		System.out.println(20/6);
		System.out.println(x);//reminder
		
		//******************************************************************************
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int result = 0;
		
		if(num2!=0) {
		while(num1>=num2) {
			
			num1-=num2;
			result++;
		}
		System.out.println("devision is "+result+" with a reminder of "+num1);
		}else {
			System.out.println("Invalid Entry");
		}
	}
		

}
