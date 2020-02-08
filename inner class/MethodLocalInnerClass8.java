package com.InnerClass;

public class MethodLocalInnerClass8 
{
	public void demo()
	{
		class Inner
		{
			public void demo2()
			{

				System.out.println("Demo2");
			}

		}
		System.out.println("Demo1");
		Inner i=new Inner();
		i.demo2();
	}
	public static void main(String[] args)
	{
     MethodLocalInnerClass8 m=new MethodLocalInnerClass8();
     m.demo();
	}
}
