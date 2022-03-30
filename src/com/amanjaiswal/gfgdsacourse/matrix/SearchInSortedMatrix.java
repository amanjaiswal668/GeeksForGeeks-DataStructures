package com.amanjaiswal.gfgdsacourse.matrix;

import java.util.Arrays;

public class SearchInSortedMatrix {

	static int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };

	void sortedMatrixSearch(int arr[][], int num) {
		int R = 4;
		int C = 4;

		int top = 0;
		int left = 0;
		int bottom = R - 1;
		int right = C - 1;

		while (top <= bottom && left <= right) {

			if (num == arr[top][right]) {
				System.out.println(arr[top][right]);
				System.out.println("Found at (" + top + ", " + right + ")");
				return;
			}

			else if (num < arr[top][right]) {
				right--;
			} else if (num > arr[top][right]) {
				top++;
			}

		}
	}

	public static void main(String[] args) {

		SearchInSortedMatrix ssm = new SearchInSortedMatrix();
		ssm.sortedMatrixSearch(arr, 29);
	}

}
