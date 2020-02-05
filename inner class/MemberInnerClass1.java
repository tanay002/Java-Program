package com.InnerClass;
//Accessing inner class code from static are of outer class
public class MemberInnerClass1 
{
	class Inner
	{
		public void m1()
		{
			System.out.println("Inner class method");
		}
	}
  public static void main(String[] args)
  {

	  MemberInnerClass1 m=new MemberInnerClass1();
	MemberInnerClass1.Inner i=m.new Inner();
	i.m1();
	
/*	or    (Same way and same output)
	
	MemberInnerClass1.Inner i2=new MemberInnerClass1().new Inner();
	i2.m1();
	
	or
          new MemberInnerClass1().new Inner().m1();*/
}
}
