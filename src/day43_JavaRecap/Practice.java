package day43_JavaRecap;

public class Practice {
	public static void main(String[] args) {
		
		System.out.println(staticKeyword.StaName);
		
		staticKeyword.printName(); // static variable and method can be called through the class name
		
		//staticKeyword.printName2(); // printName2 is instance method it can not be called thorugh the class name but Creation object
		
		Practice.printName(); 
		
		
		
	}
	
	public static void printName() {
		
		System.out.println("Semra");
	}

}
