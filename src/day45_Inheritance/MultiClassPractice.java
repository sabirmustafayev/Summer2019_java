package day45_Inheritance;

class Data{
	public String name;
	private String age;
	String ID;
	 
	public void Hello() { // public access modifier
		Hola();
		System.out.println("Hello");
	}
	
	private void Hola() { // private access modfier
		System.out.println("Hola");
	}
	
	void Aloha() { // default access modifier
		Hola();
		System.out.println("Aloha");
	}
}

public class MultiClassPractice {
	public static void main(String[] args) {
		
		Data obj = new Data();
		System.out.println(obj.name); // public is visible at everywhere
	//	System.out.println(obj.age); // private is not visible outside the class
		System.out.println(obj.ID); // default access modifier is visible to classes in the same package.
		
		
		/*
		 If those two classes were located in different packages,
		 then the default access modifier is not gonna visible
		 */
		
		 obj.Hello();
	  // obj.Hola();
	     obj.Aloha();
	}

}
