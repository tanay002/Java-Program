package com.objectclass;

public class ObjectClass
{
	static int demo()
	{
		try
		{
			int i=10/0;
		//return 20;	
		}
		catch(ArithmeticException e)
		{
		//return 10;	
		}
		
		  finally 
		  { 
		  //return 30; 
		  }
		
			return 90;
	}
	public static void main(String[] args) 
	{
         int g=demo();
         System.out.println(g);
	}
}
