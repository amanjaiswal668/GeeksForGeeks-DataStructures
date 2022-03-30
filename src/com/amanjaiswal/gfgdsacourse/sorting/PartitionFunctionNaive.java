package com.amanjaiswal.gfgdsacourse.sorting;

public class PartitionFunctionNaive {

	static int arr[] = { 5, 3, 12, 8, 5 };

//	Naive method to determine the partition index of the array.

	int naivePartition(int arr[], int start, int end, int pivot) {
		int temp[] = new int[end - start + 1];
		int index = 0;

//		Check for the smaller elements than the pivot elements and copy them to a temp array.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr[pivot]) {
				temp[index] = arr[i];
				index++;
			}
		}

//		Execute this for loop for maintaining the stability of the elements, i.e the actual occurrence of the elements
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[pivot]) {
				temp[index] = arr[i];
				index++;
			}
		}

//		Get the index of the pivot element last occurred.
		int res = start + index - 1;
		for (int i = start; i < end; i++) {
			if (arr[i] > arr[pivot]) {
				temp[index] = arr[i];
				index++;
			}
		}

//		Copy all the greater elements after the pivot.
		for (int i = start; i < end; i++) {
			arr[i] = temp[i - start];

		}
		return res;
	}

	public static void main(String[] args) {

		PartitionFunctionNaive pf = new PartitionFunctionNaive();
		int v = pf.naivePartition(arr, 0, 4, 0);
		System.out.println(v);
	}

}
