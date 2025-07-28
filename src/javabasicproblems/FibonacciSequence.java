package javabasicproblems;

public class FibonacciSequence {

	public static void main(String[] args) 
	{
		int count = 3;

		int first = 0;
		int second = 1;
		int third;
		System.out.print(first+", "+second);

		if(count <= 2)
		{
		}
		else
		{
			for(int i = 0;i <count-2;i++)
			{
				third = first + second;
				System.out.print(", "+third);
				first = second;
				second = third;
			}
		}
	}
}
