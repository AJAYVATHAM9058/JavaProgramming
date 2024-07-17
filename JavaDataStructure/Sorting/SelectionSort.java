package JavaDataStructure.Sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// java program to implement selection sort
//It is a simple sorting technique
public class SelectionSort {

	public static void sort(int[] arr,int n) {
		
		//One by one move boundary of unsorted array
		
		for(int i=0;i<n-1;i++) {
			
			//find the minimum element in unsorted array
			int min_idx = i;
			for(int j=i+1;j<n;j++) {
				
				if(arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}
			
			//swapping the found minimum element with first element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
			
		}
	}
	
	
	//driver program
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of elements of an array");
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		SelectionSort obj = new SelectionSort();
		
		for(int i=0;i<n;i++) {
			arr[i] = rn.nextInt(100);
		}
		
		System.out.println(Arrays.toString(arr));
		obj.sort(arr,n);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));
		
	}

}
