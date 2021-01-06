package com.java.features8.default_static;

interface Vehicle
{
	void repair();
	void sell();
	void buy();
}

interface Bus extends Vehicle
{
	
}
abstract class A implements Vehicle
{  
	
	public void repair()
	{
		System.out.println("Repair");
	}
}
class Car extends A
{
	public void sell() {
	System.out.println("sell");
	}


	public void buy() {
		System.out.println("Buy");
	}
}

class Bike implements Vehicle
{

	@Override
	public void repair() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub

	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub

	}

}
public class DefaultTry2 extends Car
{
	public static void main(String[] args) 
	{

	}
}
