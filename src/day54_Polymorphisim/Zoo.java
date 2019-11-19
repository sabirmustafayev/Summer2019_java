package day54_Polymorphisim;

class Animal{
	public void Talk() {
		System.out.println("Animal is talking");
	}
}

class Tiger extends Animal{
	public void Hunt() {
		System.out.println("Tiger is hunting");
	}
	
	public void Talk() { //overriding
		System.out.println("Tiger is talking");
	}
	
}

class Octopus extends Animal{
	public void Swim() {
		System.out.println("Octobus is swimming");
	}
	
	public void Talk() {   //ovirriding
		System.out.println("Octopus is talking >>> gologolo");
	}
	
}

public class Zoo {
	
	Tiger tiger1 = new Tiger();
		Tiger[] Tigers = {tiger1, new Tiger()};
	
	Octopus octopus1 = new Octopus();	
		Octopus[] Octopus = {octopus1, new Octopus()};
		
	Animal               animal =       new Tiger();
// reference type   reference name   reference object
	Animal animal2 = new Octopus();
	
	
	
}
