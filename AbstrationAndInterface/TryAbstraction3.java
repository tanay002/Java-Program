package com.practice;
interface One3
{
	 static void demo()
	{
		System.out.println("cool");
	}
}

interface Two3 extends One3
{
	static void demo()
	{
		System.out.println("coolk");
	}
}

public class TryAbstraction3 implements Two3
{
	public void demo()
	{
	System.out.println("cool-33");
	}
	public static void main(String[] args) 
	{
		One3.demo();
		Two3.demo();
	}
}
