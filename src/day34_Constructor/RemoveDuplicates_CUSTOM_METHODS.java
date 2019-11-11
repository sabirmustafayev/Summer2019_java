package day34_Constructor;

import java.util.ArrayList;

public class RemoveDuplicates_CUSTOM_METHODS {
	/*
	 1. write  a return method that can remove duplicates from a string
        Ex: RemoveDup("abcabc") ==> returns "abc";
        
     2. write a return method that accepts two parameter Strings a and b, and returns the total numbers of apperence of b in String a
        Ex: count("abcaba")  ==> returns 3 ;
     
     3. use the above two methods to write a new method that can find the frequency of characters
        Ex: frequency("aabcabcabc") ==>a4b3c3
        
     4. write a return method that can find the maximum number from an Integer arrayList   
        (DO NOT use sort methods of Collections class)
    
     5. write a return method that can find the minimum number from an Integer arrayList 
        (DO NOT use sort methods of Collections class)


	 */
	public static void main(String[] args) {
		
		//*******TASK 1************************
		String a = RemoveDup("abcabcdefdef");   // "abc"      
        	System.out.println(a);
        
        //*********TASK 2*************************
        int count  = AppearanceCount("abaacdabcdaaa", "c");
             System.out.println(count);
             
        //********TASK 3*************************
             System.out.println(  frequencyTest("abcabcaabbcccc") );
             
             System.out.println(frequencyTest("dddddddddddddddddeeeeeeeeeeee"));
             
        //***********TASK 4************************************************
             ArrayList<Integer> list = new ArrayList<Integer>();
             list.add(-100);
             list.add(20);
             list.add(0);
             list.add(30);
     
      int maxnum = maximum(list);  // 30
      System.out.println(maxnum);  // 30
      
      //*************TASK 5 ***************************************************
      int minnum  = minimum(list); //0
      System.out.println(minnum);
			
	}
	
	//////////////CUSTOM METHODS//////////////////////////////////////
	
	//***************1. Renove Dupliates************************
	 public static String RemoveDup(String str) {
         //"abcabc"
		 String result = "";
		 for(int i=0; i < str.length(); i++) {
			 if( ! result.contains( str.substring(i, i+1) ) ) {
				 result += str.substring(i, i+1);
			 }
		 }

		 return result;

	 }
	 
	 //*************2.Count how many time second string appearing in first string*****
	    public static int AppearanceCount(String str1, String str2) {
	                            // abab        a   ==>1
	                            // bab          a  ==. 2
	            
	        int count=0;  //  to count how many time b is appeared in a
	        
	        while(str1.contains(str2)) {
	            count++;
	            str1 = str1.replaceFirst(str2, "");
	        }
	            
	        return count;   
	    }
	    
	 //*************3.Frequency of Characters*********************************
	    public static String frequencyTest(String str) {
            // "abcabcabc"  ==> "a3b3c3"
            
	    	String nonDup = RemoveDup(str); // "abc" 

	    	String result = "";  // to store the expected result

	    	for(int i = 0; i < nonDup.length() ;  i++ ){
	    		int frequency = AppearanceCount(str,  nonDup.substring(i, i+1));
	    		result += nonDup.substring(i, i+1) + frequency;
	    	}

	    	return result;
	    }
	    
	 //************4. MAX_VALUE from Integer ArrayList**********************************
	    public static int maximum ( ArrayList<Integer>  list) {
	        int max = Integer.MIN_VALUE;
	        
	        for( int each :  list) {
	            if(each > max ) {
	                max = each;
	            }       
	        }
	            return max;
	    }
	 
	 //***************5. MIN_VALUE from Integer ArrayList*******************************
	    public static int minimum( ArrayList<Integer>  list ) {
	        int min = Integer.MAX_VALUE;
	        
	        for( int each :  list) {
	            if(each < min ) {
	                min = each;
	            }       
	        }
	            return min;
	        
	    }
	    
}
	    