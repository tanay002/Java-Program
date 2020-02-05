package com.block;

public class IIB_Initialization6
{
	{
		System.out.println("IIB Of public class");
	}
	public static void main(String[] args)
	{ 
		IIB_Initialization6 bc = new IIB_Initialization6();
		Alpha a = new Alpha(10);
	}
}
class Alpha
{
	int i;
	{
		i = 20;
		System.out.println("IIB Of A class");
	}
	Alpha(int j)
	{
		System.out.println(i);
		i = j;
		System.out.println(i);
	}
}