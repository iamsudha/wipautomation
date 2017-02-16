package com.wip.automation.exercise5;

public class Circle {
  public static int radius;
  public static int count = 0;
  // returns the area of a cirle

  public Circle(int rad) {
    count++;

  }

  static void areaofCircle() {
    double area = 3.14 * Circle.radius * Circle.radius;
    System.out.println(area);
  }

  // returns the perimeter of a circle

  static void perimeterofCircle() {
    double perimeter = 2 * 3.14 * Circle.radius;
    System.out.println(perimeter);

  }
}


