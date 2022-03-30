package com.amanjaiswal.gfgdsacourse.arrays;

public class ArayOperations {

//	Creating an array
	int arr[] = new int[5];
	{
//	Inserting elements in an array.

		arr[0] = 10;
		arr[1] = 200;
		arr[2] = 1111;
		arr[3] = 4;
		arr[4] = 50;
	}

//	Search an element in the array.

	void search(int x) {
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == x) {
				System.out.println("Element found at index " + i);
			} else {
				System.out.println("Element not found");
			}

		}
	}

//		Largest element in an array.
	void largest() {
		int res = 0;
		int val = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 1; j <= i; j++) {
				if (arr[i] < arr[j]) {
					i++;
					j++;
				} else if (arr[i] > arr[j]) {
					j++;
				}
				res = arr[j];
			}
			val = arr[i];
		}

		System.out.println("Largest value of i is:--" + val);
		System.out.println("Largest value of j is:--" + res);

	}

//	Efficient Largest array element.

	int efficient() {
		int res = 0;
		for (int i = 0; i <= arr.length -1; i++) {
			if (arr[i] > arr[res]) {
				res = i;
			}
		}
		System.out.println(res);
		return res;
	}

//	Deleting elements form the array.

	int delete(int num) {
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == num)
				break;
			if (i == arr.length - 1) {
				System.out.println(arr.length - 1);
			}
			for (int j = i; j < arr.length - 2; j++) {
				arr[i] = arr[j + 1];
				System.out.println("Element deleted is " + arr[i] + " at index found" + i);
			}
		}
		return (arr.length - 1);
	}

	public static void main(String[] args) {

		ArayOperations ArayOperations = new ArayOperations();
		ArayOperations.search(20);
//		ArayOperations.delete(20);
		ArayOperations.efficient();

	}

}
