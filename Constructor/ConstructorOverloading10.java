package com.constructor;

import java.util.Scanner;

//We can initialize the private data member of class by setter() method and by constructor

public class ConstructorOverloading10
{ 
	public ConstructorOverloading10()
	{
		System.out.println("Default");
	}
	public ConstructorOverloading10(int i)
	{
		System.out.println("One Parametrized");
	}
	public ConstructorOverloading10(int id,int id2)
	{
		System.out.println("2 Parametrized");
	}
	public ConstructorOverloading10(int id,int id2,int id3)
	{
		System.out.println("3 Parametrized");
	}
	public static void main(String[] args) 
	{  
		System.out.println("\nPress 1:1 Constructor 2:2 Constructor 3:3 Constructor 4: Default");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		ConstructorOverloading10 c=null;
		switch(k)
		{
		case 1:
			c=new ConstructorOverloading10(401);
			break;
		case 2:
			c=new ConstructorOverloading10(401,201);
			break;
		case 3:
			c=new ConstructorOverloading10(10,20,30);
			break;
		case 4:
			c=new ConstructorOverloading10();
			break;
			default: System.out.println("Invalid Choice: ");
			break;
		}
	}
}
