package Inheritance;

//program to demonstrate IS-A relationship

class Animal{
	
}
class Cow extends Animal{
	
}

class Reptile extends Animal{
	
}

public class TestInheritance5 extends Cow{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal obj = new Animal();
		Cow obj1 = new Cow();
		TestInheritance5 obj2 = new TestInheritance5();
		
		System.out.println(obj instanceof Animal);
		System.out.println(obj1 instanceof Animal);
		System.out.println(obj2 instanceof Animal);
		System.out.println(obj2 instanceof Cow);
		
		
	}

}
