package com.amanjaiswal.gfgdsacourse.sorting;

public class QuickLomutoSort {

	static int arr[] = { 8, 4, 7, 9, 3, 10 };

	int lomutoQuickSort(int arr[], int start, int end) {

		return lomutoSort(arr, start, end);
	}

	int lomutoSort(int arr[], int start, int end) {
		int pivot = arr.length - 1;
		int i = start - 1;

//		Compare a[i] and pivot, if small then swap the a[i]and a[j].
		for (int j = start; j < arr.length; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

//			At last swap the a[i+1] with a[end].
			int temp = arr[i + 1];
			arr[i + 1] = arr[end];
			arr[end] = temp;
			return i + 1;
		}
		return 1;
	}

	public static void main(String[] args) {

		QuickLomutoSort qls = new QuickLomutoSort();
		int x = qls.lomutoQuickSort(arr, 0, 5);
		System.out.println("value after the quick sort :- " + x);
	}

}
