package JavaDataStructure.BasicPrograms;
//java program to find  n th fibonacci number

import java.util.*;

public class FibonacciExample {

	public static int fibonacci(int n) {
		
		int first = 0;
		int second = 1;
		int third = 0;
		
		if(n==1) {
			System.out.print(0);
		}
		if(n==2) {
			System.out.print(1);
		}
		
		if(n>2) {
		for(int i=2;i<n;i++) {
			third  = first + second;
			first = second;
			second = third;
		}
		
	  }
		return third;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rn = new Random();
		
		int n = rn.nextInt(1,100);
		System.out.println(n+" th term of fibonacci series is ");
		int result = fibonacci(n);
		System.out.println(result);
		
	}
}
