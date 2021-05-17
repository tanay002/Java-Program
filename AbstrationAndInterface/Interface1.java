package com.interfacetask;

interface A
{
	public static final int i=10;	
}

interface B
{
	public static final int i=20;	
}


public class Interface1 implements A,B
{
	//int i=30;
	public static void main(String[] args) 
	{
		
		A a=new Interface1();	
		System.out.println(a.i);

		System.out.println(A.i);
		//System.out.println(new Interface1().i);
	}
}
