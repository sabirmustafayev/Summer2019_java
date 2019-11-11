package day45_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;
class credentials {
    
     private String userName;   // admin
     private String passWord;   // 123
     
      String SSN;
 	  String ID;
     
    public  credentials() {
        setuserName("admin");
        setpassWord("123");
    }
    
     // getter: 
     public String getuserName() {
         return userName;
     }
     
     public String getpassWord() {
         return passWord;
     }
     
     // setter:
     public void setuserName(String userName) {
         this.userName = userName;
     }
     
     public void setpassWord(String passWord) {
         this.passWord = passWord;
     }
     
     public void setcredentials(String userName, String passWord ) {
         // this.userName = userName;
         // this.passWord = passWord;
            setuserName(userName);
            setpassWord(passWord);
     }
     
     public void getInfo() {
            System.out.println( "username: " + getuserName() );
            System.out.println( "password: " + getpassWord() );
     }  
}
public class EncapsulationReview {
    
    public static void main(String[] args) {
        credentials Zlfy = new credentials();
        
        //  obj.userName = "Zlfy";   // private is only visible within the class
        //  obj.passWord = "123456"; // private is only visible within the class
        
        // read:
            Zlfy.setcredentials("Zlfy", "111");
        
            System.out.println( "username: "+Zlfy.getuserName() );
            System.out.println( "password: "+Zlfy.getpassWord() );
            
        credentials Nurzat = new credentials();
                    Nurzat.setuserName("9876");
                    Nurzat.setpassWord("nuri345");
            
            System.out.println( "username: "+Nurzat.getuserName());
            System.out.println( "password: "+Nurzat.getpassWord() );
            
        
        credentials Seyfo = new credentials();
            Seyfo.setcredentials("Seyfo", "456");
            Seyfo.setpassWord("789");
        
            Seyfo.getInfo();
            
            System.out.println("==============================================");
        
           //Array 
            credentials[]  users = { Zlfy, Nurzat, Seyfo };
                users[0].getInfo();
                users[1].getInfo();
                users[2].getInfo();
        
        System.out.println("==============================================");
        //Array List   
        ArrayList<credentials>  CredentialsList = new ArrayList<>();
        	        CredentialsList.addAll(Arrays.asList(Zlfy, Nurzat, Seyfo));
            
        for (credentials each : CredentialsList) {
						each.getInfo();
		}
        
    }
}


/*
//class ***********************************************************
class credentials{
	
	private String userName;
	private String passWord;
	
	public String SSN;
	String ID;
	
//constructors
	public credentials() {
		setuserName("admin");
		setpassWord("123");
	}
	
	
	//getter
	
	public String getuserName() {
		return userName;
	}
	
	public String getpassWord() {
		return passWord;
	}
	
	//setter
	
	public void setuserName(String userName) {
		
		this.userName = userName;
	}
	
	public  void setpassWord(String passWord) {
		this.passWord = passWord;
	}
}

// public class **********************************************
public class EncapsulationReview {
	
	// default constructor
	public EncapsulationReview() {
		
		
	}
	
	public static void main(String[] args) {
		
		credentials obj = new credentials();
		System.out.println(obj.SSN); // default instance variable SSN
		System.out.println(obj.ID);  //default instance variable  ID
		
//		System.out.println(userName); // private instance variable userName is not visible to outside the class 
		
		// read -- from getter
		System.out.println(obj.getuserName()); // getuserName() method is public custom metod, through this method we can see private variable userName
		
		credentials Nurzat = new credentials();
			Nurzat.setuserName("NurzatNew");
			Nurzat.setpassWord("123456");
		System.out.println("username: "+ Nurzat.getuserName());
		System.out.println("password: "+Nurzat.getpassWord());
		
		
		
	}

}*/
