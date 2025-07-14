package javabasicproblems;

import java.util.Scanner;

public class ReverseStingUsingJava {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String reverse = "";
		char a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Input");
		String inputLine = sc.nextLine();
		
		for(int i =0;i< inputLine.length();i++)
		{
			a = inputLine.charAt(i);
			reverse = a + reverse;
		}
		
		System.out.println(reverse);
	}

}