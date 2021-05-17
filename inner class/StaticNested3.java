package com.classs.staticnested;

public class StaticNested3
{
	static int k=20;
	int j=25;
	static class Inner1
	{
		public static void main(String [] args)
		{
			System.out.println("Static class main method");
			System.out.println(k);
			//System.out.println(j); //Can't use non-static members from static field
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Outer class main method");

	}
}
