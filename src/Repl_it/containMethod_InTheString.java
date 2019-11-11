package Repl_it;

import java.util.Scanner;

public class containMethod_InTheString {
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		    String a = s.nextLine();
		 String name = "Sabir";
		    
		  if (a.contains(name)) {
			System.out.println("read this mail");
		}
		  else
			  System.out.println("dont read");
	}

}
