package day05_Recap;

public class Concatenation {
	
	public static void main(String[] args) {
		/*
		 *String: it represents the sequences of characters, 
		 		  is used for storing text.
		 String values are surrender by double quote "".
		 
		 Concatenation: combining, linking things together  ==> creates a string 
		                achieved by using + operator
		 */
		
		String  str = " any text goes here";
		System.out.println(str);
		
		String str2 = "1";
		System.out.println(str2);
		
		System.out.println("Hello World!");
		
		String Hello = "Hello World";
		System.out.println(Hello);
		
		String myName = "Cybertek" + " School";
		System.out.println(myName);
		
		String Year ="This is " + 2019;
		System.out.println(Year);
		
		int cucumber = 3; int tomato = 5;
		
		System.out.println(tomato);
		
		System.out.println("cucumber is " + '$' + cucumber);
		
		System.out.println("1"+2+3); // 123
		System.out.println(1+1+"3"); //23
		System.out.println(1+1+3);   //5
		
		System.out.println(1+("1"+2));
		
		// System.out.println((1+2)-"3"); it gives error because
		
		
		System.out.println("3" + 3);// string + integer
		System.out.println('3' + 3); // char + integer char 3= 51 so 51+3= 54
		

	}

}
