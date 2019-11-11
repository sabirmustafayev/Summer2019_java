package day47_JavaReview;

class Cinthya {
	
	public Cinthya(int a) { //5
		this(5.5); // calling constructor with double parameters
		System.out.println("A"); //6
		
		
	}
	public Cinthya(double b) {
		//this(5.5); // contructors can not call itself
		//this(10) //	constructor can not contain itself
		System.out.println("B");
		
	}
	public Cinthya(String c) {
		System.out.println("C");
		
	}
}

public class Constructors2 extends Cinthya {  //2
	
	public Constructors2() { //3 
		
		super(10); //4
	}
	
	public static void main(String[] args) {
		
		Constructors2 obj = new Constructors2(); // 1
	}

}
