package day43_JavaRecap;

public class staticKeyword {
	
	String Insname = "Filiz";
	static String StaName = "Nurzat";
	
	public static void printName() { // static method
		
		//System.out.println(InsName); //static only accepts static
		System.out.println(StaName); //static only accepts static

	}
	public void printName2() { // 
		
		System.out.println(Insname);
		System.out.println(StaName); //class members are always accepted
		System.out.println(staticKeyword.StaName);
	}
}
