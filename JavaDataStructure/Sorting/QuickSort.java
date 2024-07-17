package JavaDataStructure.Sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Sorting techniques 
//quick sort number of comparisons is nlogn in average case for an array of n elements

//Java program for implementation of quick sort algorithm

public class QuickSort {

	/* This function takes last element as pivot,
	 * places the pivot at it's right place and 
	 * place all the smaller elements to left of the pivot 
	 * and greater elements to right side of pivot  
	 * 
	 * */
		public static int partition(int[] arr,int low,int high) {
		
		int i = low-1; //index of smaller element
		int pivot = arr[high];
		int temp;
		for(int j=low;j<high;j++) {
			
			//if current element is smaller than or equal to pivot
			
			if(arr[j] <= pivot) {
				i++;
				
				//swapping arr[i] with arr[j]
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		//swapping pivot with arr[i+1]  because i+1 is the correct position for the pivot 
		//left to pivot all are less than and right to pivot all are greater than
		
		temp = arr[i+1];
		arr[i+1] = pivot;
		arr[high] = temp;
		
		return i+1; //returning the correct position of pivot
	}
	
/* Main function that implements quicksort()
	 * 
	 * arr[] --> array to be sorted
	 * lb    --> lower bound
	 * ub   --> upper bound
	 * 
	 * */
	
	public static void sort(int []arr,int lb,int ub) {
		if(lb < ub) {
			/* pi is partitioning index 
			 * arr[pi] is now at right place
			 * */
		int pi = partition(arr,lb,ub);
		
		//recursively sorting array before partition and after partition
		sort(arr,lb,pi-1);
		sort(arr,pi+1,ub);
	   }
	}
	
	//Driver Program
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements of an array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		QuickSort obj = new QuickSort();
		
		for(int i=0;i<n;i++) {
			arr[i] = rn.nextInt(100);
		}
		
		System.out.println(Arrays.toString(arr));
		
		obj.sort(arr,0,n-1);
		
		System.out.println("\nSorted Array is ");
		System.out.println(Arrays.toString(arr));
		
		
	}

}
