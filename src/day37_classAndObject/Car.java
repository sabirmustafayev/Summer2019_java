package day37_classAndObject;

      public        class     Car {
// access modifier	
	/*
	 car
    data/attribute
        model, Year, brand, color, price, milage,VIN....
    actions:
        start, driver, accelerate, stop, drift, brake, get ticket..

	 */
	
	String Model; 
	int Year;
	String Color;
	double Price;
	long Mileage;
	String Brand;
	
	public void drive() {  //drive() method 
		
		System.out.println("Driving "+ Brand);
	}
	
	public void start() {
		
		System.out.println(Brand+" is started");
	}
	
	public void getInfo() {
		System.out.println(Year+" "+Brand+" "+Model+", "+Color+", "+Mileage+" miles"+", $"+Price);
	}
	
	

}
