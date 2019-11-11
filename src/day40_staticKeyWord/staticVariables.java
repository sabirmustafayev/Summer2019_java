package day40_staticKeyWord;

public class staticVariables {
	
	static String name;
	
	static double staticNum;
	
	public static void main(String[] args) {
		
		staticVariables obj1 = new staticVariables();
			obj1.name = "Omer";
		System.out.println( obj1.name );    // omer
		
		staticVariables obj2 = new staticVariables();
			obj2.name = "Sabir";
			
		System.out.println(obj2.name); //Sabir
		System.out.println(obj1.name); //Sabir 
		
		//=============================================
		System.out.println(staticVariables.staticNum); // 0.0
		
		staticVariables object1 = new staticVariables();
			object1.staticNum = 4.5;
		System.out.println(object1.staticNum); // 4.5
		
		staticVariables object2 = new staticVariables();
		System.out.println(object2.staticNum); //4.5
		
		
		
		
		
		
	}

}
