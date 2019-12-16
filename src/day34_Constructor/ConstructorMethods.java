package day34_Constructor;

public class ConstructorMethods {
	
/*
decleration of constructor:
       access-modifer  className(){
               statements;
       }
*/

 ConstructorMethods() {   // Constructor execution is depended on creation of object
   
   System.out.println("Hello World");
   System.out.println("I am a default constructor");
   
   // return "aaa";   there is no return type in constructor
}

public ConstructorMethods(int num) {
   
   System.out.println("Hello world");
   System.out.println("I am a constructor with an argument of int: "+num);
   
}


public static void main(String[] args) {
       
//  ConstructorMethods obj = new  ConstructorMethods( "A" ); 
                   // object was not created with exisiting constructor
   
   ConstructorMethods  obj2 = new ConstructorMethods(8);  // creation of object is for called public constructor with int parameter
   
   
           method1();
           
           
}


public static void method1() {
   
   ConstructorMethods  obj2 = new ConstructorMethods(); //this object creation is for called default constructor without parameter
   
}



}
