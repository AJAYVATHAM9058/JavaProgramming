package Inheritance;

//Now it throws a Compile_Time_Error

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
