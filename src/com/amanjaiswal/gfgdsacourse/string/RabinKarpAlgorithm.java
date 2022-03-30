package com.amanjaiswal.gfgdsacourse.string;

public class RabinKarpAlgorithm {

	static String s = "ABCABCD";
	static String p = "ABCD";

	static final int d = 256;
	static final int q = 101;

	void RabinAlgorithm(String s, String pattern) {

//		Step 1 :- Compute the d (^m-1) % q.

		int h = 1;
		for (int i = 1; i < pattern.length() - 1; i++) {
			h = (h * d) % q;
		}

//		Step 2 :- Compute p and tø

		int p = 0;
		int t = 0;
		for (int i = 0; i < pattern.length(); i++) {
			p = (p * d + pattern.charAt(i)) % q;
			t = (t * d + s.charAt(i)) % q;
		}

//		Check for Spurious hit.
		int N = s.length();
		int M = pattern.length();
		for (int i = 0; i <= (N - M); i++) {
			if (p == t) {
				Boolean flag = true;
				for (int j = 0; j < M; j++) {
					if (s.charAt(i + j) != pattern.charAt(j)) {
//						System.out.println(" value of i is :---- " + i);
						flag = false;
						break;
					}
				}
				if (flag == true) {
//					System.out.println(" value of i is :- " + i);
				}
			}

			if (i < N - M) {
//				System.out.print(" value of i is :- = " + i);
				t = ((d * (t - s.charAt(i) * h)) + s.charAt(i + M)) % q;
				if (t < 0) {
					t = t + q;
				}
			}
		}

	}

	public static void main(String[] args) {

		RabinKarpAlgorithm ra = new RabinKarpAlgorithm();
		ra.RabinAlgorithm(s, p);
	}

}
