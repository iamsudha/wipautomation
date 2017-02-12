package com.wip.automation.exercise4;

public class splitdigits {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String[] digits = new String[] {"zero", "one", "two", "three", "four", "five", "six"};

    int n = 2456;
    // int digit =0;
    while (n != 0) {
      int digit = n % 10;

      System.out.println(digits[digit]);
      n = n / 10;
    }

  }

}
