package com.amanjaiswal.gfgdsacourse.matrix;

public class SnakePatterMatrix {
	static int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

	void snakeMatrix(int arr[][]) {
		int R = 4;
		int C = 4;
		for (int i = 0; i < R; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < C; j++) {
					System.out.println(arr[i][j] + " ");
				}
			} else {
				for (int j = C - 1; j >= 0; j--) {
					System.out.println(arr[i][j] + " ");
				}
			}
		}
	}

	public static void main(String[] args) {

		SnakePatterMatrix spm = new SnakePatterMatrix();
		spm.snakeMatrix(arr);
	}

}
