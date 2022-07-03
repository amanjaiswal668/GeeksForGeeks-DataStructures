package com.amanjaiswal.gfgdsacourse.string;

public class PatternSearchingNaiveApproach {

	static String s = "ABCABCD";
	static String p = "ABCD";

	void naivePattern(String s, String p) {

//		Approach :- 
//		calculate the v, to run a loop from 0 to v for input Text.
//		Run other loop from  0 to length of pattern.
//		Keep iterating till the character at i != character at j.
//		If so, rerun the loop.
//		Print the index, if j == length of pattern.

		int v = s.length() - p.length();
		for (int i = 0; i <= v; i++) {
			int j;
			for (j = 0; j < p.length(); j++) {
				if (p.charAt(j) != s.charAt(i + j)) {
//					System.out.println(i);
					break;
				}
			}
			if (j == p.length()) {
				System.out.println(i + " ");
			}
		}
	}

	void EfficientNaivePattern(String s, String p) {

//		Approach :- 
//		calculate the v, to run a loop from 0 to v for input Text.
//		Run other loop from  0 to length of pattern.
//		Keep iterating till the character at i != character at j.
//		If so, rerun the loop.
//		Print the index, if j == length of pattern.

//		In efficient approach, we increment the value of i by i + j.
//		As the characters are already matched and distinct,
//		they would never match again with different characters

		int v = s.length() - p.length();
		for (int i = 0; i <= v;) {
			int j;
			for (j = 0; j < p.length(); j++) {
				if (p.charAt(j) != s.charAt(i + j)) {
//					System.out.println(i);
					break;
				}
			}
			if (j == p.length()) {
				System.out.println(i + " ");
			}
			if (j == 0) {
				i++;
			} else {
				i = i + j;
			}
		}
	}

	public static void main(String[] args) {

		PatternSearchingNaiveApproach psna = new PatternSearchingNaiveApproach();
		psna.naivePattern(s, p);
		psna.EfficientNaivePattern(s, p);
	}

}
