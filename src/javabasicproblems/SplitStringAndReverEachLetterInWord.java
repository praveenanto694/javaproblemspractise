package javabasicproblems;

public class SplitStringAndReverEachLetterInWord {

	public static void main(String[] args) {

		String input = "welcome to java";
		
		String rev;
		
		String[] splited = input.split(" ");
		
		for(String s: splited)
		{
			rev = "";
			for(int i = s.length()-1;i >= 0;i--)
			{
				rev += s.charAt(i);
			}
			System.out.print(rev+" ");
		}
		
	}

}
