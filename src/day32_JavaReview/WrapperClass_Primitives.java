package day32_JavaReview;

public class WrapperClass_Primitives {
	public static void main(String[] args) {
		 //dosum(10.0 , 20.0 )  ==> double sum 30.0
        //dosum(10, 20)  ==> int sum  30
		dosum(10.0 ,  20.0); // this parameter is double Primitive(value), so what method has parameter related double Primitve, that one runs,
        Integer a=10, b=20;
        
        dosum(a, b);// Wrapper class Integer value. so what method has parameter related toWraperclass, that one runs,
        
        dosum(10,20); // this parameter is int value. so what method has parameter related int Primitive, that one runs,
        
        
        
        //***************** wrapper class only accepts their own primitve values************
        // byte d1 = 20; Double d2 = d1; // d2 is Wrapper class value, d1 is byte primitive. so we can Not assign difirent type primitive to Wrapper class
        
        byte a1 =10;
        Double a2 = (double)a1;  // auto boxing. here is a1 is primitivie a2 is Wrapper class variable. basicly we cannot assign a1 to a2,
        						//but here we do implicit casting a1 to double, then a1's type changes to double primitive.
        						//Double wrapper class (Double a2) accept double primitive value ((double)a1)
        
        byte d3 = 10;
        Byte d4 = d3; // d4 is Wrapper class value, d3 is byte primitive.so we CAN assign same type (byte)primitive to (Byte)Wrapper class
        
        
        //******************* primitives accepts any value as long as it's within the range***********
        Integer b1 = 30;  // b1 is Wrapper class variable
         long b2 = b1; //b2 is long primitive. but We CAN assign (Integer b1) wrapper class value into long primitive value
         						//as long as it's within the range so long range is bigger then int value(whole number) not accepted float and double because they not whole number
                  
         Integer c1 = 10;
         Double c2 = (double)c1 ; 
		
	}
	public static void dosum(double x, double y) {
        System.out.println("double sum: "+ (x+y) );
    }
    
    public static void dosum(Integer x, Integer y) {
        System.out.println("Integer sum: "+ (x+y)  );
       
    }
    
    public static void dosum(int x , int y) {
        System.out.println("int sum: "+ (x+y) );
    }
    
    public static void dosum(float x, float y) {
        System.out.println("float sum is "+(x+y));
    }
	

}
