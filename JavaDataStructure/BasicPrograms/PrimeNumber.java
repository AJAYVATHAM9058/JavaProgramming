
//Java Program to demonstrate to check if a number is Prime number or not
//Brute force method
package JavaDataStructure.BasicPrograms;
import java.util.*;
public class PrimeNumber {

	public static boolean isPrime(int n) {
		int i;
		for(i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rn  = new Random();
		int n = rn.nextInt(1,1000); // this is the number to check prime , we are taking some random number
		System.out.println("Given Number is "+n);
		boolean Prime = isPrime(n);
		
		if(Prime) {
			System.out.println("Prime Number");
		}
		else System.out.println("Not a Prime Number");
		
	}

}
