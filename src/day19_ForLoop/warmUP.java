package day19_ForLoop;

import java.util.Scanner;

public class warmUP {
	public static void main(String[] args) {
		
		/*
		  warmup task:
    Given:  username: cybertek.batch12@gmail.com
            password: Javengers
    write a program for the login functionality of the gmail account. (user input is required)
        - username can be entered either in upper or lower case
        - password MUST be entered as it is
        - if the username does not end with "@gmail.com":
                    print "it's not a valid email"
        - if username ends with gmail but username or password did not match:
                    print "Invalid username or password"
        - if the username and passwords are correct:
                    print "loged in successfully"
		 
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your usename:");
		String user = input.nextLine().toLowerCase();
		
		System.out.println("Enter your password:");
		String pswd = input.nextLine();
		
		String username = "sabir@gmail.com";
		String password = "Java";
		
		
		if (user.endsWith("@gmail.com")) {
			if (user.equalsIgnoreCase(username) && pswd.equals(password) ) {
				System.out.println("Loged in successfully");
			}	else if( !user.equalsIgnoreCase(username) && !pswd.equals(password) ){
					System.out.println("Both username or password are incorrect");
			}else if (!user.equalsIgnoreCase(username)) {
					System.out.println("username is incorrect");
			}	else System.out.println("password is incorrect");
			
		}else
			System.out.println("It is not a valid username");
	}

}
