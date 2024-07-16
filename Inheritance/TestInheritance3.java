package Inheritance;
//Single levl inheritance example using multiple methods

class Calculation{
	int c;
	public void addition(int a,int b) {
		c = a + b;
		System.out.println("The sum of "+a+" and "+b+"  is "+c);
	}
	public void subtraction(int a,int b) {
		c = a - b;
		System.out.println("The subtraction of "+a+" and "+b+" is "+c);
	}
}

class My_Calculation extends Calculation{
	int c;
	public void multiplication(int a, int b) {
		c = a * b;
		System.out.println(a+" x "+b+"  = "+c);
	}
}

public class TestInheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My_Calculation obj = new My_Calculation();
		obj.addition(15, 25);
		obj.subtraction(99, 58);
		obj.multiplication(25, 35);

	}

}
