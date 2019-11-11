package day48_MethodOverRiding;

class student{
	
	public void printName() {
		System.out.println("Hakan");
	}
}

public class MethodOverriding extends student {
//            sub_class               super_class	
	public void print(String str) {
		
	}
	
	public void print(double a) {
		
	}
	
	//public void print(String str) {	} // overriding can not happen in the same class
	
	public void printName() {
		System.out.println("Shukran");
	}	
	
	//**************************MAIN MEthod************************
	public static void main(String[] args) {
		
		student obj2 = new student();
			obj2.printName(); //Hakan
		
		MethodOverriding obj = new MethodOverriding();
			obj.printName(); //Shukran
			
		
	}

}
