package com.iterate.collection;

public class Factorial
{
	public static int factorial(int no,int factmul)
	{
		if(no==0)
		{
			return factmul;
		}
		else
		{
			factmul=factmul*no;
			return factorial(no-1,factmul);
		}
	}
	public static void main(String[] args)
	{
      int fact= factorial(5,1);
      System.out.println(fact);

	}
}
