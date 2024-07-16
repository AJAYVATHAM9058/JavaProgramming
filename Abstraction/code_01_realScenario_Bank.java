/*There are two ways to achieve abstraction in java
 Abstract class (0 to 100%) and Interface 100%
 abstract class needs to be extended and its method implemented
 
*/
package Abstraction;

abstract class Bank{
	abstract int getRateOfInterest();
}

class SBI extends Bank{

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 7;
	}
	
}

class BOI extends Bank{
	int getRateOfInterest() {
		return 5;
	}
}

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank obj = new BOI();
		Bank obj1 = new SBI();
		System.out.println("Bank of India rate of interest is  "+obj.getRateOfInterest());
		System.out.println("State Bank of India rate of interest is  "+obj1.getRateOfInterest());
		
	}

}
