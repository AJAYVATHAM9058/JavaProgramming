package Abstraction;

abstract class Bike{
	abstract void run();
}

public class Honda4 extends Bike {
	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello This is run method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj = new Honda4();
		obj.run();
	
	}

}
