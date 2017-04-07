package com.wip.training;

public class sumof100even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int sum = 0;

		while (i <= 100) {

			if (i % 2 == 0) {
				sum = sum + i;
			}
			i++;

		}
		System.out.println(sum);

	}
}