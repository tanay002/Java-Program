package com.override.doubt;

class B1
{
	public static void demo()
	{
		System.out.println("k");	
	}
}

public class StaticOverride2 extends B1
{
	public static void demo()    //Jiska reference uski method..par static parent method and static child method me ...overriding perform nhi hogi
	{
		System.out.println("A");	
	}   
	
	public static void main(String[] args) 
	{
          B1 a=new StaticOverride2();
          a.demo();
	}
}
