package day25_ArraysContinue;

import java.util.Arrays;

public class ArraysMethods {
	public static void main(String[] args) {
		
		int num1 = 10;
		System.out.println(num1);
		
		int[] arr= {1,2,3};
		
		// by helping FOR LOOP, we print all array elements out
		for (int i = 0; i < arr.length; i++) { 
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
			
			/*
			 *to print entire array as whole, we need to convert the integer array to the String
			    Arrays.toString(VariableName); ==> it is used for converting single dimensional arrays to String value
			 */
			
		String str = Arrays.toString(arr);
		System.out.println(str);
		
		//***********************************************************************************
		
		String[] names = {"Elvira","Bibish","Tural","Daulet","Hakan"};
		
		String str1 = Arrays.toString(names);
		System.out.println(str1);
		
		//************************************************************************************
		/*
		 Arrays.sort(VariableName):
		 		sorts the values of the array in ascending order (smallest)
		 */
		
		int[] Numbers = {9,8,100,3000,4,5,6};
		
		System.out.println(Arrays.toString(Numbers)); // regular arrays for printing out
		
		Arrays.sort(Numbers); // SORTING
		
		System.out.println(Arrays.toString(Numbers)); // sorting arrays converted to string then printed out
		
		// after sorting we can find max and min value easily
		System.out.println("Maximum: " + Numbers[Numbers.length-1]);  // last index of sorted array is maximum number
		System.out.println("Minumum: " + Numbers[0]); // first index of sorted array is minumum number
		
		String[] NameList = {"Alma", "Enes", "Sabir","ALp", "Nezir","Samir","Sarah", "Bahar","ABC"};
		
		Arrays.sort(NameList); //Alphabetical order (from ASCII table)
		System.out.println(Arrays.toString(NameList)); // printing out String arrays with Alphbetical order
		
		char[] ch = {'0','9','8','5','3','2','1','b','d','a'};
		
		Arrays.sort(ch);
		
		System.out.println(Arrays.toString(ch));
		
		 int[] nums  = {2000, 90, 89, 78, 65, 5555, 444, -5};
         
         Arrays.sort( nums );
         System.out.println(Arrays.toString(nums));
         System.out.println("Minimum number: " + nums[0] );
         System.out.println("Maximum Number: "+ nums [ nums.length-1 ]);
         System.out.println("Second Maximum Number: " + nums [ nums.length-2 ]);
         System.out.println("Second Minimum Number: "+ nums[1]);
     
         	/*
			write aprogram that can print the arrays in Decsending order (largest to smallest)

         	*/
         int[]  MyNumbers = { 99,10,200, 3000, 40, 50, 5000};
         Arrays.sort(MyNumbers);
         // MyNumberw -> [10, 40, 50, 99, 200, 3000, 5000]
         //                0   1   2   3   4    5      	6
 
         System.out.println( Arrays.toString(MyNumbers) );

         String result ="[";
         for(int i = MyNumbers.length-1; i  >= 0; i--) {
     
        	 result += MyNumbers[i] +", " ;
     
         }	
         System.out.println();
         
         result = result.substring(0, result.length()-2)+"]"; 
         
         System.out.println(result);

         
         int[] arr2 = { 99,10,200, 3000, 40, 50, 5000};
         Arrays.sort(arr2);  //  array will be sorted in Acsending order
         //  arr2 -> [10, 40, 50, 99, 200, 3000, 5000]
         	//        0  1   2    3   4    5     6
 
 int[] Decedning = new int[arr2.length];
 /*
     Decedning[0] = arr2[6];
     Decedning[1] = arr2[5];
     Decedning[2] = arr2[4];
     Decedning[3] = arr2[3];
     Decedning[4] = arr2[2];
     Decedning[5] = arr2[1];
     Decedning[6] = arr2[0];
 */
 
 int z=0;
 for(int i = arr2.length-1; i >=0; i-- ) {
     Decedning[ z ] = arr2[i];
     z++;
 }
 
 System.out.println( "Acsending order: "+ Arrays.toString(arr2));

 System.out.println("Descedning order: "+Arrays.toString(Decedning));
         
         
         
         
         
 
		
		
	}

}
