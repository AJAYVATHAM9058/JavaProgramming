package JavaDataStructure.BasicPrograms;

import java.util.*;
public class MatrixMultiplication {

	public static void printMatrix(int [][]matrix,int row,int col) {
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		//System.out.println();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		System.out.println("Enter number of rows and columns of 1 st matrix");
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		System.out.println("Enter number of rows and columns of 2nd matrix");
		int row2 = sc.nextInt();
		int col2 = sc.nextInt();
		
		int [][]mat1 = new int[row1][col1];
		int [][]mat2 = new int[row2][col2];
		int [][]resultMat = new int[row1][col2];
		
		
		if(col1 != row2)
			System.out.println("Matrix multiplication is not possible");
		else {
			
			/* Taking input for first matrix using random function
			 * */
			for(int i=0;i<row1;i++) {
				for(int j=0;j<col1;j++) {
					mat1[i][j] = rn.nextInt(10);
				}
			}
			
			printMatrix(mat1,row1,col1);
			
			/*Taking input for second matrix using random function
			 * */
			
			for(int i=0;i<row2;i++) {
				for(int j=0;j<col2;j++) {
					mat2[i][j] = rn.nextInt(10);
				}
			}
			
			printMatrix(mat2,row2,col2);
			
			for(int i=0;i<row1;i++) {
				
				for(int j=0;j<col2;j++) {
					resultMat[i][j] = 0;
					for(int k=0;k<row2;k++) {
						resultMat[i][j] += mat1[i][k]*mat2[k][j] ;
					}
					
				}
			}
			
			printMatrix(resultMat,row1,col2);
			
			
		}
		
	}

}
