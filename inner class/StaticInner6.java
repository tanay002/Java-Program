package com.nested;

public class StaticInner6 
{
	static class InnerClass
	{
		static int j=90;
		static void demo()   //can't access until we create static method
		{
			System.out.println(j);      //methods and data members must be static elsee we can't access from outer class
			System.out.println("Demo is awsome");

		}
	}
	public static void main(String[] args)
	{
       InnerClass.demo();
	}
}
