package JavaDataStructure.BasicPrograms;

import java.util.Random;

public class FactorialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		int n = rn.nextInt(45);
		
		int fact = 1;
		
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial Of "+n+"  is "+fact);
		
	}

}
