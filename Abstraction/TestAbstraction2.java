package Abstraction;

abstract class Bike1{
	Bike1(){
		System.out.println("Bike class constructor is invoked");
	}
	
	abstract void run();
	 void changeGear() {
		System.out.println("Bike Gear Changed");
	}	
}

class Honda extends Bike1{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Honda Bike is running");
	}
	void changeGear() {
		System.out.println("Honda Bike gear changed");
	}
	
}


public class TestAbstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike1 obj = new Honda();
		obj.run();
		obj.changeGear();
	}

}
