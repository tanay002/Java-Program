package com.string;

import java.util.Scanner;

public class StringBinary
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Binary String:-  ");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println("Old Binary String:- "+str);
		for(int i=0;i<str.length();i++)
		{
			if(!(str.charAt(i)=='1'||str.charAt(i)=='0'))
			{
				break;
			}
			else
			{
				if(str.charAt(i)=='1')
					str=str.replace(str.charAt(i),'0');
				else
					str=str.replace(str.charAt(i),'1');
			}
		}
		System.out.println("New String:- "+str);

	}
}