package day37_classAndObject;

public class CarObject {
	public static void main(String[] args) {
		
	
	Car           car1    =     new         Car();
// classname     objName       keyword     Contructor
	
	//System.out.println(car1.Brand);
			car1.Brand = "BMW";
			car1.Color = "White";
			car1.Mileage = 100000;
			car1.Model = "X6";
			car1.Price = 15000.5;
			car1.Year = 2000;
			
		System.out.println(car1.Brand);
		System.out.println(car1.Color);
		System.out.println(car1.Mileage);
		System.out.println(car1.Model);
		System.out.println(car1.Price);
		System.out.println(car1.Year);
		
		System.out.println("===========================================");
		
		Car car2 = new Car();
		
		System.out.println(car2.Brand); // Null because car2.Brand variable does have value yet
		
		car2.Brand = "Toyota";
		car2.Model = "Corolla";
		car2.Color = "Black";
		car2.Mileage = 150000;
		car2.Year = 2002;
		car2.Price = 2000;
		
		System.out.println(car2.Brand);
		System.out.println(car2.Model);
		System.out.println(car2.Color);
		System.out.println(car2.Mileage);
		System.out.println(car2.Price);
		System.out.println(car2.Year);
		
		
		car1.drive();
		car2.drive();
		
		car1.start();
		car2.start();
		
		car2.getInfo();
		
		Car car3 = new Car();
			car3.getInfo(); // default values
			
			 car3.Brand  = "Lexus";
             car3.Model  = "RX350";
             car3.Year   = 2020;
             car3.Mileage = 25000;
             car3.Color = "Purple";
             car3.Price =  40000;
             
             car3.getInfo();
		
	
			
	}
	
} 
