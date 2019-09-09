package day12_Switch_Statement;

public class Switch_Statement {
	
	public static void main(String[] args) {
		int score =3;
		//*********************IF--ELseIF----ELSE******************
		if (score==1) {  // must give BOOLEAN expression
			System.out.println("1");
		}
		else if (score==2) {
			System.out.println("2");
		}
		
		//*************SWITCH********************************
		
		switch (score) { // Must give an Expression: data 
		case 1:
			System.out.println("1");
			
			break;

		default:
			System.out.println("Invalid number");;
		}
	}

}
