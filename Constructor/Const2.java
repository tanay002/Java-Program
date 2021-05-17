package com.pkg;
class A
{
	public A(int i)
	{
		System.out.println(i);
	}
	public A()
	{
		this(10);
		System.out.println("default");	
	}
}
class B extends A
{
	B()
	{
		System.out.println("B default");	
	}
}
public class Const extends A
{
public static void main(String[] args) {
	Const b=new Const();
}
}
