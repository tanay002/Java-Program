package com.block;

class Program2
{
	{
		System.out.println("IIB1-P");
	}
	
	{
		System.out.println("IIB2-P");
	}
}
public class IIB_Block4 extends Program2
{
	{
		System.out.println("IIB1-C");
	}
	
	{
		System.out.println("IIB2-C");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		IIB_Block4 i=new IIB_Block4();
		Program2 p=new Program2();
		Program2 p1=new IIB_Block4();	
	}
}
