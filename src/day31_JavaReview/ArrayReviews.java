package day31_JavaReview;

import java.util.Arrays;

public class ArrayReviews {
	public static void main(String[] args) {
		/*
		 * Array: store multiple data to a variable
		 */
		
		int num1 = 10;
		
		//declaration of array
		int[] arr = {10}; // array has size 1 and value is 10
		//                                index:           0
		
 		//initializing the array's size
		int[] arr2 = new int[2]; // [0,0] maximum capacity of the array is 2
		
		System.out.println(arr2[0]); // 0
		System.out.println(arr2[1]); // 0
		//System.out.println(arr2[2]); // there no index 2 in the array
		
		String[] cars = new String[5]; // this array can contain 5 string values
		   //{Tesla, Audi, Toyota, Jeep, Subaru}
		
			cars[4] = "Subaru";
			cars[2] = "Toyota";
			cars[1] = "Audi";
			cars[3] = "Jeep";
			cars[0] = "Tesla";
			
			//printint the all values of array (arr2[indexNumber])
			for (int i = 0; i < cars.length; i++) {
				System.out.print(cars[i]+" ");
			}
			System.out.println();
			
			// reinitializing the array (cars) size again, so it means that
			//cars array lost its all previous values and add 5 more size into it
			cars = new String[10];
			
			cars[5] = "Ford";
			
			for (int i = 0; i < cars.length; i++) {
				System.out.print(cars[i]+" ");
			}
			System.out.println();
			
			             //    True         False                      
			boolean[] bool = { 10 > 9, "Mikray".equals("Seyfo"),};
			
			boolean b1 = bool[0]; // bool array's zero index is 10>9, so it means that 10 greate than 9 so bollean value is true
			System.out.println(b1);
			
			//Array.toString(arrayVariable) : converts array to string, and returns string value
			System.out.println(bool); //hashcode such as [Z@24d46ca6
			
			String str = Arrays.toString(bool);
			System.out.println(str); // treu false
			
			//Arrays.sort(): sorts the array in ascending order
			
			double[] dArray = {1000,900,800,700,600};
			System.out.println(Arrays.toString(dArray));
			
			Arrays.sort(dArray); // {600,700,800,900,100}
			System.out.println(Arrays.toString(dArray));
			
			System.out.println("************** REVERSING THE ARRAY**************************************");
			
			//*** REVERSING THE ARRAY**************************************************
			int[] numbers = {200,300,20,7890,40,-9,-100};
			
			//print each values of the given array in ascending order: Array.sort(array name)
			
			Arrays.parallelSort(numbers);; // sorting in ascending order
			
			System.out.println(Arrays.toString(numbers)); // printing in ascending order
			
			// reversing the sorting array
			
			String result = "";
			for (int i =  numbers.length-1; i >=0; i--) {
				result += numbers[i] + ", ";
			}
			
			//result= result.trim(); // trim() method removes unsed space
			
			 // result =  result.replace("-100,", "-100");
	        result = result.substring(0, result.lastIndexOf(",") ); //if we use substring() method
	        //so we do not need trim() method to remove last unsed space from arrays
	        System.out.println(result);
	}

}
