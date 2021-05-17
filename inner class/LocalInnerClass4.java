package com.nested;
class Alpha
{
int x=1000;	
}
public class LocalInnerClass4 extends Alpha
{
	int x=20;

	class Inner
	{
		int x=100;

		public void demo()
		{
			int x=200;	
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(LocalInnerClass4.this.x);
			System.out.println(LocalInnerClass4.super.x);
		}
	}
	
	public static void main(String[] args)
	{
		new LocalInnerClass4().new Inner().demo();
	}
}
