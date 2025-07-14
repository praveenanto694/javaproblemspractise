package javabasicproblems;

public class SwappingNumbersofTwoVariables {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int a=3,b=5,c;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("Result after swapping with 3rd variable");
				
		System.out.println("a is no : "+a + "  " +"b is now : "+b );
		
		System.out.println("Result after swapping the same without 3rd variable");
		
		a = a + b;
		b = a -b;
		a = a - b;
		
		System.out.println("a is no : "+a + "  " +"b is now : "+b );

	}

}
