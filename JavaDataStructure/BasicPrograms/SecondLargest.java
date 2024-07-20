package JavaDataStructure.BasicPrograms;

//Java program to implement second largest element

import java.util.*;
public class SecondLargest {

	//Function to return second largest element
	public static int SecondLargestFunction(int[] arr) {
		
		int n = arr.length;
		
		//checking if array has min 2 elements
		if(n<2){
			System.out.println("Invalid Input");
			return -1;
		}
		
		//Arrays.sort(arr);
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			
			//if current element is greater than both first and second, update first and second
			if(arr[i] > first) {
				second = first;
				first = arr[i];
			}
			
			//if current element is in between first and second update second element
			if(arr[i] > second && arr[i] != first) {
				second = arr[i];
			}
			
			
		}
		if(second == Integer.MIN_VALUE) {
			System.out.println("There is no second largest");
			return -1;
		}
		
		return second;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number of elements of an  array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		Random rn = new Random();
		
		for(int i=0;i<n;i++) {
			arr[i] = rn.nextInt(10);
		}
		System.out.println(Arrays.toString(arr));
		
		int secondLargest = SecondLargestFunction(arr);
		if(secondLargest != -1)
		 System.out.println("Second largest element is "+secondLargest);

	}

}
