package com.InnerClass;
//we can use any access specifier and modifier in inner class
public class MemberInnerClass4
{
	private int i=20;
	class Inner
	{
		public void m1()
		{
			System.out.println("Inner class method "+(i+10));
			Inner2 i=new Inner2();
			i.m3();
		}
		class Inner2
		{
			public void m3()
			{
				System.out.println("Inner Class 2 method "+(i+10));
			}
		}

	}
	public void m2()
	{
		System.out.println("Outer Class Method"+i);
		Inner i=new Inner();
		i.m1();
	}
	public static void main(String[] args)
	{

		MemberInnerClass4 m=new MemberInnerClass4();
		m.m2();
	}
}
