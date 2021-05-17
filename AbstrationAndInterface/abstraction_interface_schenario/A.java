package com.abstraction;

interface C
{
	void demo();
}

interface B extends C
{
	void demo();
}

abstract class D implements B
{
	public void demo()
	{
		System.out.println("Demo is awsome");
	}
}
public class A extends D
{

	public static void main(String[] args)
	{
          B b= new A();
          b.demo();
	}
}