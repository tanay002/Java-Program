package com.constructor;

public class Constructor1 
{
	public Constructor1() 
	{
	System.out.println("Default");
	}
	public Constructor1(int i) 
	{
		System.out.println("Parameterized");
	}
	public static void main(String[] args) 
	{
        Constructor1 c=new Constructor1();
        Constructor1 c1=new Constructor1(10);
      
	}
}
