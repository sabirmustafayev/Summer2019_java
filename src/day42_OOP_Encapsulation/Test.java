package day42_OOP_Encapsulation;

public class Test {
	public static void main(String[] args) {
		TestData obj = new TestData();
		
		System.out.println(obj.Name); // Name data is public so this class can access to it
		
		// System.out.println(obj.LastName); LastName data is private so this class can not reach it.
		
		
		System.out.println(obj.getLastName());
		
		String str = obj.getLastName(); // getName method return String value so we cna assign it to string variable
		
		int a = obj.getID();
		
		System.out.println(obj.getID());
		
	
	//modify
		//obj.NAme = "Nurzat";
		obj.setName("Nurzat");
		
		System.out.println(obj.getLastName());
		
		obj.setID(400);
		System.out.println(obj.getID());
	}

}
