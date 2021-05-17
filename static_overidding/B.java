package com.p;
class C
{
	public static void demo()
	{
		System.out.println("Hello");	
	}
}
class A extends C
{
	public static void demo()
	{
		System.out.println("Bye");	
	}
}
public class B
{
	public static void main(String[] args) {
		
		C c=new A();
		c.demo();
	}
}
