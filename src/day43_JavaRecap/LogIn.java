package day43_JavaRecap;

public class LogIn {
	public static void main(String[] args) {
		
		//**************Public Instance variables
		
		Credentials obj = new Credentials();
		
		System.out.println("************************Public************************");
		obj.username = "Fatih";  // usernam and password are public in Credentials class
		obj.password = "istanbul";// that is why we can access these variables from another class by creating object
		
		System.out.println(obj.username +" "+ obj.password);
		
		//*********************************Private insatnce Variables and methods
		
		System.out.println("************************Private************************");
		
		System.out.print(obj.getUsername1()+" ");
		System.out.println(obj.getPassword1());
		
		obj.setUsername1("Cybertek");
		obj.setPassword1("123456");
		System.out.print(obj.getUsername1()+" "+obj.getPassword1());
		
		
		
	}

}
