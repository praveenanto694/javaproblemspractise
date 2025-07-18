package javabasicproblems;

import java.util.LinkedList;

public class RemoveDuplicateVowelsFromString {

	  public static void main(String[] args) {

	    String input = "Heaallooe";

	    LinkedList < Character > list = new LinkedList < Character > ();

	    for (int i = 0; i < input.length(); i++) {
	      char
	      var = input.charAt(i);
	      if (!(var == 'a' ||
	          var == 'e' ||
	          var == 'i' ||
	          var == 'o' ||
	          var == 'u')) {
	        list.add(var);
	      }
	    }

	    StringBuilder sb = new StringBuilder();

	    for (char c: list) {
	      sb.append(c);
	    }

	    System.out.println(sb.toString());
	  }

	}
