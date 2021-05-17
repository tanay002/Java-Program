package com.p;
public class Motor extends Car
{
	//static
	{

		System.out.println("1");
	}

//	static
	{
		System.out.println("2");
	}

	public static void main(String[] args) 
	{
       Motor m=new Motor();
       System.out.println("End");
       Car c=new Car();
      
	}

}
class Car 
{

	//static
	{
		System.out.println("3");
	}

}
