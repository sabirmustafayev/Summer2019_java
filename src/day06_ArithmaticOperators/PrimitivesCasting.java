package day06_ArithmaticOperators;

public class PrimitivesCasting {
	/*
	 * Casting : converting large primitive to smaller size.
	 * casting works based on range of values of data types.
	 * primitives: byte, short, int, long float, double
	 * 
	 * 			castings: explicit and implicit
	 */
	
	public static void main(String[] args) {
		
		//EXPLICIT CASTING
		int a = 18;
		//byte b = a;  gives error, beause int data type size (a=10) is larger then byte (b). 
		
				byte b = (byte)a; // Explicit casting
		System.out.println(b);
		//***************************************************************
		double DecimalNumber = 10.5;
		//float FloatNumber = (float) DecimalNumber;
		
		float FloatNumber = (int) DecimalNumber;
		
		System.out.println(FloatNumber);
		//****************************************************************
		
		long LongNum = 300l;
		// int IntNum = (int)LingNum;
		
		   int IntNum = (short) LongNum;
		   System.out.println(IntNum);
		  
		
		   // IMPLICIT CASTING : auotomatic casting from samll primitive type to larger primitive type
		   
		   int x = 50;
		   long y = (int) x;
		   System.out.println(y);
		   //*****************************************************
		   
		   double DecNum = 155.5;
		   int IntNum2 = (byte)DecNum;
		   
		   System.out.println(IntNum2);
		
	}

}
