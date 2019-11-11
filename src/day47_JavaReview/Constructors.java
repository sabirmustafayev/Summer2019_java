package day47_JavaReview;


// Every Class must have constructor

class Mehmet{
	
	public Mehmet() { //default constructor named Mehmet witohut any parameter
		System.out.println("Mehmet Constructor");
	}
	
}

class Resul extends Mehmet{
	
	public Resul() {//default constructor named Resul witohut any parameter
		System.out.println("Resul Contructor");
	}
	
	
}

class Viktoria extends Resul{
	
	public Viktoria() {
		System.out.println("Viktoria Constructor");
	}
	
}

public class Constructors {
	public static void main(String[] args) {
		
		Resul obj = new Resul(); //by creating the obj, contructors run automatically
		Viktoria obj2 = new Viktoria(); //by creating the obj, contructors run automatically
	}

}
