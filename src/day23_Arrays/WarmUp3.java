package day23_Arrays;
import java.util.Scanner;

public class WarmUp3 {

	  public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        
	        System.out.println("Please enter :");
	        String word=scan.nextLine();
	        
	        for (int i = 0; i < word.length(); i++) {
	            for (int j = 0; j < word.length(); j++) {
	                if(word.charAt(i)!=(word.charAt(j))) {
	                    System.out.println(word.charAt(i)+" is  a unique char in word.");
	                }
	            }
	        }
	    }
}

