package com.InnerClass;
//Accessing inner class code from outside of outer class
public class MemberInnerClass3
{

	public static void main(String[] args)
	{

		new Outer().new Inner().m1();
		new Outer().m2();
	}
}
class Outer
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
	}

}