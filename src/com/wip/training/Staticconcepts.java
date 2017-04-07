package com.wip.training;
public class Staticconcepts {
    public static void main(String args[]){
      Student s1 = new Student();
      s1.showData();
      Student s2 = new Student();
      s2.showData();
      Student.b++;
      s1.showData();
   }
 }

 class Student {
 int a; //initialized to zero
 static int b; //initialized to zero only when class is loaded not for each object created.

   Student(){
    //Constructor incrementing static variable b
    b++;
   }

    public void showData(){
       System.out.println("Value of a = "+a);
       System.out.println("Value of b = "+b);
    }
    /*throws exception here as a is non-static variable and static method can access only static variables
 public static void increment(){
  a++;
 
 }*/

 }


