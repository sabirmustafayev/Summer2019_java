package day44_AccessModifiers;

//import static day44_AccessModifiers.Testdata.Name;

//import static day44_AccessModifiers.Testdata.ID;
//                     packagename.classname.staticname

import static day44_AccessModifiers.Testdata.*;

public class Test {
	
	public static String Name = "Muhtar"; // Name variable is create in Test class 
	
	public static void main(String[] args) {
		
		// so we have TWO same "Name" variables one is from Testdata class, one is from Test class 
		// at this case if we want ot print Name staic varibale which is from Testdata clas 
		// we should declare classname and variable such as Testdata.Name; 
		
		System.out.println(Name); // Name static varibale coming from Tesdata class through "import"
		System.out.println(Testdata.Name); // static data is called by its classname
		System.out.println(ID);
		System.out.println(SchoolName); // SchoolName static varibale coming from Tesdata class through "import"
	}

}
