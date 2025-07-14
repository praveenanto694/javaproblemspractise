package javabasicproblems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class VowelsInString {

	public static void main(String[] args) 
{
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Enter the input");
			
			String input = sc.nextLine() ;
			String toLowerCase = input.toLowerCase();
			
			Set<Character> setvar = new HashSet<>();
			
			
			for(int i=0;i<toLowerCase.length();i++)
			{
				char c = toLowerCase.charAt(i);
				if(c== 'a' || c== 'e' || c== 'i' || c== 'o'|| c== 'u')
				{
					setvar.add(c);
				}
			}
			
			if(setvar.isEmpty())
			{
				System.out.println("There are no vowels in the statement");
			}
			else
			{
				System.out.println("The vowels in the statement are : "+setvar);
			}
		}
	}

}
