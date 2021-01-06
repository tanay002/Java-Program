package com.java.features8.default_static;

interface Alpha
{
	default void demo()
	{
		System.out.println("My Demo Method");
	}
	
	default void task()
	{
		System.out.println("My Task");
	}
}
public class DefaultTry1 implements Alpha
{
	public void task()
	{
		System.out.println("Overridede Task method");
	}
	public static void main(String[] args) 
	{
               Alpha a=  new DefaultTry1();
                a.demo();
                a.task();
                  
	}
}
