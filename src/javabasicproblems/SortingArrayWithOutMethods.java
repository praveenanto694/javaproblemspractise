package javabasicproblems;

public class SortingArrayWithOutMethods {

  public static int temp = 0;

  public static void main(String[] args) {
    int[] input = {
      3,
      1,
      5,
      6,
      4
    };

    arrayInDecending(input);

    arrayInAscending(input);

  }

  public static void arrayInDecending(int[] inputArray) {

    System.out.print("The Array sorted to descending Order :");

    for (int i = 0; i < inputArray.length; i++) {
      for (int j = i + 1; j < inputArray.length; j++) {
        if (inputArray[i] < inputArray[j]) {
          temp = inputArray[i];
          inputArray[i] = inputArray[j];
          inputArray[j] = temp;
        }
      }

    }

    for (int i = 0; i < inputArray.length; i++) {
      System.out.print(inputArray[i] + " ");

    }

  }

  public static void arrayInAscending(int[] inputArray) {
    System.out.print("\nThe Array sorted to Ascending Order :");
    
    for (int i = 0; i < inputArray.length; i++) {
      for (int j = i + 1; j < inputArray.length; j++) {
        if (inputArray[i] > inputArray[j]) {
          temp = inputArray[i];
          inputArray[i] = inputArray[j];
          inputArray[j] = temp;
        }
      }

    }

    for (int i = 0; i < inputArray.length; i++) {
      System.out.print(inputArray[i] + " ");

    }

  }
}
