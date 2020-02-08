package com.InnerClass;
//If we declare inner class inside instance method then from that method local inner class we can access both static and non static member of 
//outer class directly

public class MethodLocalInnerClass10
{
	int x=10;
	static int y=20;
	public void demo()
	{
		class Inner
		{
			public void demo2()
			{
				System.out.println(x+" "+y);
			}

		}
		Inner i=new Inner();
		i.demo2();
	}
	public static void main(String[] args)
	{
		MethodLocalInnerClass10 m=new MethodLocalInnerClass10();
		m.demo();
	}
}
