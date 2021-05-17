package com.StringMethod;

public class String_Ctask
{
	public static void main(String[] args)
	{
		String s="java is always awsome and cool java can be good to study and java will be quite easy to learn.java"
				+"is awsome language and java is too cool";
		String s1[]=s.split("java");
		String remake="";
		int i=s1.length;
		for(int j=0;j<i;j++)
		{
			remake=remake+s1[j];
		}

		System.out.println(remake);
		
		String kp="javaisawsome";
		char []a=kp.toCharArray();
		int c=a.length;
		String m="";
		for(int f=c-1;f>=0;f--)
		{
			m=m+""+a[f];
		}
	System.out.println(m);
	}
}

