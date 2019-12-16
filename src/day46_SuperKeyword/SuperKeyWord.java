package day46_SuperKeyword;

class A {                                              //super class
	
	String name = "Madina";                // instance variable in super class
	
	public void methodA() {  //instance method in superclass
		System.out.println("Instance method from SuperClass");
	}
	
	
	public A ( int a ) {                      //constructor in superclass
		System.out.println("Constructor from super class");
		
	}
	
}


public class SuperKeyWord extends A {                         //subclass
		//      sub               super
	
	public SuperKeyWord() {                      //constructor in subclass
		
		super(10);  // super class' constructor MUST be called in the sub class
	}
		  	
	
	/*
	 	String name  = "Madina";
	 */
	
	public void method() {    //instance method  in subclass
		super.name = "Mahir";
		this.name = "Ihsan"; 
		System.out.println(super.name);
		//System.out.println(this.name);
		
		System.out.println("****************************************");
		super.methodA();
		this.methodA();
		
		
	}
	
	public static void main(String[] args) {
		
		SuperKeyWord obj  = new SuperKeyWord();
		//SuperKeyWord obj1 = new SuperKeyWord();
		obj.method();
		//obj1.method();
	}
	
	
}