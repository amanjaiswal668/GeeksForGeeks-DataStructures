package com.amanjaiswal.gfgdsacourse.string;

public class SubSequenceOfString {
	static String str = "ABCDE";
	static String subStr = "ABC";

	Boolean validSubsequence(String str, String sub) {

		int j = 0;

		for (int i = 0; i < str.length() && j < sub.length(); i++) {
			if (str.charAt(i) == sub.charAt(j)) {
				j++;
			}
			if (j == sub.length()) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		SubSequenceOfString sss = new SubSequenceOfString();
		Boolean x = sss.validSubsequence(str, subStr);
		System.out.println(x);
	}

}
