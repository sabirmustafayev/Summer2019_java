package day42_OOP_Encapsulation;

public class EmployeeInfo {
	
	/*
	 Name
	 SSN
	 Age
	 Salary
	 */
	
	private String Name;
	private long SSN;
	private byte Age;
	private double Salary;
	
	// name:
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getName() {
		return Name;
	}
	
	//ssn:
	public long getSSN() {
		return SSN;
	}
	
	public void setSSN(long SSN) {
		this.SSN = SSN;
	}
	
	//age
	public byte getAge() {
		return Age;
	}
	
	public void setAge(byte Age) {
		this.Age = Age;
	}
	
	//salary
	public double getSalary() {
		return Salary;
	}
	
	public void setSalary(double Salary) {
		this.Salary = Salary;
	}
	
	// setter for all
	
	/*
	public void setAll(String Name, long SSN, byte Age, double Salary ) { THIS FOR ASSIGNING LOCAL AND INSTANCE VARIABLE EACH OTHER BY ONE METHOD setAll()
		this.Name = Name;
		this.SSN = SSN;
		this.Age = Age;
		this.Salary = Salary;
		
	} */
	
	
	

}
