package JavaDataStructure.Sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSort {
	
	
		public static void merge(int []arr,int lb, int mid, int ub) {
			
			//first take two subarrays and copy data
			//left subarray and right subarray
			int l = mid - lb + 1;
			int r = ub - mid;
			
			int[] leftArray = new int[l];
			int[] rightArray = new int[r];
			
			//copy data to their respective arrays
			//left sub array data
			for(int i=0;i<l;i++) {
				leftArray[i] = arr[i+lb];
			}
			
			//right subarray data
			for(int i=0;i<r;i++) {
				rightArray[i] = arr[i+mid+1];
			}
			
			int k = lb;//index for merged array
			
			int i=0,j=0; // index for left and right subarray respectively
			while(i < l && j < r) {
				
				if(leftArray[i] <= rightArray[j]) {
					arr[k] = leftArray[i];
					i++;
				}
				else {
					arr[k] = rightArray[j];
					j++;
				}
				k++;
				
			}
			
			//cpoying remaining elements of leftarray if any 
			while(i<l) {
				arr[k] = leftArray[i];
				i++;
				k++;
			}
			
			//copying remaining elements of rightarray if any
			while(j<r) {
				arr[k] = rightArray[j];
				j++;
				k++;
			}
			
			
		}
	
		public static void sort(int[] arr,int lb,int ub) {
			
			if(lb < ub) {
				int mid = (lb + ub) / 2;
				
				sort(arr,lb,mid);
				sort(arr,mid+1,ub);
				
				merge(arr,lb,mid,ub);
			}
			
		}

	//driver method to test above
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of elements of an array");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		MergeSort obj = new MergeSort();
		
		for(int i=0;i<n;i++) {
			arr[i] = rn.nextInt(100);
		}
		
		System.out.println(Arrays.toString(arr));
		
		obj.sort(arr,0,n-1);
		
		System.out.println("\nSorted Array is ");
		System.out.println(Arrays.toString(arr));
	}

}
