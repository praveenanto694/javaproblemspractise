package javabasicproblems;

public class NoOfOccuranceOfCharinString {

	public static void main(String[] args) 
	{
		String input = "hello";
		
		for(int i=0;i<input.length();i++)
		{
			int temp = 1;
			for(int j=i+1;j<input.length();j++)
			{
				if(input.charAt(i) == input.charAt(j))
				{
					temp++;
				}
			}
			System.out.println(input.charAt(i) +" : " + temp);
		}

	}

}