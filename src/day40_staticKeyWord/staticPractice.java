package day40_staticKeyWord;

public class staticPractice {
	
	static long num1;
		long num2 = 25;
		
	public static void main(String[] args) {
		
		System.out.println(num1);
		System.out.println(staticPractice.num1);
		
		//System.out.println(num2);
		
		staticPractice.method1();
		
		//staticPractice.method2();
		
		staticPractice obj = new staticPractice();
			obj.method2();
			
			obj.method1();
			
		System.out.println(obj.num2);
		
	}
	
	public static void method1() {
		System.out.println("Static method");
	}
	public void method2() {
		System.out.println("Non-static method");
	}

}
