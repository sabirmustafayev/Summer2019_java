package day45_Inheritance;

public class InheritancePractice extends ParentClass{
	public static void main(String[] args) {
	//	System.out.println(username); // private is not inheritable
		System.out.println(password); // protected 
		System.out.println(age);    // public
		System.out.println(salary);  // default
		
		ParentClass obj = new ParentClass();
			System.out.println(obj.a);
	}
	
	

}
