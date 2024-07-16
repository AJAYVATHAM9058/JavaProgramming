package Inheritance;

//Using Super keyword 

class SuperClass{
	
	private int age;
	SuperClass(int age){
		this.age = age;
	}
	
	public void getAge() {
		System.out.println("The age of the person is "+age);
	}
}

public class SubClass extends SuperClass{

	SubClass(int age){
		super(age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubClass obj = new SubClass(23);
		obj.getAge();
	}

}
