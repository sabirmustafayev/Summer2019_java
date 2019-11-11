package day48_MethodOverRiding;

class Mahriban{
	void methodA() { // the method we are going to override Must be inheritable to the sub class
		System.out.println("Method A");
	}
	
	public String methodB() {
		
		return "B";
	}
	
	protected double salary(double bonus) {
		
		return bonus + 100000;
	}
	

}


public class AccessModifiers extends Mahriban {
	
	public static void main(String[] args) {
		
	}
	
	protected double salary(double bonus) { // overriding
		 return bonus + 200000;
	}
	
	/*
	 @Override 
	 private void MethodA(){
	 	System.out.println("Method A");
	 }
	 
	 override method' access modifiers need to be same or more visible
	 */
	
	@Override
	public void methodA() {
		System.out.println("MEthod A");
	}
	
	@Override
	public String methodB() {
		return "Overriding B";
	}

}
