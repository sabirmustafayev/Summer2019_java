package day10_Review;

public class MaxNumber {
	public static void main(String[] args) {
		int num1, num2, max;
		max = 0;
		num1 = 50;
		num2 = 55;
		
		if (num1 > num2) {
			
			max = num1;
			
			System.out.println("Maximum number is" + " "+max);
			
		}
		
		if (num1 < num2) {
			
			max = num2;
			System.out.println("Maximum number is" + " "+max);
			
		}
		
	}

}
