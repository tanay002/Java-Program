package com.string;

public class StringBuffer_append
{
	
	public static void main(String[] args)
	{ 
		//mutable class
		StringBuffer k=new StringBuffer("Tanay is cool");
		k.append(" and awsome");         //append
		System.out.println(k);     
		
		
		k.append(3);         //append
		System.out.println(k);  
	}
}
