package day49_Recap;

public class Square extends Shape{
	
	double side;  // INSTANCE VARIABLE
	
	public Square(double side) {  //*************INSTANCE METHOD Square()*************
		this.side = side;
	}
	
	@Override
	protected void Area() {        //*************Area() method is overriding*************
		double Area = side*side;
		System.out.println("Area of the Square is "+Area);
	}
	
	@Override
	protected void perimeter() {  //**********perimeter() method is overriding**************
		double perimeter = side * 4;
		System.out.println("Perimeter of the Square is "+perimeter);
	}

}
