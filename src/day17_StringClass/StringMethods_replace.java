package day17_StringClass;

public class StringMethods_replace {
	public static void main(String[] args) {
		
		/* **********************************************************************
        replace(old char, new char):
        				replaces all the old char values with the
        				given new char value in the String and
        				returns it as NEW STRING VALUE
             
        */
       String str1 = "Java is Fun Programming Language";
                    System.out.println(str1); 
       				str1 = str1.replace('a', '1');
       				System.out.println(str1);
       				System.out.println("\n"); 
       
       /* *************************************************************************
        replace(old string, new string):
        			    replaces all the old String values with the given
        			    new String values in the String and returns it
        			    as a new string value        			    
        */
       				
       	String str2 = "Today is gonna be a great day to learn,Today, java java";
       				System.out.println(str2);
       				str2 = str2.replace("Today", "Tomorrow");
       				System.out.println(str2);
       				System.out.println("\n"); 
       				
       	/* **************************************************************************
       	 replaceFirst(old String,new String):
       	 			replaces the first occured old string with the 
       	 			new string in  the string and 
       	 			returns it as a new string value
       	 */
       				   
       	String str3 = "Java is fun and great, Java is good";
       				System.out.println(str3);
       				str3 = str3.replaceFirst("Java","Python");
       				System.out.println(str3);
       				System.out.println("\n"); 
       				
       				str3 = str3.replaceFirst("is good", "iS Good");
    	    		System.out.println(str3);
    	    		System.out.println("\n");    
    	    		
    	String str4 = "Java is programming language, Java is Java ";
    				System.out.println(str4);
    				str4 = str4.replace("Java is J","C# is not j");
    				System.out.println(str4);
	}

}
