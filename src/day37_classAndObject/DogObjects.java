package day37_classAndObject;

public class DogObjects {
	public static void main(String[] args) {
		
	Dog dog1 = new Dog();
		dog1.Breed = "Husky";
		dog1.Size = "small";
		dog1.Age = 25;
		dog1.Color = "gray and white";
		dog1.name = "holly";
		dog1.Gender = 'F';
		dog1.food = "Chichken";
		System.out.println(dog1.Breed); //husky
		
		dog1.getInfo();
		
		System.out.println("===========================================");
		
	Dog dog2 = new Dog();
		dog2.Breed = "Husky";
		dog2.Size = "large";
		dog2.Age = 3;
		dog2.Color = "gray";
		dog2.name = "Lyka";
		dog2.Gender = 'M';
		dog2.food = "Sushi";
		dog2.getInfo();
		
		System.out.println("=============================================");
		
		dog1.eat();
		dog2.eat();
		
		dog1.play();
		dog2.play();
		
		//String str = new String("Hello");
		// str.toLowerCase();
		
		/*
	     Assignment:
	        create a custom class for Employees
	            
	                attributes: EmployeeName
	                            EmployeeID
	                            JobTitle
	                            SSN
	                            Gender
	                            Salary
	                            
	                actions:
	                        getInfo
	                        
	                            
	            
	     */
		
		
	}

}
