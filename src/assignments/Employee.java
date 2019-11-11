package assignments;

public class Employee {
	
	public Employee() {
		
		SSN= 0;
		name = "Not written yet";
		System.out.println("this is constructor");
	}
	
	public Employee(int SSN, String name,int age, double salary) {
		
		this.SSN = SSN;
		this.name = name;
		this.age = age;
		this.salary = salary;
		
	}
	
	
	//Instance variables
	int SSN;
    String name;
    int age;
    double salary;
    
   
    public void work() {
        System.out.println("the employee is working");
    }
    
    static {
        System.out.println("Welcome to Cybertek ");
    }
    
    {
        System.out.println("Hi " + name + "good morning");
    }
    
    public static void main(String[] args) {
		
    	Employee obj = new Employee();
    	//obj.name = "Muhtar";
    	//obj.age = 29;
    	//obj.work();
    	
    	Employee obj2 = new Employee();
    	
    	Employee obj3 = new Employee(657, "Vasya",18, 25555555);
    	
    	System.out.println(obj3.name);
    	
    	
    	
	}
    
    
}
