package com.amanjaiswal.gfgdsacourse.recursion;

public class SubSetString {

	static void returnString(String s, String current, int index) {
		if (s == null) {
			System.out.println("Null value inside String s, " + s);
		} else if (index == s.length()) {
			System.out.println(current + " ");
			return;
		}

		returnString(s, current, index + 1);
		returnString(s, current + s.charAt(index), index + 1);
	}

	public static void main(String[] args) {

		String s = "ABC";
		returnString(s, "", 0);

	}

}
