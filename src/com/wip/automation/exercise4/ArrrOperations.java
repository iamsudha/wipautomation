package com.wip.automation.exercise4;

import java.util.Arrays;

public class ArrrOperations {
  public static void main(String[] args) { // int [] arr = new int[10];
    int[] arr = {20, 300, 40, 50, 1000, 87};

    char[] array1 = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
    char[] array2 = new char[7];
    ArrayCopy(array1, array2);
    int sum1 = SumofArray(arr);
    System.out.println(sum1);
    MinmaxArray(arr);
    PrintReverseArray(arr);
    arr = ReverseArrayinPlace(arr);
    

  }

  // printarry
  static void PrintReverseArray(int[] arr) {
    System.out.println("\n" + "Reverse of array elements is:");
    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.println(arr[i]);
    }
  }


  // arraycopy
  static void ArrayCopy(char[] copyFrom, char[] copyTo) {
    System.out.println("\n" + "Copyofelements starting from 3rd character to 8th of:" + Arrays.toString(copyFrom));
    System.arraycopy(copyFrom, 2, copyTo, 0, 7);
    System.out.println(copyTo);
  }

  // minmaxarray

  static void MinmaxArray(int[] arr1) {

    int min = arr1[0];
    int max = arr1[0];
    for (int i = 0; i < arr1.length; i++) {
      if (arr1[i] < min) {
        min = arr1[i];
      } else if (arr1[i] > max) {
        max = arr1[i];
      }
    }
    System.out.println("\n"+"The minimum in the arr::" + min);
    System.out.println("The maximum in the arr::" + max);
  }

  // sum of array
    static int SumofArray(int[] array22) {
    int sum = 0;
    System.out.println("\n" + "Sum of array " + Arrays.toString(array22)+"elements is:");
    for (int i = 1; i < array22.length; i++) {
      sum = sum + array22[i];
    }
    return sum;
  }

  // ReverseArrayinPlace

  static int[] ReverseArrayinPlace(int[] arr) {
    System.out.println();
    System.out.println("\n" + "Start Reverse of Array");
    System.out.println("Input Array is " + Arrays.toString(arr));
    for (int i = 0; i < arr.length; i++) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
    System.out.println("Output Array is " + Arrays.toString(arr));
    return arr;
  }

}

