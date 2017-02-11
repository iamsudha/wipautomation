package com.wip.automation.exercise4;

public class printstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java";
		for (int i = 0; i <= str.length()-1; i++) {

			char aChar = str.charAt(i);
			System.out.println(aChar+",");
		}

	}

}
