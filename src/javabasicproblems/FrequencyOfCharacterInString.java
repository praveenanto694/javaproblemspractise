package javabasicproblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FrequencyOfCharacterInString {

	public static void main(String[] args) 
	{
		
		String input = "banana";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		
		for(Character c: input.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		
		System.out.println(map);
		
	}
	
	

}
