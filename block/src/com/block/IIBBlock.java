package com.block;

class Task2
{
	{
		System.out.println("MyTask 1");
		
	}
	
	{
		System.out.print("MyTask 2");
		
	}
}

public class IIBBlock extends Task2
{
	int i;
	
	{
		System.out.println("Helo");
	}
	
	{
		System.out.println("OKKK");		
	}
	
	IIBBlock()
	{
		System.out.println("MyDefault-Constructor");
	}
	
	IIBBlock(int i)
	{
	this();
		System.out.println("My IIB-Parameterized Constructor");
		this.i=i;
	}
	public static void main(String[] args) 
	{
     IIBBlock b=new IIBBlock();
     System.out.println("Executed");
     IIBBlock b1=new IIBBlock(10);
	}
}
