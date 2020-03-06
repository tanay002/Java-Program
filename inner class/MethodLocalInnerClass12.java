package com.InnerClass;

public class MethodLocalInnerClass12 
{
//from method local inner class we can access local variables of the method in which we declare inner class
	public void m1()
	{ 
		int x=10;  //final variable also can be accessed
		final int y=10;
		class Inner
		{
			public void m2() 
			{
				System.out.println(x); 
				System.out.println(y);
			}
		}
		Inner i=new Inner();
		i.m2();

	}
	public static void main(String[] args) 
	{
		MethodLocalInnerClass12 m=new MethodLocalInnerClass12();
		m.m1();
	}
}
