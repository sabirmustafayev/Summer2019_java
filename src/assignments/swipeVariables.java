package assignments;

public class swipeVariables {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 15;
		
		a = a + b; // a ==> 25
		b = a - b; // b ==> 10
		a = a - b; // a ==> 15
		
		System.out.println("a = "+" "+a);
		System.out.println("b = "+" "+b);
	}

}
