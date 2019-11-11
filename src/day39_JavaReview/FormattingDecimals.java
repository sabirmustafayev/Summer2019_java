package day39_JavaReview;

import java.text.DecimalFormat;

public class FormattingDecimals {
	public static void main(String[] args) {
		
		DecimalFormat format1 = new DecimalFormat("0.000");
		
		double b = 23.123552332311213;
		
		//format(double);
		
		String num1 = format1.format(b);
		
		 System.out.println(num1);
         
         double c = 45.5689;  // 45.57
         
         System.out.println(  format1.format(c) + 1 );  // 
         
         c = Double.parseDouble( format1.format(c) ); // from string to double primitive
         
         System.out.println(c+1); // c is now primitive so we can add 1 to primitive 45.569 + 1 = 46.569
	}

}
