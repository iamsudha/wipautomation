package com.wip.automation.exercise5;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Calculator calc = new Calculator();

    int sum = calc.sumofIntegers(10, 20);
    System.out.println(sum);

    int prod = calc.prodofIntegers(40, 50);
    System.out.println(prod);

    int sub = calc.subtractionofIntegers(90, 50);
    System.out.println(sub);

    int mod = calc.modofIntegers(66, 8);
    System.out.println(mod);

    int div = calc.divisionofIntegers(66, 8);
    System.out.println(div);

    int sqr = calc.squareofNumber(9);
    System.out.println(sqr);

    Circle cir = new Circle(5);
    System.out.println(Circle.count);



  }

}
