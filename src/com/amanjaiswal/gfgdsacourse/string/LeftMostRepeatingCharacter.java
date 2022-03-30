package com.amanjaiswal.gfgdsacourse.string;

public class LeftMostRepeatingCharacter {

	static final int CHAR = 256;
	static String a = "ABCBD";

	int repeatingCharacter(String s) {
		int count[] = new int[CHAR];

		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (count[s.charAt(i)] > 1) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {

		LeftMostRepeatingCharacter lmrc = new LeftMostRepeatingCharacter();
		int x = lmrc.repeatingCharacter(a);
		System.out.println(x);
	}

}
