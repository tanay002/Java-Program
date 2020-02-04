package com.constructor;

public class Constructor5
{                        
	public Constructor5(int i) 
	{ this();
		System.out.println("Parametrized");
	}
	
	public Constructor5() 
	{
		System.out.println("Default");
	}
	public static void main(String[] args) 
	{ 
		System.out.println("Start");
		Constructor5 c1=new Constructor5(10);
		System.out.println("End");
	}
}
