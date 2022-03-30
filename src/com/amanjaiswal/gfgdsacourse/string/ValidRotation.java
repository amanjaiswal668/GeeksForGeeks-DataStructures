package com.amanjaiswal.gfgdsacourse.string;

public class ValidRotation {

	static String s = "ABAB";
	static String p = "ABBA";
	
	static String ss = "ABCD";
	static String pp = "CDAB";

	Boolean CheckValidRotation(String s, String p) {

		String concat = s + s;System.out.println(concat);

		if (s.length() != p.length()) {
			return false;
		} else {
			return (concat.indexOf(p) >= 0);
		}
	}

	public static void main(String[] args) {

		ValidRotation vr = new ValidRotation();
		Boolean validity = vr.CheckValidRotation(s, p);
		Boolean validitys = vr.CheckValidRotation(ss, pp);
		System.out.println(validity);
		System.out.println(validitys);
	}

}
