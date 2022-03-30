package com.amanjaiswal.gfgdsacourse.matrix;

import java.util.Arrays;

public class TransposeMatrix {

	static int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

	void matrixTranspose(int arr[][]) {
		int R = 4;
		int C = 4;
		int[][] temp = new int[R][C];

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				temp[j][i] = arr[i][j];
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

		TransposeMatrix tm = new TransposeMatrix();
		tm.matrixTranspose(arr);
	}

}
