package com.override.doubt;

class B2
{
	public void demo()
	{
		System.out.println("k");	
	}
}

public class StaticOverride3 extends B2
{
/*	public static void demo()    //the static method cannot hide the instance method from B2S
	{
		System.out.println("A");	
	}   
	*/
	public static void main(String[] args) 
	{
          B2 a=new StaticOverride3();
          a.demo();
	}
}
