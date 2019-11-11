package day40_staticKeyWord;

public class staticKeyword {
	int a;
	
	static int b = 300;
	
	public static void main(String[] args) {
		
		staticKeyword obj1 = new staticKeyword();
		obj1.a = 100;
		
		staticKeyword obj2 = new staticKeyword();
		obj2.a = 200;
		
		System.out.println(obj1.a); //100
			// each object has its own copy of instance variable
		
		System.out.println(obj2.a); // 200
		
		double num = 20.5;
		
		System.out.println(staticKeyword.b);
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		
		System.out.println("=============================");
		
		staticKeyword obj3 = new staticKeyword();
			obj3.a = 100;
			System.out.println(obj3.a); // 100
			
		staticKeyword obj4 = new staticKeyword();
			System.out.println(obj4.a); //0
			
			obj3.b = 400;
			
			//static variables take last value.  and all object shares that same value
			System.out.println(obj3.b);//400
			System.out.println(obj4.b);// 400 
			
			
	}
	
	 public static void method1(){
		    // System.out.println( num );  //local variables (num) only visible within the methods that is why it does not work another method
		        
		    }
	 public static void method2() {
		 System.out.println("medthod2 is called from staticKeyword class");
	 }

}
