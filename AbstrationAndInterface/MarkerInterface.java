package com.interfacetask;

interface One
{
	
}
class Implemented implements One
{
	
}
public class MarkerInterface 
{
	static void MyFunctionality(Object obj)
	{
		if(obj instanceof One)
		{
			System.out.println("Yes obj of marker interface");
		}
		else
		{
			System.out.println("Not object of marker interface");
		}
	}
	
public static void main(String[] args) 
{
              One m=new Implemented();	
                  MyFunctionality(m);
}
}
