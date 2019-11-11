package day40_staticKeyWord;

public class staticMethods {
	
	static String name;
	static double staticNum;
	
	int a;
	
	public static void main(String[] args) {
		
		 staticKeyword.method1();  // static method we can call it through the class name
		 
		 //  System.out.println( num1 ); // static method only accepts class members
		
		staticKeyword.method2();
	}

}
