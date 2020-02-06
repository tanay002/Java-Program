package com.InnerClass;
//we can use any access specifier and modifier in inner class
public class MemberInnerClass7
{   static int j=100;
private int i=20;
final char d='D';
class Inner
{
	public void m1()
	{
		System.out.println("Inner class method "+(i+10));
		System.out.println(d);
		Inner2 i=new Inner2();
		i.m3();
	}
	class Inner2
	{
		public void m3()
		{
			System.out.println("Inner Class 2 method "+(i+10));
			System.out.println(j);
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

	MemberInnerClass7 m=new MemberInnerClass7();
	m.m2();
}
}
