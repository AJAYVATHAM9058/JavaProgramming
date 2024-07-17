package JavaDataStructure.Sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
	
	public static void sort(int[] arr,int n) {
		
		int temp;
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	//Driver method to test above
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of elements of an array");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		BubbleSort obj = new BubbleSort();
		
		for(int i=0;i<n;i++) {
			arr[i] = rn.nextInt(100);
		}
		
		System.out.println(Arrays.toString(arr));
		
		obj.sort(arr,n);
		
		System.out.println("\nSorted Array is ");
		System.out.println(Arrays.toString(arr));
		
		
	}

}
