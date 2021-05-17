package com.practice;
interface One2
{
	default void demo()
	{
		System.out.println("cool");
	}
}

interface Two2 extends One2
{
	default void demo()
	{
		System.out.println("coolk");
	}
}

public class TryAbstraction2 implements Two2
{
	public void demo()
	{
	System.out.println("cool-33");
	}
	public static void main(String[] args) 
	{
		One2 o=new TryAbstraction2();
		o.demo();
		Two2 t=new TryAbstraction2();
		t.demo();
	}
}
