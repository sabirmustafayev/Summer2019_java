package day53_InterfaceContinue;

public interface Interface_VS_AbstractClass {
	
	// Access-modifier className(){ } this is the constructor
	//we can not create constructor in interface because construct name should be as same as class name. but interface is not class
	
	
	public abstract void method1();
	public abstract int method2();
	
	//***********************************************************************************************************************
	public void method3(); // if we even do not write abstract keyword, interface accept this method as ABSTRACT Method
	void method4(); //// if we even do not write access modifiers, interface accept this method as PUBLIC Method
	//***********************************************************************************************************************
	
	//protected abstract void method5();
	//public protected abstract void method5();
	
	//int a; // this gives compile error because, as a default int a is public static final variable
	        // so if it is final we have to initialize as we create it such as int a = 10;
	
	int a = 10;
	
	public static void main(String[] args) {
		System.out.println(a); // because a is static variable in interface
		System.out.println(Interface_VS_AbstractClass.a); // also we can "a" varibale by it's interface name
		
		//Interface_VS_AbstractClass obj = new Interface_VS_AbstractClass();
		
		//Interface is nor class, abstraction is not concrete, but object has to be concrete
	}
	
	/*class Test implements Interface_VS_AbstractClass {

		@Override
		public void method1() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int method2() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void method3() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void method4() {
			// TODO Auto-generated method stub
			
		}
		
	}*/

}
