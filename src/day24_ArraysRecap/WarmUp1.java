package day24_ArraysRecap;

import java.util.Scanner;

public class WarmUp1 {
	public static void main(String[] args) {
		
		/*
		 write a program that find max value of the array
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of Array");
		
		int i = scan.nextInt();
		int[] arr = new int[i];
		
		System.out.println("So you should enter "+i+" values into the existing array");
		
		//****Entering the values of the array**************
		for (int j = 0; j < arr.length; j++) {
			System.out.println("Enter next number");
			arr[j]=scan.nextInt();			
		}
		
		//*******Printing the whole Arrays***************
		 for(int k=0; k <arr.length; k++) {
             System.out.println( arr[k] +" ");
         }
		 //*****Finding the max element of arry**************
		 int max = arr[0];
		 for (int d = 1; d < arr.length; d++) {
			if (arr[d]>max) {
				max = arr[d];
			}
			
		}
		 
		 //****Printing the maximum  value of the array*************
		 System.out.println("Maximum number is "+max);
		 
		
	}

}
