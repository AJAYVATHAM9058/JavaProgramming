package JavaDataStructure.BasicPrograms;

import java.util.Random;

//Java program to convert Decimal to Binary
public class DecToBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		int quotient = rn.nextInt(100);
		System.out.println("Decimal Number is  "+quotient);
		int bin_num[] = new int[100];
		int i=0;
		
		while(quotient != 0) {
			bin_num[i++] = quotient % 2;
			quotient = quotient / 2; 
			
		}
		System.out.println("Binary Number is ");
		for(int j = i-1;j>=0;j--) {
			System.out.print(bin_num[j]+" ");
		}
	}

}
