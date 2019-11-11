package day26_ForEach;

public class ForEach_MultiD {
	public static void main(String[] args) {
      // n dimensional array contains multiple (n-1) dimensional arrays
        
        int[] arr1D = {1,2,3,4};
        for(int each: arr1D) {
            System.out.print(each+" ");
        }
        
        System.out.println();
        
        
        int[][] arr2D = {  { 1,2,3,4 }  , {5,6,7,8, 9}  };
                //            0              1
        
        for(int i = 0 ; i < arr2D.length; i++ ) {
                            // counts the 1D arrays
            for(int j=0;  j < arr2D[i].length ; j++ ) {
                System.out.print(arr2D[i][j] +" ");
            }   
        }
        
        System.out.println();
        
        
        for(int[] each1: arr2D) {
            for( int each2 :  each1) {
                System.out.print(each2+" ");
            }
            
        }
        
        
        
        
        
        
    }
}