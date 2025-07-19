package javabasicproblems;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) 
	{
		String ss1 = "listen";
		String ss2 = "silent";
		
		char[] ss1array = ss1.toCharArray();
		char[] ss2array = ss2.toCharArray();
		
		Arrays.sort(ss1array);
		Arrays.sort(ss2array);
		
		if(Arrays.equals(ss1array, ss2array))
			System.out.println("The given strings are anagram");
		else
			System.out.println("The given strings are not an anagram");
	}

}