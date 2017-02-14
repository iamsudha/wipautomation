package com.wip.automation.exercise5;

public class Calculator {
  // global variables and methods functionality that can be called from main

  static int prodofIntegers(int num1, int num2) {
    int prod = num1 * num2;
    return prod;
  }

  static int sumofIntegers(int num1, int num2) {
    int sum = num1 + num2;
    return sum;
  }


  static int subtractionofIntegers(int num1, int num2) {
    int result = 0;
    if (num1 > num2) {
      result = num1 - num2;
    } else if (num1 < num2) {
      result = num2 - num1;
    } else {
      System.out.println("equal numbers,cannot be subtracted");
    }
    return result;
  }

  static int divisionofIntegers(int num1, int num2) {
    int result = 0;
    if (num1 > num2) {
      result = num1 / num2;
    } else if (num2 > num1) {
      result = num2 / num1;
    } else {
      System.out.println("equal numbers,cannot be divided");
    }
    return result;
  }

  static int modofIntegers(int num1, int num2) {
    int result = 0;
    if (num1 > num2) {
      result = num1 % num2;
    } else if (num2 > num1) {
      result = num2 % num1;
    } else {
      System.out.println("equal numbers,cannot be divided");
    }
    return result;
  }

  static int squareofNumber(int num1) {
    int result = num1 * num1;
    return result;
  }

}


