package assignments;
import java.util.*;

public class Greater_Number {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int a = s.nextInt();
	    int b = s.nextInt();
	    
	    //WRITE YOUR CODE HERE:
	    
	    if(a>b)
	    {
	      System.out.println(a+" "+"is greater");
	    }
	    else if(b>a)
	    {
	      System.out.println(b+" "+"is greater");
	    }
	    else
	    {
	      System.out.println(a+" "+"and"+" "+b+" "+"are equal");
	    }
	   
	    
	  }
}
