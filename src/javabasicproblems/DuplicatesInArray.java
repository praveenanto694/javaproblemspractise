package javabasicproblems;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesInArray 
{

	public static void main(String[] args) 
	{
		String input = "Java";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0;i<input.length();i++)
		{
			map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0) + 1);
		}
		
		for(Map.Entry<Character, Integer> m: map.entrySet())
		{
			Character temp = m.getKey();
			if((temp == 'a' ||temp == 'e' ||temp == 'i' ||temp == 'o' ||temp == 'u') && m.getValue() > 1)
			{
					System.out.println(m.getKey() + " " );
			}
		}

	}

}
