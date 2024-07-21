package JavaDataStructure.BasicPrograms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		System.out.println("Enter rows and columns of matrix");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int [][]matrix1 = new int[row][col];
		int [][]transpose = new int[col][row];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix1[i][j] = rn.nextInt(10);  //taking matrix elements using random class
			}
		}
			//printin original matrix
		System.out.println("Original Matrix is ");
		for(int i=0;i<row;i++) {
			System.out.println(Arrays.toString(matrix1[i]));
		}
		
		//transposing the matrix
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				if(i!=j) {
					transpose[i][j] = matrix1[j][i];
				}
				else {
					transpose[i][j] = matrix1[i][j];
				}
			}
		}
		
		//printing transpose of the matrix
		System.out.println("\n Transpose of the matrix is ");
		for(int i=0;i<col;i++) {
			System.out.println(Arrays.toString(transpose[i]));
		}
		
	}

}
