package javabasicproblems;

public class NumberINReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 3456;
		int temp,value = 0;
		while(num != 0)
		{
			temp = num % 10;
			num /= 10;
			value = value * 10 + temp;
			System.out.println(value);
		}
		
	}
}