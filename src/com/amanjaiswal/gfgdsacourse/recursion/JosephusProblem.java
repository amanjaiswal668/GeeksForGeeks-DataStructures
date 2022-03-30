package com.amanjaiswal.gfgdsacourse.recursion;

public class JosephusProblem {

	Object josephus(int person, int pos) {
		if(person == 1) {
			System.out.println("Person 1 kills himself.");
		}else {
			 person = person + (pos-1);
			 return josephus((person-1), pos);
			 
		}
		return pos;
	}
	
	public static void main(String[] args) {

		
		
	}

}
