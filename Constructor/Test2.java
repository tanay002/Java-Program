package com.constructor;

public class Test2 
{
	static 
	{
		Test2 t=new Test2();
		System.out.println("SIB");
	} 
	static
	{
		System.out.println("SIB-2");
	}
	{
		System.out.println("Good");		
	}

	Test2(){ System.out.println("Best");}

	Test2(int i)
	{
		this(20,10);
		System.out.println("xyz");
	}

	Test2(int i,int j)
	{ 
		this("Lala");
		System.out.println("abc");
	}
	Test2(String j)
	{
		this();
		System.out.println(j);
	}

	{
		//	Test2 t=new Test2();
		System.out.println("interview");
	}

	public static void main(String[] args) 
	{
		Test2 t=new Test2(10);

	}

}
