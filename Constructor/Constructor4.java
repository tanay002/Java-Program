package com.constructor;

public class Constructor4
{                        
	public Constructor4(int i) 
	{
		System.out.println("Parametrized");
	}
	
	public Constructor4() 
	{
		this(10);
		System.out.println("Default");
	}
	public static void main(String[] args) 
	{ 
		System.out.println("Start");
		Constructor4 c1=new Constructor4();
		System.out.println("End");
	}
}
