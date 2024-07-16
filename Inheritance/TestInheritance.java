package Inheritance;

//single level inheritance 
//when a class inherits another class, it is known as single level inheritance

class Animal{
	
	int age = 5;
	void eat() {
		System.out.println("Animal is Eating");
	}
}

class dog extends Animal{
	
	void bark() {
		System.out.println("Dog is barking");
	}
	String name = "Mougli";
	
}

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dog obj = new dog();
		obj.eat(); //we can access parent methods and properties
		obj.bark();
		System.out.println(obj.name);
		System.out.println("Dog is "+obj.age+" years old");
		
		
	}

}
