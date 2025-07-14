package javabasicproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfStringToUppercase {

	public static void main(String[] args) 
	{
		
		List<String> inputList = new ArrayList<>();
		List<String> outputList = new ArrayList<>();
				
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i<5;i++)
		{
			
			inputList.add(sc.nextLine());
		}
		
		System.out.println("The Input is : " +inputList);
		
		for(String s : inputList)
		{
			outputList.add(s.toUpperCase());
		}
		
		System.out.println("The ouput is : " +outputList);
	}

}
