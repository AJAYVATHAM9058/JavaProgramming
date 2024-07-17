package JavaDataStructure;
//Binary Search algorithm using iterative search
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {

	private static int binarySearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		int lb = 0,ub = arr.length-1,mid;
		
		while(lb<ub) {
			mid = lb + (ub - lb) / 2;
			if(arr[mid] == target) return mid;
			if(arr[mid] > target) ub = mid - 1;
			if(arr[mid]<target) lb = mid + 1;
		}
		
		return -1;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements of array");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		Random rn = new Random();
		for(int i=0;i<n;i++) {
			arr[i] = rn.nextInt(100);
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter target to find");
		int target = sc.nextInt();
		
		//Binary Search
		int result = binarySearch(arr,target);
		
		System.out.println(result==-1?" "+target+" is not present in the array":" "+target+" is present at index "+result);
		
	}
	

	

}
