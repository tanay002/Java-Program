package com.constructor;
class Constructor2
{
	private Constructor2()
	{
		System.out.println("Hello");
	}	
}
public class Constructorr1 extends Constructor2
{
	private Constructorr1() 
	{ 
       System.out.println("Hello");
	}
	public static void main(String[] args)
	{
		Constructorr1 c=new Constructorr1();
	}
}
