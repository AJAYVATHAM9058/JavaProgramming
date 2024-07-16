package Inheritance;

/* Hierarchical Inheritance
 * When two or more classes inherits a single class, it is known as Heirarchical Inheritance
 *
 */

class Shape1{
	void draw() {
		System.out.println("Drawing My own diagram");
	}
}

class Circle extends Shape1{
	void colourOfCircle() {
		System.out.println("colour of cirlce is RED");
	}
}

class Square extends Shape1{
	void area() {
		System.out.println("Area of square is side*side");
	}
}

public class TestInheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle();
		Square obj1 = new Square();
		obj.draw();
		obj.colourOfCircle();
		
		//we are accessing parent class methods by both sub classes objects
		obj1.draw();
		obj1.area();
		
	}

}
