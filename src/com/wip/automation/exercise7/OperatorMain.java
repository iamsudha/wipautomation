package com.wip.automation.exercise7;

public class OperatorMain {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
Operator add = new AddOperator();

System.out.println("sum is " + add.execute(5,8));
System.out.println("Type is " + add.toString());

Operator sub = new SubtractOperator();

System.out.println("result is " + sub.execute(5,8));
System.out.println("Type is " + sub.toString());

Operator mul = new MultiplyOperator();

System.out.println("product is " + mul.execute(5,8));
System.out.println("Type is " + mul.toString());

Operator div = new DivOperator();

System.out.println("divison is " + div.execute(5,8));
System.out.println("Type is " + div.toString());


  }

}
