package day33_ArrayList;

public class MethodCalls {
	
public static void main(String[] args) {
        
        	method1();   // method cannot call it self
        	method3();
        
            int max2 =  max(10, 20);  //20
            System.out.println( max2 );
        
            int max3 =  max(100, 200, 50);  // 200
            System.out.println(max3);
            
            
            maximum(400, 50000, 999999);  //999999
            
            String str = print(10,20,30);  // 30
            System.out.println(str);
            
        
    }
    
	
	//*****************************CUSTOME METHODS******************************************
	
	//*********************VOID Methods************************
public static void method1() {
    //   method2();         method cannot call it self. 
        System.out.println("A");
    }
    
    public static void method2() {  
        method1(); //A
        System.out.println("B"); //B
    }
    
    public static void method3() {
        method2(); // A B
        System.out.println("C");  //C 
    }
	
	//*************************************************************
    public static int max(int a, int b) {
        return ( a > b) ? a : b;
}

public static int max(int a, int b, int c) {
        //int largestNum = max(a, b);   
    return  ( max(a, b)  > c ) ? max(a, b) : c ;
    
}

public static int max(int a, int b, int c, int d) {
    /*
    int result = max(a, b, c);
    if(result > d) {
        return result;
    } else {
        return d;
    }
    */
    // return  (result > d) ? result : d;
    
    return  max(    max(a, b)  ,   max(c, d)  );
    
}

public static int max(int a, int b, int c, int d, int e) {
    
        return  max(    max(a,b,c,d)  ,  e );
        
}




public static void maximum(int a, int b, int c) {
     System.out.println(    max(a, b, c) );  
}

public static String print(int a, int b, int c) {
    maximum(a, b, c);
    return "900";
}




}