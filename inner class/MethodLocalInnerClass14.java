package com.InnerClass;

public class MethodLocalInnerClass14
{ 
	int i=10;
static int j=20;

public void m1() 
{ 
	int x=30;           
	final int y=40;
	 class Inner
	{ 
		//static int pp=20;
			public /* static */ void m2() 
		{
			System.out.println(i+" "+j);   //we can't declare static method and static variable inside inner class
			System.out.println(x+" "+y);
		}
	}
	Inner i=new Inner();
	i.m2();

}
public static void main(String[] args) 
{
	MethodLocalInnerClass14 m=new MethodLocalInnerClass14();
	m.m1();
}
}
