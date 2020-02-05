package com.InnerClass;
//Accessing inner class code from instance area of outer class
public class MemberInnerClass2
{
	class Inner
	{
		public void m1()
		{
			System.out.println("Inner class method");
		}
	}
	public void m2()
	{
		System.out.println("Outer Class Method");
		Inner i=new Inner();
		i.m1();
	}
	public static void main(String[] args)
	{

		MemberInnerClass2 m=new MemberInnerClass2();
            m.m2();
	}
}
