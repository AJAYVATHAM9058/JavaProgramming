package Inheritance;

//Multiple Inheritance in Java through class
//Now it throws a Compile_Time_Error
// So there is an ambiguity of which method will execute if both classes have same methods

class A{
	void msg() {
		System.out.println("A class");
	}
}

class B{
	void msg() {
		System.out.println("B class");
	}
}


class C extends A,B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C obj = new C();
		obj.msg(); //Now which method it will execute
		
	}

}
