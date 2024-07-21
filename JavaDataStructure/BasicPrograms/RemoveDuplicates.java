package JavaDataStructure.BasicPrograms;

//java program to implement remove duplicates from an array 

import java.util.*;
public class RemoveDuplicates {
	
	public static int RemoveDuplicatesArray(int[] arr){
		int n = arr.length;
		
		if(n==0 || n==1)return n;
		
		int[] temp = new int[n];
		int j=0;
		
		for(int i=0;i<n-1;i++) {
			
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
			
		}
		
		temp[j++] = arr[n-1];
		//Changing the original array
		for(int i=0;i<j;i++) {
			arr[i] = temp[i];
		}
		return j;
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		System.out.println("Enter Number of elements in an array");
		int n = sc.nextInt();
		int arr[] =  new int[n];
		
		//taking array elements using random class
		for(int i=0;i<n;i++) {
			arr[i] = rn.nextInt(10);
		}
//		int[] arr = {1,2,5,4,1,2,8,5};

		System.out.println(Arrays.toString(arr)); //printing array elements
		
		Arrays.sort(arr);
		int m = RemoveDuplicatesArray(arr);
		
		//System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<m;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}