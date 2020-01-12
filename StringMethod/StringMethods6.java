package com.StringMethod;

public class StringMethods6 
{
	public static void main(String[] args) 
	{    //lastIndexOf
		String s="This is awsome concepts and java is wonderfull language";
		int size=s.length();
		System.out.println(size);
		int ind=s.lastIndexOf('o');
		System.out.println(ind);

		int k=s.lastIndexOf("ava");
		System.out.println(k);

		System.out.println(s.lastIndexOf('a',35));  //lastIndexOf
		System.out.println(s.lastIndexOf("ja",35));

	}
}
