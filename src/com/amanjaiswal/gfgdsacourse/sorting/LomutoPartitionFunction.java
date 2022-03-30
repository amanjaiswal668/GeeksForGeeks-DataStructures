package com.amanjaiswal.gfgdsacourse.sorting;

public class LomutoPartitionFunction {

//	NOTE: - In Lomuto, we assume that pivot is always the last element.

	static int arr[] = { 10, 80, 30, 90, 40, 50, 70 };

	int lomutoPartition(int arr[], int start, int end) {

		int pivot = arr[arr.length - 1];

		int i = start - 1;

//		Compare a[i] and pivot, if small then swap the a[i]and a[j].	
		for (int j = start; j < arr.length; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
//		At last swap the a[i+1] with a[end].
		int temp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = temp;
		return i + 1;
	}

	public static void main(String[] args) {
		LomutoPartitionFunction lp = new LomutoPartitionFunction();
		int v = lp.lomutoPartition(arr, 0, 6);
		System.out.println("Pivot index is :- " + v);
	}

}
