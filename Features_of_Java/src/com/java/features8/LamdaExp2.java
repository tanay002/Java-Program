package com.java.features8;

interface MyInterface3
{
	public int demo2(int i,int j);	
}
public class LamdaExp2 
{
	public static void main(String[] args) 
	{
	
		 MyInterface3 m2=(i,j)->(i+j);
			
			 int g=m2.demo2(10,20);
			 System.out.println(g);
			 
			 //or
			 
			 MyInterface3 m3=(int i,int j)->
			 { 
				 return (i+j);
				 };
		
			 System.out.println(m3.demo2(30,20));
	}
}
