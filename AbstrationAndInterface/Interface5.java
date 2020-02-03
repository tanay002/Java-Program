package com.AbstrationAndInterface;

//Multiple Inheritance in Interface
interface Print
{  
	void print();  
}  
interface Show
{  
	void print();  
}  

public class Interface5 implements Print, Show
{
	public void print()
	{
		System.out.println("Hello");
	}  
	public static void main(String args[])
	{  
		Interface5 obj = new Interface5();  
		obj.print();  
	}  
}  

