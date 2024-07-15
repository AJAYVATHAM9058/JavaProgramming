package Abstraction;
//abstract class needs to be extended and its method implemented

abstract class shape{
	
	String color;
	//These are the abstract methods
	abstract double area();
	public abstract String toString();
	
	//Constructor
	public shape(String color) {
		this.color = color;
	}
	
	//This is a general method
	public String getColor() {
		return color;
	}
	
	abstract void draw();
	void test() {
		System.out.println("Engineering");
	}
}

class Rectangle extends shape{

	double length,width;
	
	public Rectangle(String color,double length,double width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Rectangle");
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return length*width;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle color is "+super.getColor()+" and Area is "+area();
	}
	
}

class Circle extends shape{

	double radius;
	public Circle(String color,double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle");
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle Color is "+super.color+"  and its area is "+area();
	}
	
}

class Square extends shape{

	double side;
	public Square(String color,double side) {
		super(color);
		this.side = side;
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Square");
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Square color is "+super.color+" and its area is "+area();
	}
	
}

public class TestAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		shape obj1 = new Rectangle("Red",2.0,5.0);
		shape obj2 = new Square("Blue",5.0);
		shape obj3 = new Circle("Cyan",5.0);
		
	//	System.out.println("Rectangle area is "+obj1.area()+" its color is "+obj1.color);
		
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		
		
	}

}
