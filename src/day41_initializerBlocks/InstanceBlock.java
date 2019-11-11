package day41_initializerBlocks;

public class InstanceBlock {
	
	{
		System.out.println("Instance Block1");
	}
	
	{
		System.out.println("Instance Block2");
	}
	
	{
		System.out.println("Instance Block3");
	}
	
	/*public InstanceBlock() {
		
		System.out.println("Constructor");
	}*/
	
	public static void main(String[] args) {
		
		InstanceBlock obj = new InstanceBlock();
		System.out.println("========================");
		InstanceBlock obj2 = new InstanceBlock();
		System.out.println("========================");
		InstanceBlock obj3 = new InstanceBlock();
	}

}
