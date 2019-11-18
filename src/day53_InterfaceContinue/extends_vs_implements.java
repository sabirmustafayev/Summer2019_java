package day53_InterfaceContinue;

interface B {
	
	void method3();
	
	
}

public interface extends_vs_implements extends B { // between two interface we do not impelement but extend
	           // subtype                   //superType
	void method1(); // public
	void method2(); // public
	
	//
	

}

class A implements extends_vs_implements{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}
	
	
}

class D extends A implements extends_vs_implements { //we can use extends and implement keyword at the same time
	
} 

abstract class C implements extends_vs_implements{ //abstract class can only have abstract methods
	
}