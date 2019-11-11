package Repl_it;

import java.util.Scanner;

public class OnlineBookMerchant {
	public static void main(String[] args) {
		
		/*
		 Online Book Merchants offers premium customers 1 free book with every purchase of 5 or more books
		 and offers 2 free books with every purchase of 8 or more books. It offers regular customers 1 free book with every purchase of 7 or more books,
		 and offers 2 free books with every purchase of 12 or more books. 
		 
		  Write a program that assigns freeBooks the appropriate value based on the values of the boolean variable isPremiumCustomer
		  and the int variable nbooksPurchased. Print amount of freeBooks into the console. 
		 */
		
		 int freeBooks = 0;
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Are You Premium Customer? (True/False)");
		    boolean isPremiumCustomer = scan.nextBoolean();
		    int nbooksPurchased = scan.nextInt();
		   
		    
		    if (isPremiumCustomer) {
		    	System.out.println("Hi dear Premium Customer!");
		    	 System.out.println("You puchased "+nbooksPurchased+ " book");
				if (5<=nbooksPurchased && nbooksPurchased <=7 ) {
					freeBooks++;
					System.out.println("You got "+freeBooks+" free book from us");
				}
				
				else if (8<=nbooksPurchased) {
					freeBooks+=2;
					System.out.println("You got "+freeBooks+" free book from us");
				}
				else
					System.out.println(0);
				
			}
		    else {
		    	System.out.println("Hi, dear regular Customer!");
		    	 System.out.println("You puchased "+nbooksPurchased+ " book");
		    	if (7<=nbooksPurchased && nbooksPurchased <=11 ) {
					freeBooks++;
					System.out.println("You got "+freeBooks+" free book from us");
		    	}
		    	else if (12<=nbooksPurchased) {
					freeBooks+=2;
					System.out.println("You got "+freeBooks+" free book from us");
		    	
		    	
		    	}
		    	else
		    		System.out.println(0);
		    	
		    }
	}
}
