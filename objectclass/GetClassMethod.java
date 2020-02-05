package com.objectclass;

public class GetClassMethod 
{
	public static void main(String[]args)
	{
		Object ob=new String("Tanay");
		Class a=ob.getClass();
		System.out.println(a.getName());
	}
}
