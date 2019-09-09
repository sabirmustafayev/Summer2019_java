package day07_Uneray_ShortHand;

public class UnaryOperators {
	public static void main(String[] args) {
		
		System.out.println("******************Pre-Increment*************************");
		// increment ++
		
		// Pre increment ++a ..Operator is coming before variable
		//variable value changes immediately
		
		int a=10;
		System.out.println("a = " + a);
		
		int b = ++a;
		System.out.println("after incrementing");
		System.out.println("a = " + a); 
		System.out.println("b = " + b);
		 
		 
		 System.out.println("******************Post-Increment*************************");
		 // Post increment c++..Operator is coming after variable
		 //variable value stay same, then its value change in next step
		 
		 int c= 20;
		 System.out.println("c = " + c);
		 
		 int d = c++;
		 System.out.println("after incrementing");
		 System.out.println("d = " + d);
		 System.out.println("c = " + c);
		 
		 
		
		
	}

}
