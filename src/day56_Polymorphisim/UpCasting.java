package day56_Polymorphisim;

class Animal{
	public void method1() {
		
	}
	
}

class Dog extends Animal{
	//Dog IS An Animal
	public void method2() {
		
	}
	
}

public class UpCasting {
	public static void main(String[] args) {
		
		System.out.println((double)10); // casting int number with double
		
		//UpCasting: casting subclass to seperior type
		Dog obj = new Dog();
		Animal obj2 = (Animal)obj;
		
		
		
		
		 Animal obj3 = new Animal();
		 
		 
	        
	        //Dog obj4 = (Dog)obj3; // not allowed
	        
	        System.out.println("Hello");
		
		
	} 

}
