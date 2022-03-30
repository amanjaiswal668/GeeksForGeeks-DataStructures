package com.amanjaiswal.gfgdsacourse.matrix;

public class BoundaryElementMatrix {

	static int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
//	Output : - 1,2,3,4,8,12,16,15,14,13,9,5 => Prints all the element at the boundary.

	void BoundaryElement(int arr[][]) {

		int R = 4;
		int C = 4;

		for (int i = 0; i < C; i++) {
			System.out.println(arr[0][i]);
		}
		for (int i = 1; i < R; i++) {
			System.out.println(arr[i][C - 1]);
		}
		for (int i = C - 2; i >= 0; i--) {
			System.out.println(arr[R - 1][i]);
		}
		for (int i = R - 2; i >= 1; i--) {
			System.out.println(arr[i][0]);
		}

	}

	public static void main(String[] args) {

		BoundaryElementMatrix bem = new BoundaryElementMatrix();
		bem.BoundaryElement(arr);
	}

}
