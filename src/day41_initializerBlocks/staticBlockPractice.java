package day41_initializerBlocks;

import java.util.ArrayList;
import java.util.Arrays;
public class staticBlockPractice {
    
    
	public static String name;  // "suna" , "Erhan", "mehmet"
    public static int[] arr1;
    
    public static ArrayList<String> list = new ArrayList<>();
    public static ArrayList<String> students = new ArrayList<>();
    
    public static String[] online = {"Arzigul","Me","Spike","Savas","Bahadir","Madina"};
    public static String[] inClass = {"Daryna","Nadire","Olga","Mizgin"};
    
    public static double a =100;
    public int grade; // instance variable
    
    static {
    	System.out.println("=============Static Block1=======================");
        name = "Erhan";
        arr1 = new int[3];  //{0, 0, 0};
        arr1[1] = 2;   // {0, 2, 0}
        list.add("Break");
        students.addAll( Arrays.asList(online) );
        a = 300;
        System.out.println("=================================================");
    }
    
    static {
    	
    	System.out.println("=============Static Block2=======================");
        name = "Suna";
        arr1 = new int[5];  //{0, 0, 0, 0, 0};
        arr1[0] =1;   // { 1, 0, 0,0,0}
        arr1[2] =3;  //  { 1, 0, 3,0,0}
        list.add("Coffee");
        list.add("Tea");
        students.addAll( Arrays.asList(inClass) );
        a=400;
        list.add(3, "Madina");  // we cannot skip idexes
        System.out.println("=================================================");
        
    }
    
    
    
    public static void main(String[] args) {
        
       staticBlockPractice obj1 = new staticBlockPractice();
        System.out.println(name);  // null
        
        System.out.println( Arrays.toString( arr1 ) ); 
        
        System.out.println(list);
            
        System.out.println(students);
        
        a = 500;
        System.out.println(a);
        
        System.out.println( obj1.grade );
        
        
    }
    
    
    
    
    public staticBlockPractice(){
        name = "Mehmet";
        grade =1000;
    }
}