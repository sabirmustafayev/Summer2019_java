package day43_JavaRecap;

import java.util.Arrays;

public class InstanceBlock {
	
	String[] names  = new String[3];
	
	{
		System.out.println("Instance Block");
		names[0] = "Alla";
		names[1] = "Sabir";
		names[2] = "Khurshed";
		
		//names[3] = "Shukran"; 
		
	}
	
	public InstanceBlock() {
		System.out.println("Constrcutor");
		names[0]  = "Rahwa";
		names[1] = "Gulmila";
		names[2] = "Esma";
	}
	
	public static void main(String[] args) {
		
		InstanceBlock obj = new InstanceBlock();
		
		System.out.println("Main method");
		System.out.println(Arrays.toString(obj.names));
		
		System.out.println("*************Second object creation***********************");
		
		InstanceBlock obj2 = new InstanceBlock();
		
	//*********************************************************	
		int a = 10;
		a  = 20;
		System.out.println(a);
	}

}
