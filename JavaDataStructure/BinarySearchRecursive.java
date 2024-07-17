package JavaDataStructure;

//Binary Search is used only on sorted array
//Binary Search implemented only on sorted arrays, if the array is not sorted we have to make the array sorted
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearchRecursive {

	private static int binarySearchRec(int[] arr,int lb,int ub,int target) {
		
		if(lb <= ub) {
		int mid = lb + (ub - lb) / 2;
		
		if(arr[mid] == target) {
			return mid;
		}
		if(arr[mid] > target) {
			return binarySearchRec(arr,lb,mid-1,target);
		}
		return binarySearchRec(arr,mid+1,ub,target);
		
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Elements of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		Random rn = new Random();
		for(int i=0;i<n;i++) {
			arr[i] = rn.nextInt(100);
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter target");
		int target = sc.nextInt();
		
		int result = binarySearchRec(arr,0,arr.length-1,target);
		
		if(result != -1) {System.out.println(target+" is found at index "+result);}
		else {System.out.println(target+" is not present in the given array");}
		
	}

}
