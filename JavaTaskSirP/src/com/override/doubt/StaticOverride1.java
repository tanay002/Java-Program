package com.override.doubt;

class B
{
	public static void demo()
	{
		System.out.println("k");	
	}
}

public class StaticOverride1 extends B
{
/*	public void demo()    //the instance method cannot override the static method from B
	{
		System.out.println("A");	
	}   */
	
	public static void main(String[] args) 
	{
          B a=new StaticOverride1();
          a.demo();
	}
}
