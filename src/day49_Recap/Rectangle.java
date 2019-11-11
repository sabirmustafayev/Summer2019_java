package day49_Recap;

public class Rectangle extends Shape{ 
	double length;
	double width;
	
	public Rectangle(double length, double width) {   // ************CONSTRUCTOR METHOD**********
		this.length = length;                                // TODO Auto-generated constructor stub
		this.width = width;                                     //we need constructor to iniatilize the varibales automatically
	}
	
	@Override
	protected void Area() {   // overriding  ************INSTANCE METHOD Area()**************
		double Area = length * width;
		System.out.println("Area of Rectangle is "+Area);
	}
	
	@Override
	protected void perimeter() {   //************INSTANCE METHOD  perimeter()**************
		double perimeter = (length + width) * 2;
		System.out.println("Primeter of the Rectangle is "+perimeter);
	}

}
