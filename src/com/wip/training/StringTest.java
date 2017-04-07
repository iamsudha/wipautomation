package com.wip.training;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "moom";
		String rev_str = "";

		for (int i = 0; i < str.length(); i++) {
			// rev_str=add(str.charAt(i));
			rev_str = rev_str+str.charAt(i);
		}
		System.out.println(rev_str);
		System.out.println(str);
		if (str.equals(rev_str)) {
			System.out.println("Given string is a Palindrome");
		} else {
			System.out.println("Not a Palindrome");

		}
	}
}
