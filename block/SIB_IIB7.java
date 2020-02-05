package com.block;

class Demoo
{
	Demoo()
	{
		System.out.println("Parent Demo");
	}
	static
	{
		System.out.println("SIB-1");
	}

	static
	{
		System.out.println("SIB-2");
	}

	{
		System.out.println("IIB-1");
	}

	{
		System.out.println("IIB-2");
	}
}
public class SIB_IIB7 extends Demoo
{

	static
	{
		System.out.println("SIB-Child");
	}

	{
		System.out.println("IIB-Child");
	}
	public SIB_IIB7()
	{
		System.out.println("Child Constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		SIB_IIB7 s=new SIB_IIB7();
		System.out.println("End");
	}
}
