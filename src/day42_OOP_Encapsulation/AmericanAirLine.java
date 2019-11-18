package day42_OOP_Encapsulation;

public class AmericanAirLine {
	public static void main(String[] args) {
		
		EmployeeInfo emrah = new EmployeeInfo();
		//*********************name********************************
		//emrah.Name = "Emrah"; // Name is private data so it is not visible to other class
		
		emrah.setName("Sabir");
		
		//System.out.println(emrah.Name); // private data is not visible outside the class
		
		System.out.println( emrah.getName() ); // Sabir
	
		//**********************ssn*******************************
		 emrah.setSSN(1234546);
         System.out.println(emrah.getSSN());
         
        //**********************age*******************************
         emrah.setAge((byte)35);
         System.out.println(emrah.getAge());
         
         
        //**********************salary****************************
         emrah.setSalary(100000.00);
         System.out.println(emrah.getSalary());
         
         //emrah.setAll("Sabir", 1334568,(byte)35, 10000.00);   THIS IS FOR INSERTING ALL VALUES BY ONE METHOD (setAll() method)
        
         
         
         
		
	}

}
