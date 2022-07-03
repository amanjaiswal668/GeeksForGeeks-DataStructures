package com.amanjaiswal.gfgdsacourse.string;

public class PalindromeString {

	static String str = "BCCBZZ";

	Boolean checkPalindrome(String s) {

//		Approach 1: -

//		for (int i = 0; i < s.length(); i++) {
//			for (int j = s.length() - 1; j < s.length(); j--) {
//				if (s.charAt(i) == s.charAt(j)) {
//					return true;
//				} else {
//					return false;
//				}
//			}
//		}
//		return true;
//--------------------------------------------------------------------------------------
//		Approach 2 :- 

		int start = 0;
		int end = s.length() - 1;

		while (start < end) {
			if (s.charAt(start) == s.charAt(end)) {
				return true;
			}
			start++;
			end--;
		}
		return false;
	}

	public static void main(String[] args) {

		PalindromeString ps = new PalindromeString();
		Boolean x = ps.checkPalindrome(str);
		System.out.println(x);
	}

}
