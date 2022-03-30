package com.amanjaiswal.gfgdsacourse.matrix;

import java.util.Arrays;

public class MedianOfSortedMatrix {
	static int arr[][] = { { 5, 10, 20, 30, 40 }, { 1, 2, 3, 4, 6 }, { 11, 13, 15, 17, 19 } };

	int sortedMatrixMedian(int arr[][]) {

//		medPos = Median Position.
//		midPos = Middle Position. 

		int R = 3;
		int C = 5;

		int min = arr[0][0];
		int max = arr[0][C - 1];

		for (int i = 1; i < R; i++) {
			if (arr[i][0] < min) {
				min = arr[i][0];
			}
			if (arr[i][C - 1] > max) {
				max = arr[i][C - 1];
			}
		}
		int medPos = (R * C + 1) / 2;

		while (min < max) {
			int mid = (min + max) / 2;
			int midPos = 0;

			for (int i = 0; i < R; i++) {
				int pos = Arrays.binarySearch(arr[i], mid) + 1;
				midPos += Math.abs(pos);
			}

			if (midPos < medPos) {
				min = mid + 1;

			} else {
				max = mid;
			}
		}
		return min;

	}

	public static void main(String[] args) {

		MedianOfSortedMatrix msm = new MedianOfSortedMatrix();
		int x = msm.sortedMatrixMedian(arr);
		System.out.println(x);

	}

}
