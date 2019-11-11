package day34_Constructor;

public class ConstructorMethods {
	
/*
decleration of constructor:
       access-modifer  className(){
               statements;
       }
*/

public ConstructorMethods() {   // Contructor execution is depended on creation of object
   
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
   
   ConstructorMethods  obj2 = new ConstructorMethods(8);  // creation of object
   
   
           method1();
           
           
}


public static void method1() {
   
   ConstructorMethods  obj2 = new ConstructorMethods(8);
   
}



}
