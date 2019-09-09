package Repl_it;

import java.util.Scanner;

public class Scanner_ConcatingStringDoble {

	public static void main(String[] args) {
		
		/*
		 * next()==>can read the input only till the space. 
	           It can't read two words separated by a space.
	            Also, next() places the cursor in the same line after reading the input.
	            
	      nextLine()==> reads input including space between the words 
	   			(that is, it reads till the end of line \n 
		 * 
		 * */
		
		String item1, item2, item3, report;
		Double price1, price2, price3, totalPrice;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Item1 and its price:");
				item1 = scan.nextLine();
				price1 = scan.nextDouble();
				
				scan.nextLine();		
		System.out.println("Enter Item2 and its price:");
				item2 = scan.nextLine();
				price2 = scan.nextDouble();
				
				scan.nextLine();		
		System.out.println("Enter Item3 and its price:");
				item3 = scan.nextLine();
				price3 = scan.nextDouble();
				
		totalPrice = price1 + price2 + price3;
		
		report = ("Item1: "+item1+" Price: "+price1+", "+"Item2: "+item2+" Price: "+price2+", "
					+"Item3: "+item3+" Price: "+price3+"\nTotal price: "+totalPrice);
		
		System.out.println(report);
    
		
	}
	
	
}
