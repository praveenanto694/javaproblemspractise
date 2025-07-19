package javabasicproblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfStingAndFilter 
{

	public static void main(String[] args) 
	{
		  List < String > input = Arrays.asList("banana", "orange", "banana", "apple", "apple", "banana", "orange", "lime", "pomo", "banana", "orange");

		  System.out.println(input);

		  Map < String, Long > map = input.stream()
		    .collect(Collectors.groupingBy(
		      Function.identity(),
		      Collectors.counting()));

		  System.out.println(map);

		  
		  //Optional<Map.En>
		  //map.entrySet().stream().sorted(Map.Entry. < String, Long > comparingByValue().reversed()).findFirst();

		  System.out.println(map);

		  /*Map<String, Integer> map = new HashMap<String, Integer>();
		  
		  for(String s: input)
		  {
		  	map.put(s, map.getOrDefault(s, 0)+1);
		  }
		  
		  System.out.println(map);
		  
		  */

		}

}