package day33_ArrayList;


import java.util.Arrays;

public class WarmUp_Method_Array {
	
	public static void main(String[] args) {
		
		
		 // 1. write a return method that accepts an int array and sorts it in descending order
		 
		int[] arr = {25,56,9,3,45,12,100,6,94};
		 
		 arr = SortDesc(arr);
		System.out.println(Arrays.toString(arr));
		
		//2. write a return method that accepts a double array and sorts it in descending order
		
	    double[] arr2 = {10.5, 14.0, 11.2, 25.5, 25.0};
		 
		 arr2 = SortDesc(arr2);
		System.out.println(Arrays.toString(arr2));
		
		//3. write a return method that accepts a char array and sorts it in descending order
		 char[] ch = {'c','a', 'b', 'z', 'x', 'k'};
	        
         ch = SortDesc(ch);
         
         System.out.println(Arrays.toString(ch));
         
        //4. write a return method that accepts a String array and sorts it in descending order
         String[] names = {"Mikray", "Jin", "Minever", "Nurzat", "Viktoria", "Erhan" };
         
         names = SortDesc(names);
         
         System.out.println(Arrays.toString(names));
		
	}
	
	//*****************************CUSTOME METHODS******************************************
	
	//*********************************One**********************************************
	public static int[] SortDesc(int[] arr) {
		
		Arrays.sort(arr); // sorting as ascending order smal to bigger
		
		int[] arr2 = new int[arr.length];
		int j=0;
		
		for (int i = arr.length - 1; i >= 0; i--) {
			arr2[j] = arr[i];
			j++;
			
		}
		return arr2;
	}
	
	//*********************************Two**********************************************
	
	public static double[] SortDesc(double[] arr) {
		
		Arrays.sort(arr); // sorting as ascending order smal to bigger
		
		double[] arr2 = new double[arr.length]; // can contain all values of (arr) arrays
		
		int j=0;
		for (int i = arr.length - 1; i >= 0; i--) {
			arr2[j] = arr[i];
			j++;
			
		}
		return arr2;
	}
	
	//*********************************Three**********************************************
	
	 public static char[] SortDesc(char[] arr) {
	        Arrays.sort(arr);  // ascending order
	        char[] arr2 = new  char[arr.length];   // can contain all values of arr
	        int j=0;
	        
	        for(int i = arr.length-1;  i >= 0 ; i-- ) {
	                arr2[j] = arr[i];
	            //  arr2[arr.length-1-i] = arr[i];
	                    j++;
	        }
	        
	        return arr2;
	    }
	 
	//*********************************Four**********************************************
	 public static String[] SortDesc(String[] arr) {
	        Arrays.sort(arr);  // ascending order
	        String[] arr2 = new  String[arr.length];   // can contain all values of arr
	        int j=0;
	        
	        for(int i = arr.length-1;  i >= 0 ; i-- ) {
	                arr2[j] = arr[i];
	            //  arr2[arr.length-1-i] = arr[i];
	                    j++;
	        }
	        
	        return arr2;
	    }
	 
	 //*********************************Five**********************************************
	 public static Integer[] SortDe(Integer[] arr) {
	        Arrays.sort(arr);  // ascending order
	        Integer[] arr2 = new  Integer[arr.length];   // can contain all values of arr
	        int j=0;
	        
	        for(int i = arr.length-1;  i >= 0 ; i-- ) {
	                arr2[j] = arr[i];
	            //  arr2[arr.length-1-i] = arr[i];
	                    j++;
	        }
	        
	        return arr2;
	    }

}
