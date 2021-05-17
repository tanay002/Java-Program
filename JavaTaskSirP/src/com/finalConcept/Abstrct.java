package com.finalConcept;

abstract class A
{
	A()
	{
		//no use
	}
	public abstract void demo();
	/*	private abstract void demo22();
	default abstract void demo33();       */
	public void demo2()
	{
		System.out.println("ddd");	
	}

	public static void demo3()
	{
		System.out.println("ddd");	
	}

	public final void demo4()
	{
		System.out.println("ddd");	
	}
	public void demo5() {}
}


public class Abstrct
{
	public static void main(String[] args) 
	{ 
        final int k;
      // public int k; only final is applicable
      //  System.out.println(k);
        System.out.println("hello");
	}
	
	public static void main(int[] args) 
	{
        final int k;
      // public int k; only final is applicable
      //  System.out.println(k);
        System.out.println("hello2");
	}
}
