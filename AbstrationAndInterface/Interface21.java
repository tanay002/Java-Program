package com.interfacetask;

interface A1
{
	public static final int i=10;	
}

interface B1 extends A1
{
	public static final int i=20;	
}


public class Interface2 implements B1
{
	int i=30;
	public static void main(String[] args) 
	{
	    B1 a=new Interface2(); 
		System.out.println(a.i);
	}
}
