package com.wip.training;

import java.util.*;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = input.nextInt();
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println("Not a prime");
				break;
			} 
		}
		System.out.println("Prime number");
		

	}
}