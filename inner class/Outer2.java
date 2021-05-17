package com.inner;

public class Outer
{
	 void demo()
	{
	class Inner
		{

		}
	}

	public static void main(String[] args)
	{
		//   Inner i=new Inner();
		//Inner.demo();
		Outer i=new Outer();
		Outer.Inner oi=	i.new Inner();
		oi.demo();
	}
}
