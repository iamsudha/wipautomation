package com.wip.automation.exercise7;

public class AddOperator implements Operator {
  public int execute(int num1, int num2) {
    return num1 + num2;
  }

  @Override
  public String toString() {
  return getClass().toString();
   
  }
}
