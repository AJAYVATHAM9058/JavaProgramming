package JavaDataStructure.BasicPrograms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FindLargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		
		System.out.println("Enter no of elements of an array");
		int n = sc.nextInt();
		int []array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = rn.nextInt(1000);
		}
		
		int smallest = array[0], largest = array[0];  // Initializing smallest and largest values with first element of the array
		
		System.out.println(Arrays.toString(array));
		
		for(int i: array) {
			if(i < smallest) {
				smallest = i;
			}
			if(i > largest) largest = i;
		}
		
		System.out.println("Smallest Number "+smallest);
		System.out.println("Largest Number "+largest);
		
	}

}
