package day10_Review;

public class Else_If {
	public static void main(String[] args) {
		
		int grade = 95;
		if (grade >=90) {
			 System.out.println("You made A");
		}
		else if (grade <90 && grade >=80) {
			System.out.println("You made B");
		}
		else if (grade <70 && grade >=60) {
			System.out.println("You made C");
		}
		else {
			System.out.println("You made F, Study more");
		}
	}
}


