package com.string;

import java.util.StringTokenizer;

public class StringToken 
{
	public static void main(String[] args) 
	{
		StringTokenizer t=new StringTokenizer("This is tanay");
		while(t.hasMoreElements())
		{
			System.out.println(t.nextToken());	
		}
		
		StringTokenizer t1=new StringTokenizer("This,is,good,to,see,you",",");
		while(t1.hasMoreElements())
		{
			System.out.println(t1.nextToken());	
		}
	}
}
