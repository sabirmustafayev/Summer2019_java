package day24_ArraysRecap;

public class CombiningArrays {
	public static void main(String[] args) {
		 // combine two arrays:
        int[] array1 = { 1,2, 3 ,9 }; 
        int[] array2 = { 4, 5, 6, 7 };
        
        for(int i=0; i < array1.length; i++) {
            System.out.print(array1[i]+" ");
        }
        System.out.println("\n");
        
        for(int i=0; i < array2.length; i++) {
            System.out.print(array2[i]+" ");
        }
        
        System.out.println("\n");
        
        //System.out.println(array2);
        
        int[] array3 =  new  int[ array1.length + array2.length ]; //now this array3 has enough capacity to contain all the elements of array1 and array2
           for(int i=0; i < array1.length; i++ ) {
                       array3[i] = array1[i];
                       // assigning all value of array1 to array3' first 3 indexs
           }
        
        for(int i =0; i < array2.length; i++) {
               array3[ i + array1.length]  = array2[i]; 
               // assigning all the values of array2 to array3' remaining index
        }
        
   
        for(int i=0; i < array3.length; i++) {
            System.out.print(array3[i]+" ");
        }
	}

}
