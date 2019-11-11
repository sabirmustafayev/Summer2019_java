package day38_CustomClassContinue;

public class Employee {
	
	//instance variables
	String Name;
	String ID;
	int age;
	int SSN;
	String JobTitile;
	double salary;
	
	//contructor
	
	public Employee(String Name, String ID, int age, int SSN, String JobTitile, double salary) {
		this.Name = Name;
		this.ID = ID;
		this.age = age;
		this.SSN = SSN;
		this.JobTitile = JobTitile;
		this.salary = salary;
		
	}
	
	
	//instance methods
	public void getInfo() {
		
		System.out.println("Employee' name is "+Name);
		System.out.println("Social Security number is "+SSN);
		System.out.println("Age is "+age);
		System.out.println("Job title is "+JobTitile);
		System.out.println("Employee ID is "+ID);
		System.out.println("Salary "+salary);
		
		System.out.println("-------------------------------------------");
		
	}

}
