package com.concept_basic;

public class Overloading
{
	int calculate(int x)
	{
		return x+10;
	}
	int calculate(int x,int y)
	{
		return x*y;
	}

	int calculate(int x,int y,int z)
	{
		return x*y*z;
	}

	public static void main(String[]args)
	{
		Overloading o=new Overloading();
		System.out.println(o.calculate(5)+" "+o.calculate(5,7,8)+" "+o.calculate(5,7));
	}
}
