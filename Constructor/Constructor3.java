package com.constructor;

public class Constructor3
{                        
	public Constructor3(int i) 
	{
		System.out.println("Parametrized");
	}
	public static void main(String[] args) 
	{ 
		System.out.println("Start");
		//	Constructor3 c=new Constructor3();
		Constructor3 c1=new Constructor3(10);
		System.out.println("End");
		//CTE if we create parametrized constructor so compiler will not create any default constructor implicitly,so we have two
		//1.) Call only parametrized constructor which we have created
		//2.)or create default constructor
	}
}
