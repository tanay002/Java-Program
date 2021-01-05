package com.java.features8;
interface MyInterface
{
	public void demo();	
	
}

interface MyInterface2
{
	public String demo2(int i);	
}
public class LamdaExp 
{
	public static void main(String[] args) 

	{
		MyInterface m=()->
		{
			System.out.println("Hello is this tanay");	
		};	
		 m.demo();
		 
		 MyInterface2 m2=(ij)->
			{
				
				return "Value is "+ij;
			};	
			 String g=m2.demo2(10);
			 System.out.println(g);
	}
}
