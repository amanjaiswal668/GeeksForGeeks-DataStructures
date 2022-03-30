package com.amanjaiswal.gfgdsacourse.string;

public class AnagramString {

	static String a = "silent";
	static String b = "listen";
	static final int CHAR = 256;

	Boolean validAnagram(String a, String b) {

//		Approach : 2

		int count[] = new int[CHAR];
		if (a.length() != b.length()) {
			return false;
		}

		for (int i = 0; i < a.length(); i++) {
			count[a.charAt(i) - 'a']++;
			count[b.charAt(i) - 'a']--;
		}

		for (int i = 0; i < CHAR; i++) {
			if (count[i] != 0) {
				return false;
			}
		}
		return true;
	}

//		Approach : 1
//		Problem with this approach.
//		Need to be resolved.

//		int count[] = new int[26];
//		int value[] = new int[26];
//
//		for (int i = 0; i < a.length(); i++) {
//			count[a.charAt(i) - 'a']++;
//		}
//		for (int i = 0; i < b.length(); i++) {
//			value[b.charAt(i) - 'a']++;
//		}

//		for (int i = 0; i < count.length; i++)
//			if (count[i] == value[i]) {
//				return true;
//			}

	public static void main(String[] args) {

		AnagramString as = new AnagramString();
		Boolean x = as.validAnagram(a, b);
		System.out.println(x);
	}

}
