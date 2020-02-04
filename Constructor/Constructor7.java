package com.constructor;

class Parent
{
	Parent()
	{

		System.out.println("Default Parent");
	}

	Parent(int i)
	{
		System.out.println("Parametrized Parent");
	}
}
class Child extends Parent
{
	Child()
	{
		super();
		System.out.println("Default Child");
	}
}
public class Constructor7
{
	public static void main(String[] args) 
	{
   Child c=new Child();
	}
}
