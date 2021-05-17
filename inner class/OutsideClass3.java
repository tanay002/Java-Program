package com.inner.classes;

//Case 3 Accessing inner class from outside of outer class

class Outer3
{
	void test()
	{
		System.out.println("Test is demo");
		Inner i=new Inner();
		i.demo();
	}
	class Inner
	{ 
		void demo()
		{    
			System.out.println("Demo is memo");
			
		}
	}
}
public class OutsideClass3
{
	public static void main(String[] args) 
	{
      Outer3 o=new Outer3();
o.test();
	}
}
