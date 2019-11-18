package day31_JavaReview;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReview_FindingMaxMinNumbers {
	public static void main(String[] args) {
		//ask user to enter how many numbers to add and find the maximum and minimum numbers
				Scanner scan = new Scanner(System.in);
				
				System.out.println("How many numbers would you like to add?");
				
				int number = scan.nextInt();
				int[] arr = new int[number];
			
				for (int i = 0; i < number; i++) {
				    System.out.println("Enter a number: ");
				    arr[i] = scan.nextInt(); // user input
				}
				
				System.out.println(Arrays.toString(arr)); //rpint out the all values of given array
				
				Arrays.sort(arr); // given array is sorted in ascending order == minum to maximum
				System.out.println(Arrays.toString(arr)); //after sorint printing in ascenig order
				System.out.println("Minumum value: "+arr[0]); //after sorting in ascending order, first value is gonna be minumum value
				System.out.println("Maximum value: "+arr[arr.length-1]); // after sorting in ascending order, last index  is gonna be minumum value
	}

}
