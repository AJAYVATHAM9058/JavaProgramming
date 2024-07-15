package Abstraction;
//abstract class needs to be extended and its method implemented

abstract class shape{
	abstract void draw();
	void test() {
		System.out.println("Engineering");
	}
}

class Rectangle extends shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Rectangle");
	}
	
}

class Circle extends shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle");
	}
	
}

class Square extends shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Square");
	}
	
}

public class TestAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		shape obj1 = new Rectangle();
		shape obj2 = new Square();
		shape obj3 = new Circle();
		
		obj1.draw();
		obj2.draw();
		obj3.draw();
		
	}

}
