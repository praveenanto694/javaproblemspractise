package javabasicproblems;

public class SplitStringandReverseWords {

	public static void main(String[] args) 
	{
		String input = "Automation with Selenium is fun";
		
		String[] splitArray = input.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = splitArray.length -1; i >= 0 ; i--)
		{
			sb.append(splitArray[i]+" ");
		}
		
		System.out.println(sb.toString());
		
	}

}
