package JavaDataStructure.BasicPrograms;

import java.util.Random;

public class DecToOct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		int num = rn.nextInt(100);
		System.out.println("The decimal number is  "+num);
		int []oct = new int[100];
		int i=0;
		while(num != 0) {
			oct[i++] = num % 8;
			num = num / 8;
		}
		System.out.print("The octal number is  ");
		for(int j=i-1;j>=0;j--) {
			System.out.print(oct[j]+"");
		}
		
	}

}
