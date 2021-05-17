package com.exception;

class A
{
	public void demo() 
	{
		System.out.println("Hello");
	}
}

class B extends A
{ 
	public void demo()  throws ArrayIndexOutOfBoundsException
	{
		System.out.println("Welcome");
	}
	
}

public class Exception1 
{
	public static void main(String[] args)
	{
		A a=new B();
		a.demo();
	}
}
