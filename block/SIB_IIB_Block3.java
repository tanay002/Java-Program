package com.block;

class Program
{
	static
	{
		System.out.println("SIB1-P1");
	}
	
	static
	{
		System.out.println("SIB-P2");
	}
	{
		System.out.println("IIB1-P1");
	}
	
	{
		System.out.println("IIB2-P2");
	}
}
public class SIB_IIB_Block3 extends Program
{
	static
	{
		System.out.println("SIB-C1");
	}
	static
	{
		System.out.println("SIB-C2");
	}
	
	{
		System.out.println("IIB1-C");
	}
	
	{
		System.out.println("IIB2-C");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		SIB_IIB_Block3 i=new SIB_IIB_Block3();
		Program p=new Program();
		Program p1=new SIB_IIB_Block3();
		
	}
}
