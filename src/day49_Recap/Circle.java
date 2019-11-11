package day49_Recap;

public class Circle extends Shape {
	double radius;
	double diameter;
	final double PI = 3.14;
	
	public Circle(double radius) { //******INSTANCE METHOD Circle(paramter)*************
		this.radius = radius;
		this.diameter = radius * 2;
	}
	
	@Override
	protected void Area(){
		double Area = radius * radius * PI;
		System.out.println("Area of the Circle is "+Area);
	}
	
	protected void perimeter() {
		double perimeter = PI * diameter;
		System.out.println("Perimeter of the Circle is "+perimeter);
	}	
	

}
