package day10_Review;



public class Warm_Up {
	public static void main(String[] args) {
		
		int grade = -9;
		
		boolean A = 90 <= grade && grade <= 100;
		boolean B = 80 <= grade && grade <= 89;
		boolean C = 70 <= grade && grade <= 79;
		boolean D = 60 <= grade && grade <= 69;
		boolean F = 0 <= grade && grade <= 59;
		boolean gradeValue = 0 <= grade && grade <=100;
		
if (gradeValue) {
		
		if (A) {
			System.out.println("You made A");
		}
		else if (B) {
			System.out.println("You made B");
		}
		else if (C) {
			System.out.println("You made C");
		}
		else if (D) {
			System.out.println("You made D");
		}
		else if (F) {
			System.out.println("You made F");
		}
		
	  }
        else {
	    System.out.println("Invalida Value");
}
	}

}
