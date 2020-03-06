package com.InnerClass;

public class MethodLocalInnerClass13
{ 
	int i=10;
static int j=20;

public /* static */ void m1()  //if we create static method then we can't access variable "i" because it is non static ..
                                      //and we are accessing from static block
{ 
	int x=30;           // Cannot make a static reference to the non-static field "i"  (if m1 method is static)
	final int y=40;
	class Inner
	{
		public void m2() 
		{
			System.out.println(i+" "+j);   //we can access i j x y variable from method of inner class
			System.out.println(x+" "+y);
		}
	}
	Inner i=new Inner();
	i.m2();

}
public static void main(String[] args) 
{
	MethodLocalInnerClass13 m=new MethodLocalInnerClass13();
	m.m1();
}
}
