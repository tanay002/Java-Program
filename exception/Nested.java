package com.exception;

import java.util.Scanner;

public class Nested 
{
	public static void main(String[] args) 
	{
		try
		{
			int a[]=new int[5];
			System.out.println("Enter data :");
			Scanner sc=new Scanner(System.in);
			String no1=sc.next();
			String no2=sc.next();

			int no=Integer.parseInt(no1);
			int no22=Integer.parseInt(no2);
			try
			{
				int k=no/no22;
				try
				{

					a[6]=no;
				}
				catch(ArrayIndexOutOfBoundsException e)
				{

					e.printStackTrace();
				}
				System.out.println("Hello Cool");

			}
			catch (ArithmeticException e) 
			{
				e.printStackTrace();
			}
			System.out.println("hello mama");
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		finally
		{
			System.out.println("good");
		}

		System.out.println("hello");
	
	
	try 
	{
		
	} finally {
		System.out.println("wao");
	}
	
	
	}
}
