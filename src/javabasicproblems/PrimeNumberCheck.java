package javabasicproblems;

public class PrimeNumberCheck {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int a= 13457;
		int temp = 0;
		
		for(int i =2;i<a;i++)
		{
			
			System.out.println("Dividing with " +i + "we get the reminder" + a%i);
			if(a%i == 0)
			{
				temp++;
				break;
			}
		}
		
		if(temp == 1)
		{
			System.out.println("This number is not Prime number");
		}
		else
		{
			System.out.println("This number is a Prime number");
		}
		
	}

}
