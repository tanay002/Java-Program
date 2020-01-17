package com.polymorphism_concept;

public class OverloadingCT1
{
	void meth(int i)
	{
		System.out.println(i);
	}

	void meth(int i,int j)
	{
		System.out.println(i*j);
	}

	void meth(int i,int j,int k)
	{
		System.out.println(i*j*k);
	}

	public static void main(String[] args) 
	{
		OverloadingCT1 o=new OverloadingCT1();
		o.meth(3);
		o.meth(3,4);
		o.meth(3,4,5);
	}
}
