package JavaDataStructure.BasicPrograms;

import java.util.*;

//Reversing a number

public class ReverseNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rn = new Random();
		int original = rn.nextInt(10000);
		
		System.out.println("Original Number "+original);
		
		int n = original,rem,reverse = 0;
		while(n>0) {
			rem = n % 10;
			reverse = reverse * 10 + rem;
			n =  n / 10;
		}
		System.out.println("Reverse of the "+original+" is  "+reverse);
		
	}

}
