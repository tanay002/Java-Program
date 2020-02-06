package com.InnerClass;

class Outerr
{
	class Inner
	{
		class SuperInner
		{

			public void demo2()
			{
				System.out.println("Inner demo");
			}
			public void demo21()
			{
				System.out.println("Inner 2 demo");
			}
		}
	}
}

public class MemberInnerClass5 
{ 
	public static void main(String[] args)
	{
	   new Outerr().new Inner().new SuperInner().demo2();
	   
	   Outerr o=new Outerr();
	    Outerr.Inner i=o.new Inner();
	    Outerr.Inner.SuperInner s=i.new SuperInner();
	    s.demo21();
	   
	}
}
