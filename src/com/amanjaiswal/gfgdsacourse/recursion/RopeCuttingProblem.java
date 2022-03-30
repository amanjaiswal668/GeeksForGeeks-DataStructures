package com.amanjaiswal.gfgdsacourse.recursion;

//	Input class starts

class inputData {

	int n;
	int a;
	int b;
	int c;
	int val;

	int maxValue(int n, int a, int b, int c) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return -1;
		}
		int res = max(maxValue(n - a, a, b, c), maxValue(n - b, a, b, c), maxValue(n - c, a, b, c));
		System.out.println("res at 21  :-   " + res);
		res = res + res;
		System.out.println("res at 23 :====  " + res);
		if (res == -1) {
			System.out.println("not Possible at line 23:- " + res);
			return -1;
		}
		System.out.println("Possible at line 26 :- " + res);
		return 1;
	}

	int max(int max1, int max2, int max3) {
		if (max1 > max2 && max1 > max3) {
			val = max1;
		} else if (max2 > max1 && max2 > max3) {
			val = max2;
		} else if (max3 > max2 && max3 > max1) {
			val = max3;
		} else {
			System.out.println("Not possible at line 38: -" + val);
			return -1;
		}
		System.out.println("Possible at line 41:- " + val);
		return val;
	}
}

//	Input class ends

public class RopeCuttingProblem {

	public static void main(String[] args) {

		inputData id = new inputData();

		id.maxValue(23, 11, 9, 12);
	}

}
