package com.block;
//Static block executes at the time of class loading only once...It executes before main() method.
public class SIBBlock1 
{
	static
	{
		System.out.println("Hello2");
	}
	static
	{
		System.out.println("Hellon");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
	}
}
