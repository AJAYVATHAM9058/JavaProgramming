package JavaDataStructure.Sorting;

//java program for implementation of Insertion Sort

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
	
	//Function to sort array using Insertion sort
	public static void sort(int[] arr,int n) {
		
		for(int i=1;i<n;i++) {
			
			int j = i-1;
			int key = arr[i];
			
			/* move elements of arr[0 ... i-1], that are greater than key,
			 * to one position ahead of their current position
			 * */
			
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j = j - 1;
			}
			
			arr[j+1] = key;
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of elements of an array");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		InsertionSort obj = new InsertionSort();
		
		for(int i=0;i<n;i++) {
			arr[i] = rn.nextInt(100);
		}
		
		System.out.println(Arrays.toString(arr));
		
		obj.sort(arr,n);
		
		System.out.println("\nSorted Array is ");
		System.out.println(Arrays.toString(arr));
	}

}
