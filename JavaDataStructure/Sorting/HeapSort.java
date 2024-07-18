package JavaDataStructure.Sorting;

import java.util.*;

//Java Program to implement heap sort algorithm

/* A Heap is a complete binary tree.
 * Heap sort is a popular and efficient algorithm
 * The concept of heap sort is to eliminate the elements one by one from heap part of the list and then insert into the sorted 
 * of the list.
 * 
 * Root is present at i
 * left child is present at 2*i
 * 
 * */

public class HeapSort {

	//building maxheap
	public static void heapify(int[] arr,int n,int i) {
		
		int largest = i;
	    int left = 2*i + 1;
	    int right = 2*i + 2;
	    int temp;
	    
	    while(left < n && arr[left] > arr[largest]) {
	    	largest = left;
	    }
	    
	    while(right < n && arr[right] >  arr[largest]) {
	    	largest = right;
	    }
	    
	    if(largest != i) {
	    	//swaping arr[largest] with arr[i]
	    	temp = arr[largest];
	    	arr[largest] = arr[i];
	    	arr[i] = temp;
	    	
	    	heapify(arr,n,largest);
	    }
	    
	    
	}
	
	public static void buildHeap(int[] arr,int n) {
		
		//Building heap (rearranging the array)
		
		for(int i=n/2 - 1; i >= 0;i--) {
			heapify(arr,n,i);
		}
		
		for(int i=n-1;i>=0;i--) {
			//swaping arr[0] with arr[i]
			
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			
			heapify(arr,i,0);
			
		}
		
	}
	
	
	//Driver Program
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner and Random class to read input and take array elements random
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		System.out.println("Enter no. of elements of array ");
		int n = sc.nextInt();
		int []arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = rn.nextInt(100);
		}
		
		System.out.println(Arrays.toString(arr));
		
		HeapSort obj = new HeapSort();
		obj.buildHeap(arr,n);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));
		
	}

}
