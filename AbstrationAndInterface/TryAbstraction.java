package com.practice;
interface One
{
	default void demo()
	{
		System.out.println("cool");
	}
}

interface Two extends One
{
	default void demo()
	{
		System.out.println("coolk");
	}
}

public class TryAbstraction implements Two
{
	
	public static void main(String[] args) 
	{
		One o=new TryAbstraction();
		o.demo();
		Two t=new TryAbstraction();
		t.demo();
	}
}
