package com.wip.automation.exercise7;

public class MultiplyOperator implements Operator {
  public int execute(int num1, int num2) {
    return num2 * num1;
  }

  @Override
  public String toString() {
  return getClass().toString();
   
  }
}