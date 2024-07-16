package Inheritance;

/* Multi Level Inheritance
 * when there is a chain of inheritance it is known as multilevel inheritance
 * 
 * */

class Animal1{
	void eat() {
		System.out.println("Eating");
	}
}
class Dog1 extends Animal1{
	void bark() {
		System.out.println("Barking");
	}
}

class BabyDog extends Dog1{
	void bite() {
		System.out.println("Biting");
	}
}


public class TestInheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog obj = new BabyDog();
		obj.bark();
		obj.bite();
		obj.eat();
		
		Dog1 obj2 = new Dog1();
		obj2.bark();

	}

}
