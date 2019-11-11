package day50_Abstraction;

public class Dog extends Animal{
	/*
	 Super class CONSTRUCTOR must be called in sub class
	 Contructor is only called by another constructor
	 so that is why we create CONSTRUCTOR in Dog clas 
	 
	 */
	public Dog(char Gender, byte Age, String color, String NickName) { //Dog CONSTRUCTOR
		super(Gender, Age, color, NickName);
	}
	
	//ABSTRACT method must be implemented
	
	@Override
	public void Speak(String language) {
		System.out.println(Nickname+" speask "+language+" Language");
	
	}

	@Override
	public void Eat(String food) {
		System.out.println(Nickname+" eats "+food);
		
	}

	@Override
	public void Sleep(int hour) {
		System.out.println(Nickname+" sleeps "+hour+" hours");
		
	}

	@Override
	public void Drink(String drinks) {
		System.out.println(Nickname+" drinks "+drinks);
		
	}

}
