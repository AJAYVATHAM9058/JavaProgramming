package JavaDataStructure.BasicPrograms;
//Java Program to implement Addition of two matrices
import java.util.*;
public class MatrixAddition {

	public static void printMatrix(int [][]mat1,int[][] mat2,int[][] res,int n) {
	
		//It is for printing all the matrices in same line or same  order	
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat1[i][j]+"  ");
			}
			System.out.print("      ");
			for(int j=0;j<n;j++) {
				System.out.print(mat2[i][j]+"  ");
			}
			System.out.print("      ");
			for(int j=0;j<n;j++) {
				System.out.print(res[i][j]+"  ");
			}
			
			System.out.println();
			
		}
		
		
//		for(int i=0;i<n;i++) {
//		  for(int j=0;j<n;j++) {
//		   System.out.print(mat[i][j]+" ");
//		  }
//		  System.out.println();
//		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		System.out.println("Enter Order of 1 st matrix");
		
		int n = sc.nextInt();
		System.out.println("Enter order of 2 nd matrix");
		int m = sc.nextInt();
		
		int [][]matrix1 = new int[n][n];
		int [][]matrix2 = new int[m][m];
		int [][]resultMat = new int[n][n];
		
		
		if(n!=m)System.out.println("Matrix addition is not possible");
		else {
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					matrix1[i][j] = rn.nextInt(10);  //taking matrix elements using random class
					matrix2[i][j] = rn.nextInt(10);  // taking matrix elements using random class
				}
			}
			System.out.println("First Matrix");
//			printMatrix(matrix1,n);
			System.out.println("\n Second Matrix");
//			printMatrix(matrix2,m);
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					resultMat[i][j] = matrix1[i][j] + matrix2[i][j];
				}
			}
			
			System.out.println("Addition of  1st and 2nd  Matrix is ");
			printMatrix(matrix1,matrix2,resultMat,n);
		}

	}

}
