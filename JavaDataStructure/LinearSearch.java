package JavaDataStructure;

import java.util.*;

public class LinearSearch {

	public void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	public int linearSearch(int[] arr,int target) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements of an array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = rn.nextInt(100);
		}
		
		LinearSearch ls = new LinearSearch();
		ls.printArray(arr);
		
		System.out.println("Enter target to find");
		int target = sc.nextInt();
		
		
		int result = ls.linearSearch(arr, target);
		
		if(result != -1) {
			System.out.println(target+" is found at index "+result);
		}
		else {
			System.out.println(target+" is not found");
		}
		
		
	}
	
	
 }
	

