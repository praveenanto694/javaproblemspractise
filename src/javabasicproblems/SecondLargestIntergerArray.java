package javabasicproblems;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestIntergerArray {

	public static void main(String[] args) 
	{
		int[] inputArray = {10,5,20,8,20};
		
		Set<Integer> setArray = new TreeSet<>();
		
		for(int i =0;i<inputArray.length;i++)
		{
			setArray.add(inputArray[i]);
		}
		
		System.out.println(setArray);
		
		Iterator<Integer> descendingIterator = ((TreeSet<Integer>) setArray).descendingIterator();
        descendingIterator.next();
        Integer secondToLast = descendingIterator.next(); 
        System.out.println("Second to last value: " + secondToLast);
	}

}