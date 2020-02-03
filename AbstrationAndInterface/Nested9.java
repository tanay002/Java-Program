package com.AbstrationAndInterface;

abstract class Upper1
{
	interface Lower1
	{
		public abstract void demo1();
	}

}

abstract class Upper2
{
	interface Lower2
	{
		public abstract void demo2();
	}

}

public class Nested9 implements Upper1.Lower1,Upper2.Lower2
{
	public void demo1()
	{
		System.out.println("Demo1");
		
	}
	
	public void demo2()
	{
		System.out.println("Demo2");
		
	}
	public static void main(String[] args)
	{
     Upper1.Lower1 ul=new Nested9();
     ul.demo1();
     System.out.println("");
     Upper2.Lower2 u2=new Nested9();
     u2.demo2();
     System.out.println("");
     Nested9 n=new Nested9();
     n.demo1();
     n.demo2();
	}
}
