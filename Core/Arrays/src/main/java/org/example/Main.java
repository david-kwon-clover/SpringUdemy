package org.example;

public class Main {
  public static void main(String[] args) {

    // DECLARING ARRAY AND INITIALIZING ELEMENTS
    int nums[] = {3, 7, 2, 4};

    // ALTERNATIVE - DECLARING ARRAY AND INITIALIZING SIZE - ALL ELEMENTS DEFAULT TO 0 VALUE
    int otherNums[] = new int[4]; // => {0, 0, 0, 0}

    // FETCH THE FIRST ELEMENT OF THE ARRAY
    System.out.println(nums[0]); // => 3

    // UPDATE THE SECOND ELEMENT
    nums[1] = 6;
    System.out.println(nums[1]); // => 6

    // MULTIDIMENSIONAL ARRAY
    int multiDimensionalArray[][] = new int[3][4]; // => 3 rows 4 columns - all elements default to 0
  }
}