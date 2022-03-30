package com.amanjaiswal.gfgdsacourse.matrix;

public class SpiralMatrix {
	static int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

	void matrixSpiral(int arr[][]) {
		int R = 4;
		int C = 4;

		int top = 0;
		int left = 0;
		int bottom = R - 1;
		int right = C - 1;

		while (top <= bottom && left <= right) {

			for (int i = left; i <= right; i++) {
				System.out.println(arr[top][i] + " ");

			}
			top++;
			for (int i = top; i <= bottom; i++) {
				System.out.println(arr[i][right] + " ");

			}
			right--;
			if (top <= bottom) {
				for (int i = right; i >= left; i--)
					System.out.print(arr[bottom][i] + " ");

				bottom--;
			}

			if (left <= right) {
				for (int i = bottom; i >= top; i--)
					System.out.print(arr[i][left] + " ");

				left++;
			}
		}

	}

	public static void main(String[] args) {

		SpiralMatrix sm = new SpiralMatrix();
		sm.matrixSpiral(arr); 
	}

}
