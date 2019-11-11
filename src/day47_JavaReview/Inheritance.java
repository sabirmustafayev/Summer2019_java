package day47_JavaReview;

class A{
	public String name1 = "Ayaz"; // in Default A clas has one instance variable
	
	 public void mm() { //instance class
	        // super.name1 = "Hakan";  // super keyword MUST be used in sub class
	    }
	 
	 public static void N() { //static class
	        
	    }
	
}

class B extends A{
	
	public String name2 = "Sukran";  // in Default B clas has 3 instance variables
	public String name3 = "Erhan";   // because B inherit from A B has own 2 varibale plus one variable coming from class A
	
	 public static void J() {
	        
	    }
	    
	    public void method1() { //instance method
	        super.name1 ="Feride"; // super keyword shows name1 variable 
	        super.mm();
	        super.N();
	        this.J();
	        
	    }
}

public class Inheritance extends B {
	
	public String name4 = "Mehmet";     //in public Inheritance clas has 5 instance variables 
	public String name5 = "Mahribana";
	
	public static void main(String[] args) {
		
		System.out.println("===================Inheritance() class=============================");
		
		Inheritance obj = new Inheritance();
		
		System.out.println(obj.name1);
		System.out.println(obj.name2);
		System.out.println(obj.name3);
		System.out.println(obj.name4);
		System.out.println(obj.name5);
		
		
		
		System.out.println("====================B class============================");
		B obj2 = new B();
		
		
		
		System.out.println(obj2.name1);
		System.out.println(obj2.name2);
		System.out.println(obj2.name3);
	//	System.out.println(obj2.name4); // name 4 and name 5 is not in class B. 
	//	System.out.println(obj2.name5);//super class cannot inherit anything from the sub class
		
		System.out.println("=====================A class===========================");
		A obj3 = new A();
		
		System.out.println(obj3.name1); // 
	//	System.out.println(obj3.name2);//super class cannot inherit anything from the sub class
	//	System.out.println(obj3.name3);//super class cannot inherit anything from the sub class
	//	System.out.println(obj3.name4);//super class cannot inherit anything from the sub class
	//	System.out.println(obj3.name5);//super class cannot inherit anything from the sub class
	}

}
