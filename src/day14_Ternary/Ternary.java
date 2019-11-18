package day14_Ternary;

import java.util.*;	// everything in S


public class Ternary {
	
	/*
    in Ternary:
        if(condition)       ==> (Condition)?
        else                ==>    :
        else if(Condition)  ==> :(Condition)?
    */
   
   public static void main(String[] args) {
       /*int num = 0;
       
       if(false) {
           num = 100;
       }else {
           num = 50;
       }*/
           
   int n = (true)? 100 : 50 ;   // ternary returns a Value
   
   int y = false ? 100 : 50;  
               System.out.println(50 );
   
  // System.out.println(num);  // 50
   System.out.println(n+" nn");  // 50
   System.out.println(y+ "yyy");
   
   
       String Schoolname ="";
       boolean Batch12 = true; 
       if(Batch12) {
           Schoolname ="Cybertek";
       } else {
           Schoolname ="Invalid";
       }
       
   System.out.println( Batch12 ? "Cybertek" : "Invalid" );
       
   String BestSchool = !Batch12 ? "Cybertek" : "Invalid"; 
   
   System.out.println(BestSchool);
   
       
           double d = 10;
           if(true) {
               d= 10.5;
           }
   
       double z = true ? 10.5 : 0;
       // in ternary, total number of ? and :  has to be equal
   
   
       double interestRate = 0;
       boolean GoodCredit = true;
   
       interestRate = GoodCredit == true ? 0.5 : 0.9 ;
       System.out.println(interestRate);
       
       //byte = 60;
       //boolean Passed = grade >= 60 ? "true";
       
       
	   
	   Scanner scan = new Scanner(System.in);
	   
	   System.out.print("Enter the score: ");
	   
	   int score = scan.nextInt();
       
           char Finals = ' ';
       
       if (score >= 90 && score <=100) 
    	   Finals = 'A';
       else if (score >= 80 && score <=89) 
    	   Finals = 'B';
       else if(score >= 70 && score <=79)
    	   Finals = 'C';
       else if(score >= 60 && score <=69)
    	   Finals = 'D';
       else if(score >= 0 && score <=59)
    	   Finals = 'F';
       else 
    	   Finals = ' ';
	
       Finals = (score >= 90 && score <=100) ? 'A'
    		      :(score >= 80 && score <=89) ? 'B'
    		        :(score >= 70 && score <=79) ? 'C'
    		          :(score >= 60 && score <=69) ? 'D'
    		        	:(score >= 0 && score <=59) ? 'F'
    		        		:' ';
       System.out.println(Finals);
       
       int n1 = 100, n2 = 250, n3 = 550;
		int max = (n1 > n2 && n1 > n3) ? n1
				    :(n1 > n2 && n2 > n3) ? n2
				       : n3;
		System.out.println("Max = "+max);
	
       
       
       
   }

}
