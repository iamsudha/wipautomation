package com.wip.training.types;

public class rectangle {

	private int length;
	private int width;

	public int area() {
		return length * width;
	}

	public rectangle(int len, int wid) {
		length = len;
		width = wid;
	}

	public void printDetails() {
		System.out.println("length of the rectangle is: " + length);
		System.out.println("width of the rectangle is: " + width);

	}

}
