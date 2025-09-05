package arraysdemo;

/**
 * Author  : Shozaib.Zulfiqar
 * Date    : Sep 2, 2025
 * Time    : 11:57:35 AM
 * Project : CoreJava
 */

public class MatrixAddition {

	public static void main(String[] args) {
		// define two 2 x 3 matrices

		int[][] matrix1 = {
				{1, 2, 3},
				{4, 5, 6}

		};

		int[][] matrix2 = {
				{7, 8, 9} , 
				{10 , 11, 12}
		};
		int rows = matrix1.length;
		int cols = matrix1[0].length;

		int[][] result = new int [rows][cols];

		//perform matrix addition
		for(int i = 0 ; i < rows ; i ++) {
			for (int j = 0 ; j < cols ; j++ ) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];

			}
		}

		//		display result
		for(int i = 0 ; i < rows ; i ++) {
			for (int j = 0 ; j < cols ; j++ ) {
				System.out.print(result[i][j] + " ");

			}
			System.out.println();
		}

	}

}
