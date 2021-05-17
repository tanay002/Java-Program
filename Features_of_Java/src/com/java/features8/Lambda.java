package com.task;

interface Alphaa
{
public void demo();	
}

public class Lambda 
{
public static void main(String[] args) 
{

	Alphaa l=new Alphaa()
			{
		        public void demo()
		        {
		        	System.out.println("Hello");
		        }
			};
			l.demo();
}
}
