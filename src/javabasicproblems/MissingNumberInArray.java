package javabasicproblems;

import java.util.HashSet;
import java.util.Set;

public class MissingNumberInArray {

	public static void main(String[] args) 
	{
		int[] input = {1,2,3,6,9};
		
		Set<Integer> setinput = new HashSet<>();
		
		for(int i=0;i<input.length;i++)
		{
			setinput.add(input[i]);
		}
		
		System.out.println(setinput);
		
		for(int j=1;j<input[input.length-1];j++)
		{
			if(!setinput.contains(j))
			{
				System.out.print(j+" ");
			}
		}
	}
}