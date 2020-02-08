package com.InnerClass;
//If we declare inner class inside static method then from that method local inner class we can access only static member of outer class 
//directly from that method local inner class

//CTError in this program because of accessing non static member from inner class created inside static method 
public class MethodLocalInnerClass11
{
	int x=10;
	static int y=20;
	public static void demo()
	{
		class Inner
		{
			public void demo2()
			{ 
				System.out.println(x+" "+y); //cannot make a static reference to the non static field  (CTE on x)
			}

		}
		Inner i=new Inner();
		i.demo2();
	}
	public static void main(String[] args)
	{
		MethodLocalInnerClass11 m=new MethodLocalInnerClass11();
		m.demo();
	}
}
