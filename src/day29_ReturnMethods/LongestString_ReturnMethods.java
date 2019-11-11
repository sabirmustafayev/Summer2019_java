package day29_ReturnMethods;

public class LongestString_ReturnMethods {

	public static void main(String[] args) {
		
		String arr[] = {"123", "1234", "12345","123456"};
		//String str = longestString(arr);
		System.out.println(longestString(arr));
	}
	
	   public static String longestString(String aarray[])
	    {
	    	int maxlength = 0;
	    	String LongestString = "";
	    	
	    	for (String str : aarray) {
				if(str.length() > maxlength)
				{ maxlength = str.length(); LongestString = str;}
			}
	    	return LongestString;
	    }
}
