package Repl_it;

import java.util.Scanner;

public class if_ShoppingList2 {
	public static void main(String[] args) {
		/*
		 In this assignment you will write a program to create a shopping list, count and prices.
		 You will use Scanner object and ask user to enter 3 items followed by its count, 
		 price and you will calculate total price and show as a report.
		 
		 */
		//-Declare  variables
		 String item1, item2, item3;
		 String report = "";
		 double price1, price2, price3, totalPrice;
		 int count1, count2, count3;
		 
		 //-Create a Scanner object named scan.
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Enter Item1, count and its price:");
		 item1 = scan.nextLine();
		 count1 = scan.nextInt();
		 price1 = scan.nextDouble();
		 
		 System.out.println("Enter Item2, count and its price:");
		 item2 = scan.next();
		 count2 = scan.nextInt();
		 price2 = scan.nextDouble();
		 
		 System.out.println("Enter Item3, count and its price:");
		 item3 = scan.next();
		 count3 = scan.nextInt();
		 price3 = scan.nextDouble();
		 
		 
		
		
		//-calculate totalPrice for all items only if the item's count is more than 0!
		 
		 totalPrice = price1*count1 + price2*count2 + price3*count3; //if count is zero, then it's price gonna be zero because of multiplying
	
		/*
		 -build the report variable by concatenating Strings and double price values:
         -do not include items that have count 0, use if statement !
		 */
	
		 if(count1>0) {
			  report +="Item1: "+item1+" Price: "+price1*count1;
			}
			if(count2>0) {
				  report +=", Item2: "+item2+" Price: "+price2*count2;
				}
			if(count3>0) {
				  report +=", Item3: "+item3+" Price: "+price3*count3;
				}
			
			System.out.println(report);
			System.out.println("Total price: "+totalPrice);
	}

}
