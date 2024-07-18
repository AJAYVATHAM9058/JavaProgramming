package JavaDataStructure.BasicPrograms;

import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println((25.5*3.5-3.5*3.5) / (40.5-4.5));

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
//		Write a Java program to print the area and perimeter of a circle.
		double radius = 7.5;
		System.out.println("Perimeter of circle is "+(2*Math.PI*radius));
		System.out.println("area of circle "+(7.5*7.5*Math.PI));
		
//		2. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
		int a = rn.nextInt(100);
		int b = rn.nextInt(1000);
		int c = rn.nextInt(1200);
		System.out.println("Three numbers are : "+a+"  , "+b+" , "+c);
		double avg = (a + b + c) / 3;
		System.out.println("Their Average is  "+avg);
		
		//Write a java program to convert decimal to binar
		
		
	}

}
