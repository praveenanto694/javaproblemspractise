package javabasicproblems;

import java.util.Scanner;

public class PalindromeCheck {

  public static void main(String[] args) {

    String input;
    int length;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the string to check for Palindrome");

    while (true) {
      input = sc.nextLine();

      input = input.toLowerCase();
      if (input.equalsIgnoreCase("exit")) 
      {
        System.out.println("Exiting...");
        break;
      }
      String rev = "";
      length = input.length();

      for (int i = length - 1; i >= 0; i--) {
        rev = rev + input.charAt(i);
      }

      System.out.println("The Original String is : " + input);
      System.out.println("The reversed String is : " + rev);

      if (rev.equals(input)) {
        System.out.println("The string is a palindrome");
      } else {
        System.out.println("The string is not a palindrome");
      }

      input = "";
    }

  }

}