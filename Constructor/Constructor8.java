package com.constructor;

class Parent1
{
	Parent1()
	{

		System.out.println("Default Parent");
	}

	Parent1(int i)
	{
		System.out.println("Parametrized Parent");
	}
}
class Child1 extends Parent1
{
	Child1()
	{
	
		System.out.println("Default Child");
	}
	Child1(int i)
	{
	
		System.out.println("Parametrized Child");
	}
}

public class Constructor8
{
	public static void main(String[] args) 
	{
   Child1 c=new Child1();
   Child1 c1=new Child1(10);
	}
}
