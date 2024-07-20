package JavaDataStructure.BasicPrograms;

import java.util.Random;

public class PalindromeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		Random rn = new Random();
		int n = rn.nextInt(1000);
		
		System.out.println(n);
		
		int temp = n;
		int rem = 0, rev = 0;
		
		while(temp >0) {
			rem = temp%10;
			rev = rev*10 + rem;
			temp = temp / 10;
		}
		
		if(rev == n) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not A Palindrome");
		}

	}

}
