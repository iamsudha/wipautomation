package com.wip.automation.exercise4;

public class arrroperations {
	public static void main(String[] args) { // int [] arr = new int[10];
		int[] arr = { 20, 300, 40, 50, 1000, 87 };
		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.println(arr[i]);
		}

		// arraycopy

		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		char[] copyTo = new char[7];

		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		System.out.println(new String(copyTo));

		// minmaxarray

		int[] arr1 = { 20, 300, 40, 50, 1000, 87 };
		int min = arr1[0];
		int max = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] < min) {
				min = arr1[i];
			} else if (arr1[i] > max) {
				max = arr1[i];
			}
		}
		System.out.println("The minimum in the arr::" + min);
		System.out.println("The maximum in the arr::" + max);

		// sum of array
		int[] arr2 = { 20, 300, 40, 50, 1000, 87 };
		int sum = 0;

		for (int i = 1; i < arr.length; i++) {
			sum = sum + arr2[i];
		}
		System.out.println(sum);
	}

}
