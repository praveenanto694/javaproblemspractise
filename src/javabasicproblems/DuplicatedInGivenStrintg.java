package javabasicproblems;

import java.util.Collections;
import java.util.LinkedHashSet;

public class DuplicatedInGivenStrintg {

	public static void main(String[] args) 
	{
		String input = new String("Helloo");
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		Character[] objChar = new Character[input.length()];

		
		for(int i = 0;i <input.length(); i++)
		{
			objChar[i] = input.charAt(i);
		}
		
		Collections.addAll(set, objChar);
		
		System.out.println(set);
	}

}