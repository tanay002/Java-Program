package com.InnerClass;

public class MethodLocalInnerClass9
{
	public void demo()
	{
		class Inner
		{
			public int demo2(int i,int j)
			{

				return i+j;
			}

		}
		Inner i=new Inner();
		int k=i.demo2(10,100);
		System.out.println(k);
		k=i.demo2(100,200);
		System.out.println(k);
	}
	public static void main(String[] args)
	{
		MethodLocalInnerClass9 m=new MethodLocalInnerClass9();
		m.demo();
	}
}
