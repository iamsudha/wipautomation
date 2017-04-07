//calculate math expressions
package com.wip.training;

import java.util.Scanner;

public class math {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a operator");
		char operator = reader.next().charAt(0);//reads the first character of the user
		System.out.println(operator);
		int result = calc(2, 3, operator);
		System.out.println("The result of the operation is " + result);
	}

	public static int calc(int x, int y, char operator) {
		// TODO Auto-generated method stub
		if (operator == '*') {
			return x * y;
		} else if (operator == '/') {
			return x / y;
		} else {
			return x + y;
		}

	}
}
