package com.Inheritance;
//Question2
class A
{
	int i=10;
}

class B extends A
{
	void child()
	{
		int i=20;
	}

}

public class Program2
{
	public static void main(String[] args) 
	{
		A a=new B();
		System.out.println(a.i);
	}
}
