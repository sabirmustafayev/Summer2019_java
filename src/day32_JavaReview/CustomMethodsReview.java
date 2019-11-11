package day32_JavaReview;

public class CustomMethodsReview {
	/*
	 decleration of methods:
	    	Access-modifiers--specifier--return type--methodName(parameter){
	    	            
	    	            method body
	    	
	    	}
	    	Access-modifiers: public
	    	specifier: static
	    	return type: void, all primitives and non-primitives
	    	methodName: anyName
	    	parameter: all data type
	    	
	    	1.if the return type of the method is void: method does not return any value
	    	2.if the return type of the method is NOT void: the method MUST return a value, and the returning value MUST match with return type
	    	3.method that process parameter (with argument): method requires extra informations to perform it's task
	    		 
	 */
	
	public static void main(String[] args) {
		
		//*********VOID Method*******************
		method1(); // method give some sentence on conse screen
		oneTo100Even();// method gives all even numbers from 1 to 100
		
		System.out.println();
		//*********VOID Method with Parameters (Arguments)*******************
		ReverseStr("Sabir"); // "Sabir" is argument. it is related to str parameter inside of ReverseStr(String Str)
		//         Argument
		
		System.out.println();
		//*********INT Method with  Parameters (Arguments)*******************
		int a = largestNumber(12,13);
		System.out.println(a);
		

		// *********String Method with Parameters (Arguments)*******************
		String str = Reverse("Mustafayev Sabir");
		System.out.println(str);
	}	
	
	//*********VOID Method*******************
	public static void method1(){
		System.out.println("Hello Wrold!");
		System.out.println("Hello Cybertek");
		System.out.println("Hello Batch12");
		System.out.println("Hello OnlineTeam06");
		System.out.println("HEllo Sabir");
		
	}
	
	public static void oneTo100Even() {
		
		for (int i = 1; i < 101; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
			
		}
		
		
	}
	
	//*********VOID Method with Parameters (Arguments)*******************
	public static void ReverseStr(String str) { // str is parameter, ir is related to "Sabir" argument. ReverseStr("Sabir")
		
		for (int i = str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	
	//*********Return Methods with int Parameters (Arguments)*******************
	public static int largestNumber (int a ,int b) {
		
		int max = 0;
		 if (a > b) 
			max = a;
		
		
		 else
			 max = b;
		 
		 return max;
			 
	}
	
	// *********Return Methods with String Parameters (Arguments)*******************
	
	public static String Reverse(String str) {
		
		String result  = "";
		
		for (int i = str.length()-1;i >=0; i--) {
			//result += str.substring(i,i+1);
			result += str.charAt(i);
		}
		return result;
	}


}
