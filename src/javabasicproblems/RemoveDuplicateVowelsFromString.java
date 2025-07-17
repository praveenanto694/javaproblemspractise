package javabasicproblems;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateVowelsFromString {

	public static void main(String[] args) 
	{
						
		String input = "Heaallooe";
		
		Character[] converted = new Character[input.length()];
		
		for(int i=0;i<input.length();i++)
		{
			converted[i] = input.charAt(i);
		}
		
		Set<Character> out = new LinkedHashSet<>();
		
		Collections.addAll(out, converted);
		
		System.out.println("String after removing duplicates: " +out);
		
		System.out.print("The vowels in the string are: ");
		for(Character c: out)
		{
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				System.out.print(" "+c+",");
			}
		}	

	}

}
