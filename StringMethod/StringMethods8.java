package com.StringMethod;

public class StringMethods8 
{
	public static void main(String[] args) 
	{//split method
		String s1="This is my code written by Tanay Saxena";
		String s[]=s1.split("is");
		int k=s.length;
		System.out.println(k);
		for(int i=0;i<k;i++)
		{
			System.out.println(s[i]);
		}
		
		String ks[]=s1.split("\\s");
		for(int i=0;i<ks.length;i++)
		{
			System.out.println(ks[i]);
		}
	}
}