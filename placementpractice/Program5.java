package com.string.placementpractice;

import java.util.Scanner;

public class Program5
{//I am student -> I am tneduts
	public static void main(String[] args) 
	{ char c;
	StringBuffer b=new StringBuffer("");
	String sk=null;
	int s=0;
	System.out.println("Enter String:- ");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	str=str.trim();
	String k[]=str.split(" ");
	int count=k.length;
	for(int i=count-1;;)
	{
		str=k[i];
		System.out.println(str);
		s=str.length();
		s--;
		System.out.println(s);
		while(s!=-1) 
		{
			c=str.charAt(s);
			b.append(c);
			s--;
		}
		sk=new String(b); k[i]=sk;
		break;
	}
	for(int i=0;i<count;i++)
	{
		System.out.print(k[i]+" ");
	}
	}
}
