package com.block;

class Demo
{
	static
	{
		System.out.println("k");
	}
	
	static
	{
		System.out.println("k-n");
	}
}
public class SIBBlock2 extends Demo
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
