package Inheritance;

//used to check if reference variable contains given type of object reference or not

interface Animal1{
	default void eat() {
		System.out.println("Eating");
		}
}

class Mammal implements Animal1{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Mammal is eating");
		
	}
	
}

public class UsingInstanceOf extends Mammal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Mammal obj1 = new Mammal();
		UsingInstanceOf obj2 = new UsingInstanceOf();

//		
		if(obj2 instanceof Object) {
			System.out.println("Obj2 is instance of Object");
		}
		else {
			System.out.println("obj2 is not an instance of Object");
		}
		
		if(obj2 instanceof Mammal) {
			System.out.println("obj2 is instance of Mammal");
		}else System.out.println("obj2 is not an instance of Mammal");
		
		if(obj2 instanceof Animal1) {
			System.out.println("obj2 is instance of Animal1 interface");
		}
		else {
			System.out.println("obj2 is not an instance of Animal1 interface");
		}
		
		
	}

}
