package com.basics.startup;


//we can create object in static block and call any method
//While class loading mainmethod is required if not found it gives RTE (main method  not found)...
public class StaticBlock
{
	public void meth()
	{
		System.out.println("Method call ho gayi");
	}
	static
	{
		StaticBlock b=new StaticBlock();
		b.meth();
		B b1=new B();
		b1.meth2();
	}
	
	public static void main(String[] args) 
	{

	}
}

class B
{
	
	public void meth2()
	{
		System.out.println("Method2 call ho gayi");
	}
}

