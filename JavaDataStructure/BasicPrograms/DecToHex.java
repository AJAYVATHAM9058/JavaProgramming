package JavaDataStructure.BasicPrograms;

import java.util.Random;

//java program to convert decimal to hexadecimal
public class DecToHex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rn = new Random();
		int num = rn.nextInt(1000);
		System.out.println("Given Number is "+num);
		int id;
		char []hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String hex_dec = "";
		while(num!=0) {
			id = num % 16;
			hex_dec =  hex[id] + hex_dec;
			num = num / 16;
		}
		
		System.out.println("Hexadecimal number is "+hex_dec);
		
	}

}
