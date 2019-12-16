package day56_Polymorphisim;

class A{   //super class
	
	public void methodA() {  //instance method A in super class
		
		System.out.println("Method A from A class");
	}
	
	public static void methodC() {
		 System.out.println(" method C from A class");
	}


	
}

//***********************************************************************

class B extends A{ //subclass
	
	public void methodB() { // instance method B in subclass
		System.out.println("MEthod B from B class");
	}
	
	public void methodA() { //
		System.out.println("method A from B class");
	}
	
	public static void methodC() {
		System.out.println("method C from B Class");
	}
}

//*****************************************************************************

public class PolymorphisimReview {
	public static void main(String[] args) {
		
		A obj = new A();
		
		A obj2 = new B();
		  obj2.methodA();
		 // obj2.methodB()
		  
		  //B obj3 = new A(); // child(sub) class can not be the reference to paretn class' object.
		  //C obj4 = new C(); // abstract class is not concrete
		  
		  C obj5 = new D();
		  E obj6 = new D();
		//  D obj7 = new E();//we can not create object from the interface
		  
		  //C obj8 = new E();//we can not create object from the interface
		  
		  //E obj9 = new C();
		  //E obj10 = new F();
		  
		  A obj11 = new B();
//referenc type(class A)       object type (class B)
		  
		  obj11.methodA(); //****  if a method is exist in both reference type and object, the overridden one gets executed***
		  					// from B class method A is had by two class (class A and class B)
		                   //if methodA is overriden in class B, then class B's methodA() is gonna be executed here
		                   //otherwise methodA() in class A(reference class decides) is gonna be executed
		  
		  obj11.methodC(); //*****if the method is not being overridden,then the reference type method gets executed***
		  
		  
	}

}

abstract class C { //abstract class C
	
}

class D extends C implements E{

	@Override
	public void method6() {
		// TODO Auto-generated method stub
		
	} //default class D
	
}

interface E{  //interface E
	abstract void method6();
		
	
	
}

abstract class F implements E{ //abstract class F
	
}
