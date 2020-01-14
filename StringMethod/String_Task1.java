package com.StringMethod;
//print odd character
public class String_Task1
{
	public static void main(String[] args)
	{
		String t="Java is awsome and wonderfull for learning";
		int j=t.length();
		for(int i=0;i<j;i++)
		{
			if(i%2!=0)
			{
				System.out.print(t.charAt(i));
			}
		}
	}
}
