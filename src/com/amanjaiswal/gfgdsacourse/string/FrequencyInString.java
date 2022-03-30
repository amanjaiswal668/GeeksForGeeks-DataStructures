package com.amanjaiswal.gfgdsacourse.string;

public class FrequencyInString {

	static String a = "geeksforgeeks";

	void countFrequency(String s) {
		int count[] = new int[26];

		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < 26; i++) {
			if (count[i] > 0) {
				System.out.println((char) +(i + 'a') + " -- " + count[i]);
			}
		}
	}

	public static void main(String[] args) {

		FrequencyInString fis = new FrequencyInString();
		fis.countFrequency(a);
	}

}
