package com.StringMethod;

import java.util.Scanner;

public class String_Task4 
{
	public static void main(String[] args)
	{
		String sb=new String();
		System.out.println("Enter 1's 0's String");
		Scanner sc=new Scanner(System.in);
		sb=sc.next();
		System.out.println("Enter string is:- "+sb);
		char c[]=sb.toCharArray();

		int size=c.length;

		for(int i=0;i<size;i++)
		{
			if(c[i]=='0')
			{
				c[i]='1';	
			}
			else
				c[i]='0';
		}
		
		String op=String.valueOf(c); 
System.out.println("Output of String:- "+op);
	}
}
