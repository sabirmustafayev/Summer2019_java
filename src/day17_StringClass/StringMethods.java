package day17_StringClass;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		
		//String literal object by string literal
		String str1 = "Hello Javengers";
		String str2 = "Hello Javengers";
		Boolean R1 = str2 == str1; // true
		System.out.println(R1);
		
		//by new keyword
		String str3 = new String("Hello Javengers");
		String str4 = new String("Hello Javengers");
		Boolean R2 = str3 == str4; //false
		System.out.println(R2);
		
		
		/* String Methods **********************************************************************
		 
		 	1. concat 2.length 3.charAt 4. toUpperCase 5. toLowerCase
		 	5.trim 6.substring
		 */
		
		/* ************************************************************************
		concat(str): it takes String, and combines the two Strings 
		and returns it as new String value
		
		*/
		
		System.out.println("*********concat() Method********************");
		String a  = "Cybertek";
			a.concat("School"); //Cybertek School
		System.out.println(a);
			a = a.concat("School"); // Cybertek School
		System.out.println(a);
		
		String A = "hello", B = "helloP";
		System.out.println(A==B); //false - different values
		
		String C = "Hello", D = "hello";
		System.out.println(C==D); // false, case sensitivity
		
		/* *************************************************************************
		 	length(): it returns the total number of the characters as an int value
		 */
		System.out.println("*********length() Method********************");
		
		String LongName = "ABCDEFGHIJKLMN";
				//         0123456789...13
				int num = LongName.length();
		System.out.println(num); // total number of char is 14 includes zero as well
		
		/* **************************************************************************
		  chartAt(indexNum): it returns the character of the index number as a char value 
		          indexNum should be integer.
		 */
		
		System.out.println("*********charAt() Method********************");
		
		String name1 = "Sabir";
		//index:        01234
		char ch = name1.charAt(4);
		System.out.println(ch);// r,  index 4 is r
		
		/* **********************************************************************
		  toUpperCase(): converts the String value to Upper case,
		                 and returns it as New String value
		                 
		  toLowerCase(): converts the String value to Lower case,
		                 and returns it as New String value
		 */
		
		System.out.println("**********toUpperCase() Method**************");
		
			
			String name2 = "cybertek";
				   name2.toUpperCase(); 
				System.out.println(name2); // still is lowercase, because immutable
				   name2 = name2.toUpperCase();
				System.out.println(name2); // now it changed to uppercase
				
	     System.out.println("***********toLowerCase() Method*************");
	     
	     	String name3 = "CYBERTEK";
	     		   name3.toLowerCase();
	     		System.out.println(name3);// not changed to lowercase
	     		   name3 = name3.toLowerCase();
	     		System.out.println(name3);
	     
	     		
	     /* ***********************************************************************
	       trim(): it's used for removing the unused spaces
	       	       and returns a new String value
	      
	      */
	     System.out.println("*************trim() Method********************");
	     //*******************************************************************
	     	String s1 = "               hello                   ";
	     		   s1.trim();
	        System.out.println(s1);
	               s1=s1.trim();
	        System.out.println(s1);
	      //*************************************************************************
	        String s2 = "Cybertek                    school";
	        	   s2.trim();
	        System.out.println(s2);
	               s2 = s2.trim();
	        System.out.println(s2);
	      //*********************************************************************
	        String s3 = "      ";
	         	   s3 = s3.trim();
	        System.out.println(s3);
	      //**********************************************************************
	        String s4 = "       Cybertek      School";
	        		System.out.println(s4);
	               s4 = s4.trim();
	        System.out.println(s4);
	     
	      
	        System.out.println("***********substring(int begining index) Method**************");
	        
	        /* ***********************************************************************************
	          substring(int begining index):
	           					it creates sub value of the string from
	                            the beginning index till the last index
	                            and returns it as New String Value
	                                     
	         */
	        
	        String X = "Cybertek School";
	        //          0123456789.....14
	         		X.substring(5);
	         		X = X.substring(5);
	         System.out.println(X);
	       
	       //***********************************
	         String Address = "1641 Ocean avenue, Brroklyn, NY 11230";
	                     //    0123456789..........................
	         String zipcode = Address.substring(32);
	         System.out.println(zipcode);
	         System.out.println("******substring(int begining index,  int ending index) Method***********");
	        
	         /* *****************************************************************************************
	          substring(int beginning index, int ending index):
	          				it creates the sub value of the String from the
	          				beginning index till the ending index
	          				(ending index num will be excluded)
	          				then returns it as a new string value
	          				
	          */
	         
	         String name5 = "Hello Cybertek School";
	         //              0123456789...........
	         System.out.println(name5);
	         
	         		name5 = name5.substring(6,14);
	         System.out.println(name5);
	         
	         
	         
	         
	}
}
