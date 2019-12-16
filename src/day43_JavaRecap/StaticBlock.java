package day43_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;



public class StaticBlock {

    // static ChromeDriver driver = new ChromeDriver();
    //  static Excel data ;
    /*
        static{
            driver.manage().window().maximize();
        }
        
     */
	
	static String[] arr = new String[3];  //static array
	static ArrayList<String> list = new ArrayList<>(); // static ArrayList
	double salary = 3000; // instance variable
	
	
	
	static { // static initializer block is used for initializing static variable 
		System.out.println("static block");
		arr[2] = "Alla";
		arr[0] = "Kateryna";
		arr[1] = "Ruslan";
		
		
		int sab = 10;
		System.out.println(sab); // local variabl in static block can be JUST used in satic blocks
		
		list.addAll(Arrays.asList(arr));  // elements of 'arr' array ARE ADDED (copied)to 'list' ArrayList
		
		// salary = 5000;  // static only accepts static
        
        StaticBlock obj1  = new StaticBlock(); 
           obj1.salary = 4000;
           System.out.println( obj1.salary ); // 4000
	} 
	
	
	
	
		
	public static void main(String[] args) {
		System.out.println("Main method");
		
		System.out.println(Arrays.toString(arr));
		
		 System.out.println(list);
	        
	        StaticBlock obj1  = new StaticBlock(); 
	        System.out.println( obj1.salary ); // 0.0
		
	}

}
