package day32_JavaReview;

public class OverLoadMethodReview {
	/*
	 Overload methods: improves the reusability
	                   improves readability
	                   flexible during runtime
	                   
	             same method names, different parameters
	             
	             return-type of overload  does not matter
	 */
	public static void main(String[] args) {
		//****Void method
		sum(10, 5);
		sum(10.5, 20.7);
		sum(5, 98, 23);
		sum(10.5, 16, false);
		
		//*********Return Methods*************************
		int a = sum(10, 20.5, (byte)5);
		System.out.println(a);
	}
	
	public static void sum(int a, int b) {
		
		System.out.println("sum is: "+ (a+b));
	}
	
	public static void sum(double a, double b) {
		System.out.println("double is: "+(a+b));
	}
	
	public static void sum(int a, int b, int c) {
		
		System.out.println("int sum is: "+(a+b+c));
	}
	
	public static void sum(double a, long b, boolean c) {
		System.out.println("You have entered "+a+" "+b+" "+c);
	}
	
	//***Return Methods***************************************
	public static int sum(int a, double b, byte c) {
		
		int sum = a + (int)b + c;
		return sum;
	}

}
