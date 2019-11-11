package day04_Variables;

public class PrimiriveDataTypes {
	 /*
    Primitives:  byte, short, int, long, float, double, boolean , char
     
        boolean: takes either True or False boolean expressions
        
        char: declared with in the single quote '';  single character only.
                '' is a MUST when you give character as value
       */
    public static void main(String[] args) {
        
        //  boolean result = Earch is Flat;
        //  boolean num1 = 100;  boolean only takes true or false results
        
        boolean result = true; 
        boolean result2 = false; 
        boolean result3 =   9 > 3 ;
        
        
        System.out.println(result);  // true
        System.out.println(result2);  // false
        System.out.println(result3);   // true
        
        
        // char:
        
        char char1 ='a';
        
        System.out.println(char1);
        
        char char2 = '9';
        char char3 = '#';
        System.out.println(char3);
        System.out.println("\n\n");
        
        // char with numbers
        char char4 = 67;  // only time we use '' for char is when we are declaring single character
                // prints the character that's corresponding to 67 from ASCII table
         System.out.println(char4);
        System.out.println( char2 );
        
        char char5 ='C';  // prints the character as it's
        System.out.println(char5);  
        
        char char6 = '{';
        System.out.println(char6);
        
        char char7 = 123 ;
        System.out.println(char7);  // prints the chracter that has the number of 123 from ASCII Table
        
        System.out.println(" initializing char to other primitives: byte, short, int, long, float, double");
        
        // initializing char to other primitives: byte, short, int, long, float, double
            char MyChar1 = 'b';
            
            int MyInt = MyChar1;  // the number that represents b is initalized to the int
        
            System.out.println( MyInt);  //98
            
            
    //      byte MyByte =  MyChar1 ;  // char's memory is 2byte, byte' memory is 1 bytes
            byte MyByte2 = 'b';   // b's corresponding number is 98 from ASCII table
            System.out.println( MyByte2 );
            
            
    //      short ShortNum = MyChar1;  // char' memory is could be bigger than short, range is greatr than short
            short ShortNum2 = 'b';  // b's corresponding number is 98 from ASKCII table
            System.out.println(ShortNum2); 
            
            
            long LongNum = MyChar1;  // long's memory is 8 bytes
            long LongNum2 = 'b';  //98
            System.out.println(LongNum);
            System.out.println(LongNum2);		
		
            
	}

}
