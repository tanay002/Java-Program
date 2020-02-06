package com.InnerClass;

public class MemberInnerClass6 
{
	int i=5;
	class Alpha
	{
		int i=4;
		public void demo()
		{
			int i=10;
			System.out.println(i);
			System.out.println(Alpha.this.i+" Alpha.this.i or this.i=(Same answer) "+this.i);
			System.out.println(MemberInnerClass6.this.i);
		}
	}
	public static void main(String[] args) 
	{
		MemberInnerClass6 m=new MemberInnerClass6();
		MemberInnerClass6.Alpha a=m.new Alpha();
		a.demo();
	}
}
