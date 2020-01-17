package com.concept_basic;

public class Overriding 
{
	public static void main(String[] args)
	{
		Car c;
		c=new Truck();
		c.vehicle();
		c=new Bike();
		c.vehicle();		
	}
}

class Car
{
	void vehicle()
	{
		System.out.println("Gaint");
	}
}


class Truck extends Car
{
	void vehicle()
	{
		System.out.println("Small");
	}
}

class Bike extends Car
{
	void vehicle()
	{
		System.out.println("mini");
	}
}