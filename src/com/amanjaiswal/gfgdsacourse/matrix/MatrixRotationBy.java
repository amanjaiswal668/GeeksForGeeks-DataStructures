package com.amanjaiswal.gfgdsacourse.matrix;

public class MatrixRotationBy {
//	Rotate a matrix by 90 deg.

	static int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

	void rotation(int arr[][]) {

		int R = 4;
		int C = 4;
		int[][] temp = new int[R][C];

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				temp[C - j - 1][i] = arr[i][j];
//				temp[R-j-1][i] = arr[i][j];
			}
		}
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				arr[i][j] = temp[i][j];
			}

		}
		// Loop through all rows.
		for (int[] row : arr)

			// Loop through all columns of current row
			for (int x : row)
				System.out.print(x + " ");

	}

	public static void main(String[] args) {

		MatrixRotationBy mr = new MatrixRotationBy();
		mr.rotation(arr);
	}

}
