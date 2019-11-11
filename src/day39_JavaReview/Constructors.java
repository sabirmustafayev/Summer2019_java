package day39_JavaReview;

public class Constructors {
	
	public Constructors() {
		System.out.println("Sabir"); //Sabir
	}
	
	public Constructors(int a) { // Sabir Samir 
		this(); // calling Contructors() without any parameters
 		System.out.println("Samir"); //Samir
	}
	
	public Constructors(double a) {
		this(100); // calling Contructors(int a) with int a parameters
		System.out.println("Elchin");
		//this(10);  constructor call must be the first step
	}
	
	public Constructors(boolean a) {   //  Sabir Samir Elchin Dinara
        this(2.5);   //  Sabir Samir Elchin
        System.out.print("Dinara ");
    }
	
	 public Constructors(String str) {  // Sabir Samir Seyfo
	        this(100); // Sabir Samir
	        // this(true); // one constructor can only call one constructor 
	        System.out.println("Seyfo ");
	    }
	
	 public Constructors(byte a) { // Sabir Samir Seyfo Teymur
	        this("hello"); // Sabir Samir Seyfo
	        System.out.print("Teymur ");
	    }
	
	
	public static void main(String[] args) {
		
		//Constructors obj = new Constructors(2); this will call Constructors with int parameter as a default
		Constructors obj = new Constructors((byte)2); //we did explicit casting that is why calling Constructors with byte parameter
		
		
	}

}
