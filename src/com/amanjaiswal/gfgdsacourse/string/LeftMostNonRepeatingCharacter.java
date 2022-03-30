package com.amanjaiswal.gfgdsacourse.string;

public class LeftMostNonRepeatingCharacter {

	static final int CHAR = 256;
	static String a = "ABCBAD";

	int NonRepeatingCharacter(String s) {
		int count[] = new int[CHAR];

		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (count[s.charAt(i)] == 1) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {

		LeftMostNonRepeatingCharacter nrc = new LeftMostNonRepeatingCharacter();
		int x = nrc.NonRepeatingCharacter(a);
		System.out.println(x);

	}

}
