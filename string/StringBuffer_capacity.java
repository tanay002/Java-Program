package com.string;

public class StringBuffer_capacity
{
	
	public static void main(String[] args)
	{ 
		//mutable class
		StringBuffer k=new StringBuffer();
		System.out.println(k.capacity());
		
		k.append("MynameisTanaySaxenaMynameisTanaySaxena");
		System.out.println(k.capacity());
	//////////////////////////////////////////////////////////////
		
		StringBuffer uu=new StringBuffer("Hello");
		System.out.println(uu.capacity());
		
		uu.append("mamaloca12345678");
		System.out.println(uu.capacity());
		
		uu.append("0");
		System.out.println(uu.capacity());
	}
}
