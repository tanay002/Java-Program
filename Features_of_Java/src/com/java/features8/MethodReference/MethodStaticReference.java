package com.java.features8.MethodReference;
interface MyRef
{
void task();	
}
public class MethodStaticReference 
{
	public static void demo2()
	{
		System.out.println("Hello");
	}
public static void main(String[] args)
{
	MyRef r= MethodStaticReference::demo2;
	r.task();
}
}
