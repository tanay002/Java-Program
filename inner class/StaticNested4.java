package com.classs.staticnested;

public class StaticNested4
{
	static class Inner1
	{
		public void demo()
		{ 
			System.out.println("Static class demo method");
		}
	}

	public static void main(String[] args) 
	{
		Inner1 i=new Inner1();
		i.demo();
		System.out.println("Outer class main method");

	}
}
