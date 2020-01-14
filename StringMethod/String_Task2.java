package com.StringMethod;

import java.util.Scanner;

//find a particular character is arrived how much times
public class String_Task2
{
	public static void main(String[] args)
	{int count=0;
	String t="Java is awsome and wonderfull for learning";
	int j=t.length();
	Scanner sc=new Scanner(System.in);
	String k=sc.next();
	for(int i=0;i<j;i++)
	{
		if(k.charAt(0)==t.charAt(i))
		{
			count++;
		}

	}
	System.out.println(k+" arrives "+count+" times");
	}
}
