package com.features.sub;

@FunctionalInterface
interface A
{ 
	public void demo();	
}

public class FunctionalI
{
	public static void main(String[] args) 
	{
		A a=()-> 
		{
			System.out.println("Hello");
		};
		

	}
}
