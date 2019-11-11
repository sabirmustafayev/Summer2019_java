package day49_Recap;

/*
 WarmUp: 
    1. create a class called Shape
            Actions: Area(), perimeter(), capacity()
    2. create sub classes of Shape:
                        Circle
                        rectangle
                        square
                        cylinder
        and give the instance variables that are needed to calculate the Area, perimeter, and Volume of those shapes
    3. override super class' Area(), perimeter(), capacity() methods to the sub classes
Formulas:
    Area of the circle:     3.14 * radius * radius
    Area of the rectangle:  width * length
    Area of the square:     side * side
    Area of the cylinder: (2 * 3.14 * radius * radius) + height(2*3.14*radius)
   
    Perimeter of circle:    3.14 * 2 * radius
    Perimeter of rectangle: (width + length) * 2
    Perimeter of Square: 4 * side
    volume of cylinder: 3.14 * radius * radius * height .  

 */

public class Shape {
	
	protected void Area() {
		System.out.println("Area is 0");
	}
	
	protected void perimeter() {
		System.out.println("perimeter is 0");
	}
	
	protected void capacity() {
		System.out.println("volume is 0");
	}
	
	public static void main(String[] args) {
		
		System.out.println("************RECTANGLE********************");
		Rectangle rectangle = new Rectangle(10,20); 
				  //rectangle.length = 10;
				  //rectangle.width = 20;
				  rectangle.Area();
				  rectangle.perimeter();
		Rectangle rectangle2 = new Rectangle(30,40);
				  rectangle2.Area();
				  rectangle2.perimeter();
				  rectangle2.capacity(); //0
				  
		System.out.println("************SQUARE********************");
		Square square = new Square(10);
			   square.Area();
			   square.perimeter();
			   square.capacity();
		
		System.out.println("************CIRCLE********************");
	    Circle circle = new Circle(5);
			   circle.Area();
			   circle.perimeter();
			   circle.capacity();
	    
	    System.out.println("************CYLINDER********************");
	    Cylinder cylinder = new Cylinder(2, 4);
	    		 cylinder.Area();
	    		 cylinder.perimeter();
	    		 cylinder.capacity();
		
	}

}
