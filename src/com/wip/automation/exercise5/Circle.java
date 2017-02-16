package com.wip.automation.exercise5;

public class Circle {
  public static int radius;
  public static int count = 0;
  // returns the area of a cirle

  public Circle(int rad) {
    radius = rad;
    System.out.println("print radius " + radius);
    count++;
  }
//returns area of a circle
  double areaofCircle() {
    System.out.println("print radius " + radius);
    double area = 3.14 * radius * radius;
    return area;
  }

  // returns the perimeter of a circle
  double perimeterofCircle() {
    double perimeter = 2 * 3.14 * radius;
    return perimeter;

  }
}


